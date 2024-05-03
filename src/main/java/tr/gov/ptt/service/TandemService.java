package tr.gov.ptt.service;

import tr.gov.ptt.dto.tandem.TandemDetay;
import tr.gov.ptt.dto.tandem.TandemDetayResponse;
import org.springframework.stereotype.Component;

@Component
public class TandemService {

    public TandemDetayResponse tandemPchListesi(Object hvkno){
        // TANDEME GİT PÇH'LARI AL
        //Örnek veri
        TandemDetayResponse response = new TandemDetayResponse();

        TandemDetay[] tandemDetays = new TandemDetay[1];

        TandemDetay tandemDetay = new TandemDetay();
        tandemDetay.setIbanno("1");
        tandemDetay.setHesapno("1");
        tandemDetay.setAdSoyad("1");

        tandemDetays[0] = tandemDetay;

        response.setHesaplar(tandemDetays);

        return response;
    }

    public Object cikarTalimat(Object veri) {



        return null;
    }
}
