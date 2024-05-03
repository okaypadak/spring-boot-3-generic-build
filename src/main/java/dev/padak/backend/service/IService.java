package dev.padak.backend.service;

import dev.padak.backend.dto.CikarDTO;
import dev.padak.backend.dto.CikarGuncelleDTO;
import dev.padak.backend.dto.EkleDTO;
import dev.padak.backend.dto.MutabakatDTO;
import dev.padak.backend.dto.request.TalimatCikarRequest;
import dev.padak.backend.dto.request.TalimatEkleRequest;

public interface IService {

    void kaydet (TalimatEkleRequest veri);

    void guncelleEkle(EkleDTO veri);

    void guncelleCikar(CikarGuncelleDTO veri);

    CikarDTO getir(TalimatCikarRequest veri) throws Exception;

    MutabakatDTO mutabakatSorgula(Integer tarih);
}
