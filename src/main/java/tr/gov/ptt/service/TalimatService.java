package tr.gov.ptt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.gov.ptt.dto.AraIslemOutput;
import tr.gov.ptt.entity.TalimatEntity;
import tr.gov.ptt.repository.TalimatRepository;
import tr.gov.ptt.util.DateUtil;

import java.util.List;
import java.util.Optional;

@Service
public class TalimatService {

    @Autowired
    private TalimatRepository talimatRepository;


    public List<TalimatEntity> cikisBelirsizleriGetir() {
        return talimatRepository.findByDurumOrTandemDurum(2, 2);
    }

    public List<TalimatEntity> ekleBelirsizleriGetir() {
        return talimatRepository.findByDurum(4);
    }

    public void durumlariGuncelle(TalimatEntity entity, Integer clientDurum, Integer tandemDurum) {

        entity.setDurum(clientDurum);
        entity.setTandemDurum(tandemDurum);
        talimatRepository.save(entity);

    }

    public void clientDurumGuncelle(TalimatEntity entity, Integer yeniDurum) {

        entity.setDurum(yeniDurum);
        talimatRepository.save(entity);

    }

    public void tandemDurumGuncelle(TalimatEntity entity, Integer yeniDurum) {

        entity.setTandemDurum(yeniDurum);
        talimatRepository.save(entity);

    }

    public Optional<TalimatEntity> aktifTalimatGetir(String telefon) {

        return talimatRepository.findByTelefonNoAndDurum(telefon, 1);

    }

    public void guncelleEkleClient(TalimatEntity entity, Long stan) {

        entity.setDurum(1);
        entity.setTalimatBaslangic(DateUtil.yyyyMMdd2Integer());
        entity.setTahsilatStan(stan);
        talimatRepository.save(entity);

    }


    public void guncelleIptalClient(TalimatEntity entity, Long stan, Integer durum) {
        entity.setDurum(durum);
        entity.setTalimatBitis(DateUtil.yyyyMMdd2Integer());
        entity.setIptalStan(stan);
        talimatRepository.save(entity);

    }


    public void guncelleIptalTandem(TalimatEntity entity) {
        entity.setTandemDurum(3);
        talimatRepository.save(entity);
    }


    public void durumlariIptalBekleyenYap(TalimatEntity entity) {

        entity.setDurum(2);
        entity.setTandemDurum(2);
        talimatRepository.save(entity);

    }


    public boolean bekleyenDurumKontrol(String telefonNo) {

        return talimatRepository.findByTelefonNo(telefonNo).stream().anyMatch(tek -> tek.getDurum() == 4 || tek.getDurum() == 0 || tek.getDurum() == 2 || tek.getTandemDurum() == 0 || tek.getTandemDurum() == 2);

    }

}
