package tr.gov.ptt.service;

import lombok.extern.slf4j.Slf4j;
import tr.gov.ptt.dto.Kullanici;
import tr.gov.ptt.dto.MutabakatDTO;
import tr.gov.ptt.dto.request.TalimatEkleRequest;
import tr.gov.ptt.entity.TalimatEntity;
import tr.gov.ptt.repository.TalimatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static tr.gov.ptt.util.TupleConvert.convertTuple;

@Service
@Slf4j
public class TelekomMobilService implements IService {


    @Autowired
    private TalimatRepository talimatRepository;

    @Override
    public TalimatEntity kaydet(TalimatEkleRequest veri) {

        TalimatEntity talimatEntity = new TalimatEntity();
        talimatEntity.setKurum("telekomMobil");
        talimatEntity.setTelefonNo(veri.getTelefonNo());
        talimatEntity.setAdSoyad(veri.getAdSoyad());
        talimatEntity.setHesapNo(veri.getHesapNo());
        talimatEntity.setHesapId(veri.getHesapId());
        talimatEntity.setIbanNo(veri.getIbanNo());
        Kullanici kullanici = veri.getKullanici();
        talimatEntity.setMerkezId(kullanici.getMerkezId());
        talimatEntity.setSubeId(kullanici.getSubeId());
        talimatEntity.setGiseNo(kullanici.getGiseNo());
        talimatEntity.setKullaniciId(kullanici.getKullaniciId());
        talimatEntity.setDurum(0);
        talimatEntity.setTandemDurum(0);

        return talimatRepository.save(talimatEntity);
    }


    @Override
    public MutabakatDTO mutabakatSorgula(Integer tarih) {
        log.info("kurum: {}, mutabakat sorgulaniyor, tarih: {}", "telekomMobil", tarih);
        return convertTuple(talimatRepository.mutabakatSorgula("telekomMobil", tarih));
    }
}
