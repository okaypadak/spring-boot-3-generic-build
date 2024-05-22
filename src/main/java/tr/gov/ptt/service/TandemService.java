package tr.gov.ptt.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tr.gov.ptt.dto.Kullanici;
import tr.gov.ptt.dto.request.TalimatCikarRequest;
import tr.gov.ptt.dto.request.TalimatEkleRequest;
import tr.gov.ptt.dto.tandem.PCHListResponse;
import tr.gov.ptt.dto.tandem.RequestObject;
import tr.gov.ptt.dto.tandem.ResponseObject;
import tr.gov.ptt.entity.TalimatEntity;
import tr.gov.ptt.enumeration.Kurum;

@Component
public class TandemService {

    private static final String BASE_URL = "http://localhost:9995/tandemclient/";

    private final RestTemplate restTemplate;

    public TandemService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PCHListResponse getPCHListesi(String pchListesiId) {
        String url = BASE_URL + "pchListesi/" + pchListesiId;
        return restTemplate.getForObject(url, PCHListResponse.class);
    }

    public ResponseObject talimatSorgula(String kurum, String telefonNo) {
        String url = BASE_URL + "talimatSorgula/" + kurum + "/" + telefonNo;
        return restTemplate.getForObject(url, ResponseObject.class);
    }

    public ResponseObject talimatEkle(TalimatEkleRequest input) {
        String url = BASE_URL + "talimatEkle/";
        RequestObject requestObject = new RequestObject();
        requestObject.setKurum(input.getKurum().getKod());
        requestObject.setTelefonNo(input.getTelefonNo());
        requestObject.setHesapNo(input.getHesapNo());
        Kullanici kullanici = input.getKullanici();
        requestObject.setMerkezNo(kullanici.getMerkezId());
        requestObject.setSubeNo(kullanici.getSubeId());
        requestObject.setGiseNo(kullanici.getGiseNo());
        requestObject.setKullaniciId(kullanici.getKullaniciId());
        return restTemplate.postForObject(url, requestObject, ResponseObject.class);
    }

    public ResponseObject talimatCikar(TalimatEntity input) {
        String url = BASE_URL + "talimatCikar/";
        RequestObject requestObject = new RequestObject();
        requestObject.setKurum(Kurum.valueOf(input.getKurum()).getKod());
        requestObject.setTelefonNo(input.getTelefonNo());
        requestObject.setHesapNo(input.getHesapNo());
        requestObject.setMerkezNo(input.getMerkezId());
        requestObject.setSubeNo(input.getSubeId());
        requestObject.setGiseNo(input.getGiseNo());
        requestObject.setKullaniciId(input.getKullaniciId());
        return restTemplate.postForObject(url, requestObject, ResponseObject.class);
    }
}
