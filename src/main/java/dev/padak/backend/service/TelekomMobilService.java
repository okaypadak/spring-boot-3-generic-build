package dev.padak.backend.service;

import dev.padak.backend.dto.CikarDTO;
import dev.padak.backend.dto.CikarGuncelleDTO;
import dev.padak.backend.dto.EkleDTO;
import dev.padak.backend.dto.MutabakatDTO;
import dev.padak.backend.dto.request.TalimatCikarRequest;
import dev.padak.backend.dto.request.TalimatEkleRequest;
import dev.padak.backend.entity.TalimatEntity;
import dev.padak.backend.repository.TelekomMobilRepository;
import dev.padak.backend.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static dev.padak.backend.util.TupleConvert.convertTuple;

@Service
public class TelekomMobilService implements IService {


    @Autowired
    private TelekomMobilRepository telekomMobilRepository;

    @Override
    public void kaydet(TalimatEkleRequest veri) {


        TalimatEntity talimatEntity = new TalimatEntity();
        talimatEntity.setKurum("telekomMobil");
        talimatEntity.setTelefonNo(veri.getTelefonNo());
        talimatEntity.setAdSoyad(veri.getAdSoyad());
        talimatEntity.setHesapNo(veri.getHesapNo());
        talimatEntity.setHesapId(veri.getHesapId());
        talimatEntity.setIbanNo(veri.getIbanNo());
        talimatEntity.setDurum(0);
        talimatEntity.setTandemDurum(0);


        telekomMobilRepository.save(talimatEntity);
    }

    @Override
    public void guncelleEkle(EkleDTO veri) {

        Optional<TalimatEntity> entity = telekomMobilRepository.findByKurumAndTelefonNoAndDurum("telekomMobil", veri.getTelefonNo(), 0);

        entity.ifPresent(tek -> {
            tek.setDurum(1);
            tek.setTalimatBaslangic(DateUtil.yyyyMMdd2Integer());
            tek.setTahsilatStan(veri.getStan());
            telekomMobilRepository.save(tek);
        });

    }

    @Override
    public void guncelleCikar(CikarGuncelleDTO veri) {
        Optional<TalimatEntity> entity = telekomMobilRepository.findByKurumAndTelefonNoAndDurum("telekomMobil", veri.getTelefonNo(), 1);

        entity.ifPresent(tek -> {
            tek.setDurum(2);
            tek.setTalimatBitis(DateUtil.yyyyMMdd2Integer());
            tek.setIptalStan(veri.getStan());
            telekomMobilRepository.save(tek);
        });
    }

    @Override
    public CikarDTO getir(TalimatCikarRequest request) throws Exception {

        Optional<TalimatEntity> entity = telekomMobilRepository.findByKurumAndTelefonNoAndDurum("telekomMobil", request.getTelefonNo(), 1);

        return entity.map(tek ->
                CikarDTO.builder()
                        .telefonNo(tek.getTelefonNo())
                        .hesapId(tek.getHesapId())
                        .build()
        ).orElseThrow(() -> new RuntimeException("Telefon numarasına dair bilgi getirelemedi"));

    }

    @Override
    public MutabakatDTO mutabakatSorgula(Integer tarih) {
        return convertTuple(telekomMobilRepository.mutabakatSorgula("telekomMobil", tarih));
    }
}
