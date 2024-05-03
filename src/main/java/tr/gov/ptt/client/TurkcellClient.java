package tr.gov.ptt.client;

import tr.gov.ptt.dto.CikarDTO;
import tr.gov.ptt.dto.output.TalimatOutput;
import tr.gov.ptt.dto.request.MutabakatKapatRequest;
import tr.gov.ptt.dto.request.GenelEkleRequest;
import tr.gov.ptt.dto.request.TalimatSorgulaRequest;
import tr.gov.ptt.util.DateUtil;
import tr.gov.ptt.ws.client.turkcell.CollGW.*;
import tr.gov.ptt.kurulum.Kurum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tr.gov.ptt.ws.client.turkcell.CollGW.*;
import tr.gov.ptt.ws.client.turkcell.CollGW.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Slf4j
public class TurkcellClient implements IClient {

    private CollgwInformWebServiceProxy proxyTurkcell;
    private Kurum kurum;

    private static final String TURKCELL_PARA_KODU_TL = "949";
    private static final Integer TURKCELL_BANKID = 1999;

    private static final Integer TURKCELL_ISLEM_KODU_TALIMAT = 49;
    private static final Integer TURKCELL_ISLEM_KODU_TALIMATIPTAL = 50;

    private static int turkcellSirketKodu = 532;

    private static String sessionId;

    @Override
    public void setKurum(String kurum) {
        this.kurum = Kurum.valueOf(kurum);
    }

    private void logon() throws Exception {

        if(sessionId == null || sessionId.isEmpty()) {

            proxyTurkcell = new CollgwInformWebServiceProxy();
            proxyTurkcell.setEndpoint(kurum.getUrl());

            LogonRequest logonRequest = new LogonRequest();
            logonRequest.setBankId(TURKCELL_BANKID);
            logonRequest.setMsgDate(DateUtil.yyyyMMddHHmmss2String());
            logonRequest.setPassword(kurum.getSifre());
            logonRequest.setStan(10025);

            LogonResponse logonResponse;
            logonResponse = proxyTurkcell.informWebServiceLogon(logonRequest);

            if (80 <= Integer.parseInt(logonResponse.getRespCode()) && Integer.parseInt(logonResponse.getRespCode()) <= 99) {

                if (logonResponse.getSessionId() == null || logonResponse.getSessionId().isEmpty()) {
                    log.warn("kurum: {}, session oluşturalamadi", kurum.name());
                    throw new RuntimeException("sessionId oluşturulamadı, işlemi tekrar deneyiniz");
                }
            }

            sessionId = logonResponse.getSessionId();
        }

    }

    @Override
    public TalimatOutput sorgula(TalimatSorgulaRequest input) throws Exception {

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
        originator.setBranch("6");
        originator.setCity(6);
        originator.setTeller("6");
        originator.setUser("6");
        request.setOrig(originator);

        SubscriberInfoResponse response = proxyTurkcell.getSubscriberInfoByKey(request);
        CustomerInformation info = response.getCustomerInformation();

        if(response.getErrMsg().equals("ok")) {

            Integer talimatDurum = info.getApFound();

            if(talimatDurum == 0) {
                log.info("kurum: {}, talimatı yapılabilir, telefon: {}", kurum.name(), input.getTelefonNo());
                return TalimatOutput.builder().sonuc("00").aciklama("Talimat yapilabilir").build();
            } else if(talimatDurum == 1) {

                Integer talimatliKurum = response.getCustomerInformation().getApCompany();

                if(talimatliKurum == 1999) {
                    log.info("kurum: {}, kurum içi talimatı var, telefon: {}", kurum.name(), input.getTelefonNo());
                    return TalimatOutput.builder().sonuc("01").aciklama("Kurum ici talimat var").build();
                } else {
                    log.info("kurum: {}, başka kurumda talimatı var, telefon: {}", kurum.name(), input.getTelefonNo());
                    return TalimatOutput.builder().sonuc("01").aciklama("Baska kurumda talimat var").build();
                }
            }

        }

        return TalimatOutput.builder().sonuc("01").aciklama("Hata!").build();

    }

    @Override
    public TalimatOutput<?> ekle(GenelEkleRequest input) throws Exception {

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

        Origin originator = new Origin();
        originator.setBranch("6");
        originator.setCity(6);
        originator.setTeller("6");
        originator.setUser("6");
        request.setOrig(originator);

        BaseOutputResponse response = proxyTurkcell.giveAutoPaymentOrderByKey(request);

        if(response.getErrMsg().equals("ok")) {
            log.info("kurum: {}, talimat ekle işlemi başarılı, telefon: {}", kurum.name(), input.getTelefonNo());
            return TalimatOutput.builder().sonuc("00").aciklama("Talimat ekle işlemi başarılı").detay(response).build();
        } else {
            log.warn("kurum: {}, talimat ekle işlemi başarısız, telefon: {}", kurum.name(), input.getTelefonNo());
            return TalimatOutput.builder().sonuc("01").aciklama("işlem başarısız").detay(response).build();
        }


    }


    @Override
    public TalimatOutput<?> cikar(CikarDTO input) throws Exception {

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
        originator.setBranch("6");
        originator.setCity(6);
        originator.setTeller("6");
        originator.setUser("6");
        request.setOrig(originator);

        BaseOutputResponse response = proxyTurkcell.cancelAutoPaymentByKey(request);

        if(response.getErrMsg().equals("ok")) {
            log.info("kurum: {}, sunucu hatası yakalandı, telefon: {}", kurum.name(), input.getTelefonNo());
            return TalimatOutput.builder().sonuc("00").aciklama("Talimat çıkarma işlemi başarılı").build();
        } else if(response.getErrMsg().equals("RC-NOT-AUTOMATED-PAYMENT-ERR")) {
            log.warn("kurum: {}, kullanıcının talimatı yok, telefon: {}", kurum.name(), input.getTelefonNo());
            return TalimatOutput.builder().sonuc("01").aciklama("Kullanıcının talimati yok").build();
        } else {
            log.warn("kurum: {}, talimat çıkarma işlemi başarısız, telefon: {}", kurum.name(), input.getTelefonNo());
            return TalimatOutput.builder().sonuc("01").aciklama("Kurum talimat çıkarma işlemi başarısız").build();
        }
    }

    @Override
    public TalimatOutput<?> mutabakatKapat(MutabakatKapatRequest input) throws Exception {
        logon();

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

        request.setAccDate(input.getTarih());

        Origin originator = new Origin();
        originator.setBranch("6");
        originator.setCity(6);
        originator.setTeller("6");
        originator.setUser("6");
        request.setOrig(originator);


        BaseOutputResponse response = proxyTurkcell.sendReconciliation(request);


        if(response.getErrMsg().equals("ok")) {
            return TalimatOutput.builder().sonuc("00").aciklama("Mutabakat işlemi başarılı").build();
        } else {
            return TalimatOutput.builder().sonuc("01").aciklama("Mutabakat işlemi başarısız").build();
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
