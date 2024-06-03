package tr.gov.ptt.client;

import tr.gov.ptt.dto.AraIslemOutput;
import tr.gov.ptt.dto.Kullanici;
import tr.gov.ptt.dto.output.MutakabatKapatResponse;
import tr.gov.ptt.dto.output.TalimatOutput;
import tr.gov.ptt.dto.request.MutabakatKapatRequest;
import tr.gov.ptt.dto.request.TalimatEkleRequest;
import tr.gov.ptt.dto.request.TalimatSorgulaRequest;
import tr.gov.ptt.dto.response.TurkcellSorguResponse;
import tr.gov.ptt.entity.TalimatEntity;
import tr.gov.ptt.exception.ClientException;
import tr.gov.ptt.util.DateUtil;
import tr.gov.ptt.ws.client.turkcell.CollGW.*;
import tr.gov.ptt.enumeration.Kurum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Slf4j
public class TurkcellClient implements IClient {

    private CollgwInformWebServiceProxy proxyTurkcell;
    
    private static final String TURKCELL_PARA_KODU_TL = "949";
    private static final Integer TURKCELL_BANKID = 1999;

    private static final Integer TURKCELL_ISLEM_KODU_TALIMAT = 49;
    private static final Integer TURKCELL_ISLEM_KODU_TALIMATIPTAL = 50;

    private static int turkcellSirketKodu = 532;

    private static String sessionId;
    

    private void logon() {

        if(sessionId == null || sessionId.isEmpty()) {

            proxyTurkcell = new CollgwInformWebServiceProxy();
            proxyTurkcell.setEndpoint(Kurum.turkcell.getUrl());

            LogonRequest logonRequest = new LogonRequest();
            logonRequest.setBankId(TURKCELL_BANKID);
            logonRequest.setMsgDate(DateUtil.yyyyMMddHHmmss2String());
            logonRequest.setPassword(Kurum.turkcell.getSifre());
            logonRequest.setStan(DateUtil.HHmmss2Integer());

            LogonResponse logonResponse;

            try {
                logonResponse = proxyTurkcell.informWebServiceLogon(logonRequest);

                if (80 <= Integer.parseInt(logonResponse.getRespCode()) && Integer.parseInt(logonResponse.getRespCode()) <= 99) {

                    if (logonResponse.getSessionId() == null || logonResponse.getSessionId().isEmpty()) {
                        log.warn("kurum: {}, session oluşturalamadi", Kurum.turkcell.name());
                        throw new RuntimeException("sessionId oluşturulamadı, işlemi tekrar deneyiniz");
                    }
                }

                log.info("sessionId alma işlemi başarılı");
                sessionId = logonResponse.getSessionId();
            } catch (Exception e) {
                log.warn("sessionId alınamadı: {}",e.getMessage());
                throw new RuntimeException("SessionId alınamadı");
            }


        }

    }

    @Override
    public TalimatOutput sorgula(TalimatSorgulaRequest input) {

        logon();

        BaseInputRequest request = new BaseInputRequest();
        
        request.setQueryKey("GSMNO");
        request.setQueryValue(input.getTelefonNo());
        request.setBankId(TURKCELL_BANKID);
        request.setCompId(turkcellSirketKodu);
        request.setCurr(TURKCELL_PARA_KODU_TL);
        request.setMsgDate(DateUtil.yyyyMMddHHmmss2String());
        request.setSessionId(sessionId);
        request.setStan(generateStan());
        Origin originator = new Origin();
        Kullanici kullanici = input.getKullanici();
        originator.setBranch(kullanici.getSubeId().toString());
        originator.setCity(kullanici.getMerkezId());
        originator.setTeller(kullanici.getGiseNo().toString());
        originator.setUser(kullanici.getKullaniciId().toString());
        request.setOrig(originator);


        SubscriberInfoResponse response;

        try {
            response = proxyTurkcell.getSubscriberInfoByKey(request);
        } catch (Exception e) {
            log.warn("kurum: {}, sunucu hatası yakalandı, telefon: {}", Kurum.turkcell.name(), input.getTelefonNo());
            throw new ClientException("Sunucu hatası yakalandı: "+e.getMessage());
        }

        CustomerInformation info = response.getCustomerInformation();

        if(response.getErrMsg().equals("ok")) {

            Integer talimatDurum = info.getApFound();

            if(talimatDurum == 0) {
                log.info("kurum: {}, talimatı yapılabilir, telefon: {}", Kurum.turkcell.name(), input.getTelefonNo());
                return TalimatOutput.builder().sonuc(true).aciklama("Talimat yapilabilir").detay(TurkcellSorguResponse.builder().adSoyad(response.getName()).build()).build();
            } else if(talimatDurum == 1) {

                Integer talimatliKurum = response.getCustomerInformation().getApCompany();

                if(talimatliKurum == 1999) {
                    log.info("kurum: {}, kurum içi talimatı var, telefon: {}", Kurum.turkcell.name(), input.getTelefonNo());
                    return TalimatOutput.builder().sonuc(false).aciklama("Kurum ici talimat var").build();
                } else {
                    log.info("kurum: {}, başka kurumda talimatı var, telefon: {}", Kurum.turkcell.name(), input.getTelefonNo());
                    return TalimatOutput.builder().sonuc(false).aciklama("Baska kurumda talimat var").build();
                }
            }

        }

        return TalimatOutput.builder().sonuc(false).aciklama("Hata!").build();

    }

    @Override
    public TalimatOutput<?> ekle(TalimatEkleRequest input) {

        logon();

        AutoPaymentRequest request = new AutoPaymentRequest();

        request.setQueryKey("GSMNO");
        request.setQueryValue(input.getTelefonNo());
        request.setBankId(TURKCELL_BANKID);
        request.setCompId(turkcellSirketKodu);
        request.setCurr(TURKCELL_PARA_KODU_TL);
        request.setMsgDate(DateUtil.yyyyMMddHHmmss2String());
        request.setSessionId(sessionId);
        request.setStan(generateStan());

        CustomerInformation customerInformation = new CustomerInformation();
        customerInformation.setApCompany(turkcellSirketKodu);
        customerInformation.setApDate(DateUtil.yyyyMMdd2String());
        customerInformation.setApOrdererName(input.getAdSoyad());
        customerInformation.setBillCycle("1");
        customerInformation.setCreditCardNum(0L);

        request.setCustomerInformation(customerInformation);

        Kullanici kullanici = input.getKullanici();
        Origin originator = new Origin();
        originator.setBranch(kullanici.getSubeId().toString());
        originator.setCity(kullanici.getMerkezId());
        originator.setTeller(kullanici.getGiseNo().toString());
        originator.setUser(kullanici.getKullaniciId().toString());
        request.setOrig(originator);

        BaseOutputResponse response = null;

        try {
            response = proxyTurkcell.giveAutoPaymentOrderByKey(request);
        } catch (Exception e) {
            log.warn("kurum: {}, sunucu hatası yakalandı, telefon: {}", Kurum.turkcell.name(), input.getTelefonNo());
            throw new ClientException("Sunucu hatası yakalandı: "+e.getMessage());
        }

        if(response.getErrMsg().equals("ok")) {
            log.info("kurum: {}, talimat ekle işlemi başarılı, telefon: {}", Kurum.turkcell.name(), input.getTelefonNo());
            return TalimatOutput.builder().sonuc(true).aciklama("Talimat ekle işlemi başarılı").detay(AraIslemOutput.builder().stan(response.getStan()).telefonNo(input.getTelefonNo()).build()).build();
        } else {
            log.warn("kurum: {}, talimat ekle işlemi başarısız, telefon: {}", Kurum.turkcell.name(), input.getTelefonNo());
            return TalimatOutput.builder().sonuc(false).aciklama("işlem başarısız").build();
        }


    }


    @Override
    public TalimatOutput<?> cikar(TalimatEntity input) {

        logon();

        AutoPaymentRequest request = new AutoPaymentRequest();

        request.setQueryKey("GSMNO");
        request.setQueryValue(input.getTelefonNo());
        request.setBankId(TURKCELL_BANKID);
        request.setCompId(turkcellSirketKodu);
        request.setMsgDate(DateUtil.yyyyMMddHHmmss2String());
        request.setSessionId(sessionId);
        request.setCurr(TURKCELL_PARA_KODU_TL);
        request.setStan(generateStan());


        CustomerInformation customerInformation = new CustomerInformation();
        customerInformation.setApCompany(turkcellSirketKodu);
        customerInformation.setApDate(DateUtil.yyyyMMdd2String());
        customerInformation.setApOrdererName(input.getAdSoyad());
        customerInformation.setBillCycle("1");
        customerInformation.setCreditCardNum(0L);

        request.setCustomerInformation(customerInformation);

        Origin originator = new Origin();
        originator.setBranch(input.getSubeId().toString());
        originator.setCity(input.getMerkezId());
        originator.setTeller(input.getGiseNo().toString());
        originator.setUser(input.getKullaniciId().toString());
        request.setOrig(originator);

        BaseOutputResponse response;

        try {
            response = proxyTurkcell.cancelAutoPaymentByKey(request);
        } catch (Exception e) {
            log.warn("kurum: {}, sunucu hatası yakalandı, telefon: {}", Kurum.turkcell.name(), input.getTelefonNo());
            throw new ClientException("Sunucu hatası yakalandı: "+e.getMessage());
        }

        if(response.getErrMsg().equals("ok")) {
            log.info("kurum: {}, sunucu hatası yakalandı, telefon: {}", Kurum.turkcell.name(), input.getTelefonNo());
            return TalimatOutput.builder().sonuc(true).aciklama("Talimat çıkarma işlemi başarılı").detay(AraIslemOutput.builder().stan(Long.valueOf(response.getStan())).telefonNo(input.getTelefonNo()).build()).build();
        } else if(response.getErrMsg().equals("RC-NOT-AUTOMATED-PAYMENT-ERR")) {
            log.warn("kurum: {}, kullanıcının talimatı yok, telefon: {}", Kurum.turkcell.name(), input.getTelefonNo());
            return TalimatOutput.builder().sonuc(true).aciklama("Kullanıcının talimati yok").build();
        } else {
            log.warn("kurum: {}, talimat çıkarma işlemi başarısız, telefon: {}", Kurum.turkcell.name(), input.getTelefonNo());
            return TalimatOutput.builder().sonuc(false).aciklama("Kurum talimat çıkarma işlemi başarısız").build();
        }
    }

    @Override
    public MutakabatKapatResponse mutabakatKapat(MutabakatKapatRequest input) {
        logon();

        int sehirKodu = 6;
        String subeKodu = "3618";
        String giseKodu = "45";
        String kullaniciKodu = "2";

        ReconciliationRequest request = new ReconciliationRequest();

        request.setBankId(TURKCELL_BANKID);
        request.setCompId(turkcellSirketKodu);
        request.setMsgDate(DateUtil.yyyyMMddHHmmss2String());
        request.setSessionId(sessionId);
        request.setCurr(TURKCELL_PARA_KODU_TL);
        request.setStan(generateStan());
        request.setReconCount(2);

        ReconciliationInfo[] mutabakatListe = new ReconciliationInfo[2];

        ReconciliationInfo ekle = new ReconciliationInfo();
        ekle.setTotalProcesCount(input.getEkleAdet());
        ekle.setOpType(TURKCELL_ISLEM_KODU_TALIMAT);

        ReconciliationInfo cikar = new ReconciliationInfo();
        ekle.setTotalProcesCount(input.getCikarAdet());
        ekle.setOpType(TURKCELL_ISLEM_KODU_TALIMATIPTAL);


        mutabakatListe[0] = ekle;
        mutabakatListe[1] = cikar;

        request.setReconInfoList(mutabakatListe);

        request.setAccDate(String.valueOf(input.getTarih()));

        Origin originator = new Origin();
        originator.setBranch(subeKodu);
        originator.setCity(sehirKodu);
        originator.setTeller(giseKodu);
        originator.setUser(kullaniciKodu);
        request.setOrig(originator);

        BaseOutputResponse response;

        try {
            response = proxyTurkcell.sendReconciliation(request);
        } catch (Exception e) {
            throw new ClientException("Sunucu hatası yakalandı: "+e.getMessage());
        }


        if(response.getErrMsg().equals("ok")) {
            return MutakabatKapatResponse.builder().sonuc(true).aciklama("Mutabakat işlemi başarılı").build();
        } else {
            return MutakabatKapatResponse.builder().sonuc(false).aciklama("Mutabakat işlemi başarısız").build();
        }
    }

    public Long generateStan() {

        DateFormat uzun = null;
        String stanstring = "";

        uzun = new SimpleDateFormat("HHmmss");

        Date dateTwo = new Date();
        stanstring = uzun.format(dateTwo);

        StringBuffer sb = new StringBuffer(stanstring);
        sb.deleteCharAt(sb.length() - 1);
        stanstring = sb.toString();

        return Long.parseLong(stanstring);

    }

}
