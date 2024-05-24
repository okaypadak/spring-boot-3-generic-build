package tr.gov.ptt.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import tr.gov.ptt.dto.AccessToken;
import tr.gov.ptt.dto.AraIslemOutput;
import tr.gov.ptt.dto.CachedToken;
import tr.gov.ptt.dto.Kullanici;
import tr.gov.ptt.dto.output.TalimatOutput;
import tr.gov.ptt.dto.request.MutabakatKapatRequest;
import tr.gov.ptt.dto.request.TalimatEkleRequest;
import tr.gov.ptt.dto.request.TalimatSorgulaRequest;
import tr.gov.ptt.dto.response.VodafoneResponse;
import tr.gov.ptt.dto.vodafone.*;
import tr.gov.ptt.entity.TalimatEntity;
import tr.gov.ptt.enumeration.Kurum;
import tr.gov.ptt.exception.ClientException;
import tr.gov.ptt.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;


@Component
@Slf4j
public class VodafoneClient implements IClient {


    private Kurum kurum;
    private final int InstitutionId 		= 1762;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    ObjectMapper objectMapper;

    private static final String TOKEN_URL = "https://pttwsint.ptt.gov.tr/pttbank/vodafone/oauth/token";
    private static final String CLIENT_ID = "Ptt";
    private static final ConcurrentHashMap<String, CachedToken> tokenCache = new ConcurrentHashMap<>();



    @Override
    public TalimatOutput<?> sorgula(TalimatSorgulaRequest input) {

        SorguInput requestBody = new SorguInput();
        requestBody.setCompanyId(542);
        requestBody.setInstitutionId(InstitutionId);
        requestBody.setTransactionDate(LocalDateTime.now());
        requestBody.setStan(generateStan());
        requestBody.setMsisdn(input.getTelefonNo());
        requestBody.setCustomerCode("PTT");
        requestBody.setCustomerReferenceType("MSISDN");
        requestBody.setDescription("Otomatik Ödeme Talimat Sorgulama");
        OriginatorInfo originatorInfo = new OriginatorInfo();
        Kullanici kullanici = input.getKullanici();
        originatorInfo.setCity(kullanici.getMerkezId());
        originatorInfo.setBranch(kullanici.getSubeId().toString());
        originatorInfo.setTeller(kullanici.getGiseNo().toString());
        originatorInfo.setUser(kullanici.getKullaniciId().toString());
        requestBody.setOriginatorInfo(originatorInfo);
        requestBody.setNameSurname(input.getAdSoyad());

        HttpEntity<SorguInput> requestEntity = new HttpEntity<>(requestBody,getToken());

        ResponseEntity<SorguOutput> response = null;

        try {
            response = restTemplate.exchange(Kurum.vodafone.getUrl()+"/automatedPostpaid/", HttpMethod.POST, requestEntity, SorguOutput.class);
        } catch (HttpClientErrorException e) {

            VodafoneResponse responseOther;

            try {
                responseOther = objectMapper.readValue(e.getResponseBodyAsString(), VodafoneResponse.class);
            }catch (Exception mapperEx) {
                throw new RuntimeException(mapperEx.getMessage());
            }

            log.warn("kurum: {}, telefon: {}, HTTP Client Hatası: {}", kurum, input.getTelefonNo(), e.getMessage());

            if (e.getStatusCode().equals(HttpStatus.BAD_REQUEST)) {

                switch (responseOther.getResponseCode()) {
                    case "ORAP-1003" -> {
                        return TalimatOutput.<VodafoneResponse>builder()
                                .sonuc(true)
                                .aciklama("Talimat yapılabilir")
                                .build();
                    }

                    case "ORAP-1005" -> {
                        return TalimatOutput.<VodafoneResponse>builder()
                                .sonuc(false)
                                .aciklama("Aynı veya farklı kurumdan talimat girişi mevcut")
                                .build();
                    }

                    case "ORAP-1002" -> {
                        return TalimatOutput.<VodafoneResponse>builder()
                                .sonuc(false)
                                .aciklama("Farklı kurumdan talimat girişi mevcut")
                                .build();
                    }

                    case "ORAP-1001" -> {
                        return TalimatOutput.<VodafoneResponse>builder()
                                .sonuc(false)
                                .aciklama("Aynı kurumdan talimat girişi mevcut")
                                .build();
                    }
                }

            }

        }

        assert response != null;
        if (Objects.requireNonNull(response.getBody()).getResponseCode().equals("0000")) {

            log.info("kurum: {}, talimat yapılabilir, telefon: {}", Kurum.vodafone.name(), input.getTelefonNo());

            return TalimatOutput.<SorguOutput>builder()
                    .sonuc(true)
                    .aciklama("Aynı kurumdan talimat girişi mevcut")
                    .detay(null)
                    .build();

        } else {
            return TalimatOutput.<SorguOutput>builder()
                    .sonuc(false)
                    .aciklama("Talimat sorgu hatalı!")
                    .detay(null)
                    .build();
        }
    }

    @Override
    public TalimatOutput<?> ekle(TalimatEkleRequest input) {

        EkleInput requestBody = new EkleInput();
        requestBody.setCompanyId(542);
        requestBody.setInstitutionId(InstitutionId);
        requestBody.setTransactionDate(LocalDateTime.now());
        requestBody.setStan(generateStan());
        requestBody.setMsisdn(input.getTelefonNo());
        requestBody.setCustomerCode("PTT");
        requestBody.setCustomerReferenceType("MSISDN");
        requestBody.setDescription("Otomatik Ödeme Talimatı");
        OriginatorInfo originatorInfo = new OriginatorInfo();
        Kullanici kullanici = input.getKullanici();
        originatorInfo.setCity(kullanici.getMerkezId());
        originatorInfo.setBranch(kullanici.getSubeId().toString());
        originatorInfo.setTeller(kullanici.getGiseNo().toString());
        originatorInfo.setUser(kullanici.getKullaniciId().toString());
        requestBody.setOriginatorInfo(originatorInfo);
        requestBody.setAcceptanceDate(LocalDateTime.now());
        requestBody.setNameSurname(input.getAdSoyad());

        HttpEntity<EkleInput> requestEntity = new HttpEntity<>(requestBody,getToken());
        ResponseEntity<EkleOutput> response = null;

        try {
            response = restTemplate.exchange(Kurum.vodafone.getUrl()+"/automatedPostpaid/create", HttpMethod.POST, requestEntity, EkleOutput.class);
        } catch (HttpClientErrorException e) {

            VodafoneResponse responseOther;

            try {
                responseOther = objectMapper.readValue(e.getResponseBodyAsString(), VodafoneResponse.class);
            } catch (Exception ex) {
                throw new RuntimeException(ex.getMessage());
            }

            if (e.getStatusCode().equals(HttpStatus.BAD_REQUEST)) {

                switch (responseOther.getResponseCode()) {

                    case "ORAP-1005" -> {
                        return TalimatOutput.<VodafoneResponse>builder()
                                .sonuc(false)
                                .aciklama("Aynı veya farklı kurumdan talimat girişi mevcut")
                                .build();
                    }

                    case "ORAP-1002" -> {
                        return TalimatOutput.<VodafoneResponse>builder()
                                .sonuc(false)
                                .aciklama("Farklı kurumdan talimat girişi mevcut")
                                .build();
                    }

                    case "ORAP-1001" -> {
                        return TalimatOutput.<VodafoneResponse>builder()
                                .sonuc(false)
                                .aciklama("Aynı kurumdan talimat girişi mevcut")
                                .build();
                    }

                    default -> {
                        return TalimatOutput.<VodafoneResponse>builder()
                                .sonuc(false)
                                .aciklama("Bilinmeyen hata")
                                .build();
                    }
                }

            }
        } catch (Exception e) {
            log.warn("kurum: {}, sunucu hatası yakalandı, telefon: {}", Kurum.vodafone.name(), input.getTelefonNo());
            throw new ClientException("Sunucu hatası yakalandı: "+e.getMessage());
        }

        if (Objects.requireNonNull(response.getBody()).getResponseCode().equals("0000")) {

            return TalimatOutput.builder().sonuc(true).aciklama("Talimat ekle işlemi başarılı").detay(AraIslemOutput.builder().stan(null).telefonNo(input.getTelefonNo()).build()).build();

        } else {
            return TalimatOutput.<EkleOutput>builder()
                    .sonuc(false)
                    .aciklama("Talimat ekle hatalı!")
                    .build();
        }

    }

    @Override
    public TalimatOutput<?> cikar(TalimatEntity input) {

        CikarInput requestBody = new CikarInput();
        requestBody.setCompanyId(542);
        requestBody.setInstitutionId(InstitutionId);
        requestBody.setTransactionDate(LocalDateTime.now());
        requestBody.setStan(generateStan());
        requestBody.setMsisdn(input.getTelefonNo());
        requestBody.setCustomerCode("PTT");
        requestBody.setCustomerReferenceType("MSISDN");
        requestBody.setDescription("Otomatik Ödeme Talimat Silme");
        OriginatorInfo originatorInfo = new OriginatorInfo();
        originatorInfo.setCity(input.getMerkezId());
        originatorInfo.setBranch(String.valueOf(input.getSubeId()));
        originatorInfo.setTeller(String.valueOf(input.getGiseNo()));
        originatorInfo.setUser(String.valueOf(input.getKullaniciId()));
        requestBody.setOriginatorInfo(originatorInfo);
        requestBody.setAcceptanceDate(DateUtil.yyyyMMdd2LocalDateTime(input.getTalimatBaslangic()));


        HttpEntity<CikarInput> requestEntity = new HttpEntity<>(requestBody, getToken());
        ResponseEntity<CikarOutput> response = null;

        try {
            response = restTemplate.exchange(Kurum.vodafone.getUrl()+"/automatedPostpaid/delete", HttpMethod.POST, requestEntity, CikarOutput.class);
        } catch (HttpClientErrorException e) {

            VodafoneResponse responseOther;

            try {
                responseOther = objectMapper.readValue(e.getResponseBodyAsString(), VodafoneResponse.class);
            } catch (Exception ex) {
                throw new RuntimeException(ex.getMessage());
            }

            if (e.getStatusCode().equals(HttpStatus.BAD_REQUEST)) {

                switch (responseOther.getResponseCode()) {

                    case "ORAP-1005" -> {
                        return TalimatOutput.<VodafoneResponse>builder()
                                .sonuc(false)
                                .aciklama("Aynı veya farklı kurumdan talimat girişi mevcut")
                                .build();
                    }

                    case "ORAP-1002" -> {
                        return TalimatOutput.<VodafoneResponse>builder()
                                .sonuc(false)
                                .aciklama("Farklı kurumdan talimat girişi mevcut")
                                .build();
                    }

                    case "ORAP-1001" -> {
                        return TalimatOutput.<VodafoneResponse>builder()
                                .sonuc(false)
                                .aciklama("Aynı kurumdan talimat girişi mevcut")
                                .build();
                    }

                    default -> {
                        return TalimatOutput.<VodafoneResponse>builder()
                                .sonuc(false)
                                .aciklama("Bilinmeyen hata")
                                .build();
                    }
                }

            }
        } catch (Exception e) {
            log.warn("kurum: {}, sunucu hatası yakalandı, telefon: {}", Kurum.vodafone.name(), input.getTelefonNo());
            throw new ClientException("Sunucu hatası yakalandı: "+e.getMessage());
        }

        if (Objects.requireNonNull(response.getBody()).getResponseCode().equals("0000")) {

            return TalimatOutput.builder().sonuc(true).aciklama("Talimat çıkar işlemi başarılı").detay(AraIslemOutput.builder().stan(null).telefonNo(input.getTelefonNo()).build()).build();

        } else {
            return TalimatOutput.<EkleOutput>builder()
                    .sonuc(false)
                    .aciklama("Talimat ekle hatalı!")
                    .build();
        }
    }

    @Override
    public TalimatOutput mutabakatKapat(MutabakatKapatRequest input) {

        MutabakatInput requestBody = new MutabakatInput();
        requestBody.setCompanyId(542);
        requestBody.setInstitutionId(InstitutionId);
        requestBody.setTransactionDate(LocalDateTime.now());
        requestBody.setStan(generateStan());
        requestBody.setIpAddress("192.168.158.148");
        requestBody.setDescription("Otomatik Ödeme Talimat Mutabakat");
        OriginatorInfo originatorInfo = new OriginatorInfo();
        originatorInfo.setCity(6);
        originatorInfo.setBranch("6");
        originatorInfo.setTeller("6");
        originatorInfo.setUser("1");
        requestBody.setOriginatorInfo(originatorInfo);
        requestBody.setReconDate(DateUtil.yyyyMMdd2String());


        ReconData ekle = new ReconData();
        ekle.setType("");
        ekle.setQuantity(input.getEkleAdet());

        ReconData cikar = new ReconData();
        cikar.setType("");
        cikar.setQuantity(input.getCikarAdet());

        List<ReconData> reconDataList = new ArrayList<>();
        reconDataList.add(ekle);
        reconDataList.add(cikar);

        requestBody.setReconDataList(reconDataList);

        HttpEntity<MutabakatInput> requestEntity = new HttpEntity<>(requestBody);

        ResponseEntity<CikarOutput> response = null;

        try {
            response = restTemplate.exchange(Kurum.vodafone.getUrl()+"/recon", HttpMethod.POST, requestEntity, CikarOutput.class);
        } catch (Exception e) {

            throw new ClientException("Sunucu hatası yakalandı: "+e.getMessage());
        }

        if (Objects.requireNonNull(response.getBody()).getResponseCode().equals("0000")) {

            return TalimatOutput.<CikarOutput>builder()
                    .sonuc(true)
                    .aciklama("Talimat çıkar başarılı")
                    .detay(response.getBody())
                    .build();

        } else {
            return TalimatOutput.<CikarOutput>builder()
                    .sonuc(false)
                    .aciklama("Talimat çıkar hatalı!")
                    .detay(null)
                    .build();
        }
    }


    private Integer generateStan() {

        DateFormat uzun = null;
        String stanstring = "";

        uzun = new SimpleDateFormat("HHmmss");

        Date dateTwo = new Date();
        stanstring = uzun.format(dateTwo);

        StringBuffer sb = new StringBuffer(stanstring);
        sb.deleteCharAt(sb.length() - 1);
        stanstring = sb.toString();

        return Integer.valueOf(stanstring);

    }

    private static HttpHeaders getToken() {
        String cacheKey = CLIENT_ID;

        CachedToken cachedToken = tokenCache.get(cacheKey);
        if (cachedToken != null && !cachedToken.isExpired()) {
            return createTokenHeaders(cachedToken.getToken());
        }

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        String requestBody = "grant_type=client_credentials&client_id=" + CLIENT_ID;

        HttpEntity<String> request = new HttpEntity<>(requestBody, headers);
        ResponseEntity<AccessToken> response = new RestTemplate().postForEntity(TOKEN_URL, request, AccessToken.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            String newToken = Objects.requireNonNull(response.getBody()).getAccess_token();
            long expiresIn = response.getBody().getExpires_in();

            // Cache the new token
            cachedToken = new CachedToken(newToken, expiresIn);
            tokenCache.put(cacheKey, cachedToken);

            return createTokenHeaders(newToken);
        } else {
            log.warn("Token alma işlemi başarısız oldu. Durum kodu: " + response.getStatusCodeValue());
            return null;
        }
    }

    private static HttpHeaders createTokenHeaders(String token) {
        HttpHeaders tokenHeaders = new HttpHeaders();
        tokenHeaders.set("Authorization", "Bearer " + token);
        tokenHeaders.setContentType(MediaType.APPLICATION_JSON);
        return tokenHeaders;
    }

}
