package tr.gov.ptt.service;

import tr.gov.ptt.dto.CikarDTO;
import tr.gov.ptt.dto.CikarGuncelleDTO;
import tr.gov.ptt.dto.EkleDTO;
import tr.gov.ptt.dto.MutabakatDTO;
import tr.gov.ptt.dto.request.TalimatCikarRequest;
import tr.gov.ptt.dto.request.GenelEkleRequest;
import tr.gov.ptt.entity.TalimatEntity;
import tr.gov.ptt.repository.TurkcellRepository;
import tr.gov.ptt.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static tr.gov.ptt.util.TupleConvert.convertTuple;

@Service
@Slf4j
public class TurkcellService implements IService {


    @Autowired
    private TurkcellRepository turkcellRepository;

    @Override
    public void kaydet(GenelEkleRequest veri) {


        TalimatEntity talimatEntity = new TalimatEntity();
        talimatEntity.setKurum("turkcell");
        talimatEntity.setTelefonNo(veri.getTelefonNo());
        talimatEntity.setAdSoyad(veri.getAdSoyad());
        talimatEntity.setHesapNo(veri.getHesapNo());
        talimatEntity.setIbanNo(veri.getIbanNo());
        talimatEntity.setDurum(0);
        talimatEntity.setTandemDurum(0);


        turkcellRepository.save(talimatEntity);
    }

    @Override
    public void guncelleEkle(EkleDTO veri) {

        Optional<TalimatEntity> entity = turkcellRepository.findByKurumAndTelefonNoAndDurum("turkcell", veri.getTelefonNo(), 0);

        entity.ifPresent(tek -> {
            tek.setDurum(1);
            tek.setTalimatBaslangic(DateUtil.yyyyMMdd2Integer());
            tek.setTahsilatStan(veri.getStan());
            turkcellRepository.save(tek);
        });

    }

    @Override
    public void guncelleCikar(CikarGuncelleDTO veri) {
        Optional<TalimatEntity> entity = turkcellRepository.findByKurumAndTelefonNoAndDurum("turkcell", veri.getTelefonNo(), 1);

        entity.ifPresent(tek -> {
            tek.setDurum(2);
            tek.setTalimatBitis(DateUtil.yyyyMMdd2Integer());
            tek.setIptalStan(veri.getStan());
            turkcellRepository.save(tek);
        });
    }

    @Override
    public CikarDTO getir(TalimatCikarRequest request) throws Exception {

        Optional<TalimatEntity> entity = turkcellRepository.findByKurumAndTelefonNoAndDurum("turkcell", request.getTelefonNo(), 1);

        return entity.map(tek ->
                CikarDTO.builder()
                        .telefonNo(tek.getTelefonNo())
                        .build()
        ).orElseThrow(() -> new RuntimeException("Telefon numarasına dair bilgi getirelemedi"));

    }

    @Override
    public MutabakatDTO mutabakatSorgula(Integer tarih) {
        return convertTuple(turkcellRepository.mutabakatSorgula("turkcell", tarih));
    }
}