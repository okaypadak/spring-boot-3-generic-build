package dev.padak.backend.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.padak.backend.dto.AccessToken;
import dev.padak.backend.dto.CikarDTO;
import dev.padak.backend.dto.output.TalimatOutput;
import dev.padak.backend.dto.request.MutabakatKapatRequest;
import dev.padak.backend.dto.request.TalimatEkleRequest;
import dev.padak.backend.dto.request.TalimatSorgulaRequest;
import dev.padak.backend.dto.response.VodafoneResponse;
import dev.padak.backend.dto.vodafone.*;
import dev.padak.backend.kurulum.Kurum;
import dev.padak.backend.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestClientException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Component
@Slf4j
public class VodafoneClient implements IClient {

    private Kurum kurum;
    private final int InstitutionId 		= 1762;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public void setKurum(String kurum) {
        this.kurum = Kurum.valueOf(kurum);
    }

    @Override
    public TalimatOutput<?> sorgula(TalimatSorgulaRequest input) throws Exception {

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
        originatorInfo.setCity(6);
        originatorInfo.setBranch("6");
        originatorInfo.setTeller("6");
        originatorInfo.setUser("1");
        requestBody.setOriginatorInfo(originatorInfo);
        requestBody.setNameSurname(input.getAdSoyad());

        HttpEntity<SorguInput> requestEntity = new HttpEntity<>(requestBody,getToken());

        ResponseEntity<SorguOutput> response = null;

        try {
            response = restTemplate.exchange(kurum.getUrl()+"/automatedPostpaid/", HttpMethod.POST, requestEntity, SorguOutput.class);
        } catch (HttpClientErrorException e) {

            VodafoneResponse responseOther = objectMapper.readValue(e.getResponseBodyAsString(), VodafoneResponse.class);

            log.warn("kurum: {}, telefon: {}, HTTP Client Hatası: {}", kurum, input.getTelefonNo(), e.getMessage());

            if (e.getStatusCode().equals(HttpStatus.BAD_REQUEST)) {

                switch (responseOther.getResponseCode()) {
                    case "ORAP-1003" -> {
                        return TalimatOutput.<VodafoneResponse>builder()
                                .sonuc("00")
                                .aciklama("Talimat yapılabilir")
                                .detay(null)
                                .build();
                    }
                    case "ORAP-1002" -> {
                        return TalimatOutput.<VodafoneResponse>builder()
                                .sonuc("01")
                                .aciklama("Farklı kurumdan talimat girişi mevcut")
                                .detay(null)
                                .build();
                    }
                    case "ORAP-1001" -> {
                        return TalimatOutput.<VodafoneResponse>builder()
                                .sonuc("01")
                                .aciklama("Aynı kurumdan talimat girişi mevcut")
                                .detay(null)
                                .build();
                    }
                }

            }

        }

        assert response != null;
        if (Objects.requireNonNull(response.getBody()).getResponseCode().equals("0000")) {

            log.info("kurum: {}, talimat yapılabilir, telefon: {}", kurum.name(), input.getTelefonNo());

            return TalimatOutput.<SorguOutput>builder()
                    .sonuc("00")
                    .aciklama("Aynı kurumdan talimat girişi mevcut")
                    .detay(null)
                    .build();

        } else {
            return TalimatOutput.<SorguOutput>builder()
                    .sonuc("01")
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
        originatorInfo.setCity(6);
        originatorInfo.setBranch("6");
        originatorInfo.setTeller("6");
        originatorInfo.setUser("1");
        requestBody.setOriginatorInfo(originatorInfo);
        requestBody.setAcceptanceDate(LocalDateTime.now());
        requestBody.setNameSurname(input.getAdSoyad());


        HttpEntity<EkleInput> requestEntity = new HttpEntity<>(requestBody);


        ResponseEntity<EkleOutput> response = null;

        try {
            response = restTemplate.exchange(kurum.getUrl()+"/automatedPostpaid/create", HttpMethod.POST, requestEntity, EkleOutput.class);
            // İşlemler devam eder...
        } catch (HttpClientErrorException e) {
            // HTTP isteğiyle ilgili istisnaları işle
            log.warn("kurum: {}, telefon: {}, HTTP Client Hatası: {}", kurum, input.getTelefonNo(), e.getMessage());
            throw new RuntimeException(e.getMessage());
        } catch (HttpServerErrorException e) {
            // Sunucu tarafındaki HTTP hatalarını işle
            log.warn("kurum: {}, telefon: {}, HTTP Sunucu Hatası: {}", kurum, input.getTelefonNo(), e.getMessage());
            throw new RuntimeException(e.getMessage());
        } catch (RestClientException e) {
            // Genel Rest istisnalarını işle
            log.warn("kurum: {}, telefon: {}, Rest Hatası: {}", kurum, input.getTelefonNo(), e.getMessage());
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            // Diğer tüm istisnaları işle
            log.warn("kurum: {}, telefon: {}, Bilinmeyen Hata: {}", kurum, input.getTelefonNo(), e.getMessage());
            throw new RuntimeException(e.getMessage());
        }

        if (Objects.requireNonNull(response.getBody()).getResponseCode().equals("0000")) {

            return TalimatOutput.<EkleOutput>builder()
                    .sonuc("00")
                    .aciklama("Talimat ekle başarılı")
                    .detay(response.getBody())
                    .build();

        } else {
            return TalimatOutput.<EkleOutput>builder()
                    .sonuc("01")
                    .aciklama("Talimat ekle hatalı!")
                    .detay(null)
                    .build();
        }
    }

    @Override
    public TalimatOutput<?> cikar(CikarDTO input) {

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
        originatorInfo.setCity(6);
        originatorInfo.setBranch("6");
        originatorInfo.setTeller("6");
        originatorInfo.setUser("1");
        requestBody.setOriginatorInfo(originatorInfo);
        requestBody.setAcceptanceDate(input.getTalimatTarihi());


        HttpEntity<CikarInput> requestEntity = new HttpEntity<>(requestBody);
        ResponseEntity<CikarOutput> response = null;

        try {
            response = restTemplate.exchange(kurum.getUrl()+"/automatedPostpaid/delete", HttpMethod.POST, requestEntity, CikarOutput.class);
            // İşlemler devam eder...
        } catch (HttpClientErrorException e) {
            // HTTP isteğiyle ilgili istisnaları işle
            log.warn("kurum: {}, telefon: {}, HTTP Client Hatası: {}", kurum, input.getTelefonNo(), e.getMessage());
            throw new RuntimeException(e.getMessage());
        } catch (HttpServerErrorException e) {
            // Sunucu tarafındaki HTTP hatalarını işle
            log.warn("kurum: {}, telefon: {}, HTTP Sunucu Hatası: {}", kurum, input.getTelefonNo(), e.getMessage());
            throw new RuntimeException(e.getMessage());
        } catch (RestClientException e) {
            // Genel Rest istisnalarını işle
            log.warn("kurum: {}, telefon: {}, Rest Hatası: {}", kurum, input.getTelefonNo(), e.getMessage());
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            // Diğer tüm istisnaları işle
            log.warn("kurum: {}, telefon: {}, Bilinmeyen Hata: {}", kurum, input.getTelefonNo(), e.getMessage());
            throw new RuntimeException(e.getMessage());
        }

        if (Objects.requireNonNull(response.getBody()).getResponseCode().equals("0000")) {

            return TalimatOutput.<CikarOutput>builder()
                    .sonuc("00")
                    .aciklama("Talimat çıkar başarılı")
                    .detay(response.getBody())
                    .build();

        } else {
            return TalimatOutput.<CikarOutput>builder()
                    .sonuc("01")
                    .aciklama("Talimat çıkar hatalı!")
                    .detay(null)
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
            response = restTemplate.exchange(kurum.getUrl()+"/recon", HttpMethod.POST, requestEntity, CikarOutput.class);
            // İşlemler devam eder...
        } catch (HttpClientErrorException e) {
            // HTTP isteğiyle ilgili istisnaları işle
            log.warn("kurum: {}, mutabakat tarih: {}, HTTP Client Hatası: {}", kurum, input, e.getMessage());
            throw new RuntimeException(e.getMessage());
        } catch (HttpServerErrorException e) {
            // Sunucu tarafındaki HTTP hatalarını işle
            log.warn("kurum: {}, mutabakat tarih: {}, HTTP Sunucu Hatası: {}", kurum, input, e.getMessage());
            throw new RuntimeException(e.getMessage());
        } catch (RestClientException e) {
            // Genel Rest istisnalarını işle
            log.warn("kurum: {}, mutabakat tarih: {}, Rest Hatası: {}", kurum, input, e.getMessage());
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            // Diğer tüm istisnaları işle
            log.warn("kurum: {}, mutabakat tarih: {}, Bilinmeyen Hata: {}", kurum, input, e.getMessage());
            throw new RuntimeException(e.getMessage());
        }

        if (Objects.requireNonNull(response.getBody()).getResponseCode().equals("0000")) {

            return TalimatOutput.<CikarOutput>builder()
                    .sonuc("00")
                    .aciklama("Talimat çıkar başarılı")
                    .detay(response.getBody())
                    .build();

        } else {
            return TalimatOutput.<CikarOutput>builder()
                    .sonuc("01")
                    .aciklama("Talimat çıkar hatalı!")
                    .detay(null)
                    .build();
        }
    }


    public Integer generateStan() {

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

    public static HttpHeaders getToken() {

        String tokenUrl = "https://pttwsint.ptt.gov.tr/pttbank/vodafone/oauth/token";
        String clientId = "Ptt";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        String requestBody = "grant_type=client_credentials&client_id=" + clientId;

        HttpEntity<String> request = new HttpEntity<>(requestBody, headers);

        ResponseEntity<AccessToken> response = new RestTemplate().postForEntity(tokenUrl, request, AccessToken.class);

        if (response.getStatusCode() == HttpStatus.OK) {

            HttpHeaders tokenHeaders = new HttpHeaders();
            tokenHeaders.set("Authorization", "Bearer " + Objects.requireNonNull(response.getBody()).getAccess_token());
            tokenHeaders.setContentType(MediaType.APPLICATION_JSON);

            return tokenHeaders;
        } else {
            System.out.println("Token alma işlemi başarısız oldu. Durum kodu: " + response.getStatusCodeValue());
            return null;
        }
    }

}
