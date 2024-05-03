package tr.gov.ptt.service;

import tr.gov.ptt.dto.CikarDTO;
import tr.gov.ptt.dto.CikarGuncelleDTO;
import tr.gov.ptt.dto.EkleDTO;
import tr.gov.ptt.dto.MutabakatDTO;
import tr.gov.ptt.dto.request.TalimatCikarRequest;
import tr.gov.ptt.dto.request.GenelEkleRequest;

public interface IService {

    void kaydet (GenelEkleRequest veri);

    void guncelleEkle(EkleDTO veri);

    void guncelleCikar(CikarGuncelleDTO veri);

    CikarDTO getir(TalimatCikarRequest veri) throws Exception;

    MutabakatDTO mutabakatSorgula(Integer tarih);
}
