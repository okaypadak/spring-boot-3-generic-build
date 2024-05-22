package tr.gov.ptt.service;

import tr.gov.ptt.dto.Kullanici;
import tr.gov.ptt.dto.MutabakatDTO;
import tr.gov.ptt.dto.request.TalimatEkleRequest;
import tr.gov.ptt.entity.TalimatEntity;

public interface IService {

    TalimatEntity kaydet (TalimatEkleRequest veri);

    MutabakatDTO mutabakatSorgula(Integer tarih);
}
