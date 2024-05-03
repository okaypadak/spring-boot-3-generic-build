package tr.gov.ptt.kanal;

import tr.gov.ptt.client.IClient;
import tr.gov.ptt.dto.CikarDTO;
import tr.gov.ptt.dto.CikarGuncelleDTO;
import tr.gov.ptt.dto.EkleDTO;
import tr.gov.ptt.dto.MutabakatDTO;
import tr.gov.ptt.dto.request.TalimatCikarRequest;
import tr.gov.ptt.dto.request.GenelEkleRequest;
import tr.gov.ptt.dto.request.TalimatSorgulaRequest;
import tr.gov.ptt.dto.tandem.TandemDetayResponse;
import tr.gov.ptt.dto.output.TalimatOutput;
import tr.gov.ptt.dto.response.TalimatGenelResponse;
import tr.gov.ptt.service.IService;
import tr.gov.ptt.service.TandemService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@NoArgsConstructor
@Slf4j
public abstract class TemelKanal implements IProcess {

    @Setter
    @Getter
    protected IClient client;

    @Setter
    protected IService service;

    @Setter
    @Getter
    protected String kurum;

    @Autowired
    TandemService tandemService;

    @Override
    public TalimatGenelResponse<?> talimatSorgula(TalimatSorgulaRequest request) throws Exception {

        TandemDetayResponse tandemVeri = null;
        TalimatOutput<?> response = null;

        try {
            //servise git talimati sorgula
            log.info("kurum: {} client'ta sorgulama başlıyor, telefon: {}", kurum, request.getTelefonNo());
            client.setKurum(kurum);
            response = client.sorgula(request);

            //kurumdan talimat  yapılabilir geldiyse
            if(response.getSonuc().equals("00")){

                //TODO tandem talimati var mi?

                //Tandem'e git PÇH listesini al
                log.info("kurum: {} tandem pçh listesini alıyor, telefon: {}", kurum, request.getTelefonNo());
                tandemVeri = tandemService.tandemPchListesi(request.getHvkNo());
            }

        } catch (Exception e) {
            log.warn("kurum: {}, telefon: {}, hata: {}", kurum, request.getTelefonNo(), e.getMessage());
            return TalimatGenelResponse.builder().sonuc(response.getSonuc()).aciklama(e.getMessage()).build();
        }

        //başarılı işlem olarak dön
        log.info("kurum: {}, işlem başarılı, telefon: {}", kurum, request.getTelefonNo());
        return TalimatGenelResponse.builder().sonuc(response.getSonuc()).aciklama(response.getAciklama()).detay(response.getDetay()).tandemVeri(tandemVeri).build();
    }

    @Override
    public TalimatGenelResponse<?> talimatEkle(GenelEkleRequest request) throws Exception {

        try {
            //ilk kaydı veritananina ekle
            log.info("kurum: {}, başlangıç için veri kaydediliyor, telefon: {}", kurum, request.getTelefonNo());
            service.kaydet(request);

            //servise git talimati ekle
            log.info("kurum: {}, client'ta ekle başlıyor, telefon: {}", kurum, request.getTelefonNo());
            client.setKurum(kurum);
            TalimatOutput<EkleDTO> response = client.ekle(request);

            if(response.getSonuc().equals("00")) {
                log.info("kurum: {}, ekleme başarılı veri güncelleniyor, telefon: {}", kurum, request.getTelefonNo());
                //servis başarılı ise veritabanini güncelle
                service.guncelleEkle(response.getDetay());

                //TODO Tandem'e kaydet
            }

        } catch (Exception e) {
            log.warn("kurum: {}, telefon: {}, hata: {}", kurum, request.getTelefonNo(), e.getMessage());
            return TalimatGenelResponse.builder().sonuc("01").aciklama(e.getMessage()).build();
        }

        log.info("kurum: {}, işlem başarılı, telefon: {}", kurum, request.getTelefonNo());
        return TalimatGenelResponse.builder().sonuc("00").aciklama("Talimat ekle işlemi başarılı").build();
    }

    @Override
    public TalimatGenelResponse<?> talimatCikar(TalimatCikarRequest request) throws Exception {

        try {
            //service verileri getir
            log.info("kurum: {}, telefon bilgisine göre verileri çekiyor, telefon: {}", kurum, request.getTelefonNo());
            CikarDTO bilgi = service.getir(request);

            //gelen bilgiler ile tandemden çıkar
            log.info("kurum: {}, tandem çıkarma işlemi başlıyor, telefon: {}", kurum, request.getTelefonNo());
            tandemService.cikarTalimat(bilgi);

            //Servise git talimattan cikar
            log.info("kurum: {}, client'ten çıkış işlemi başlıyor, telefon: {}", kurum, request.getTelefonNo());
            client.setKurum(kurum);
            TalimatOutput<CikarGuncelleDTO> response = client.cikar(bilgi);

            if(response.getSonuc().equals("00")) {
                //talimattan çıkarıldığına dair bilgi güncelle
                log.info("kurum: {}, çıkış işlemi için veri güncelleniyor, telefon: {}", kurum, request.getTelefonNo());
                service.guncelleCikar(response.getDetay());
            }

        } catch (Exception e) {
            log.warn("kurum: {}, telefon: {}, hata: {}", kurum, request.getTelefonNo(), e.getMessage());
            return TalimatGenelResponse.builder().sonuc("01").aciklama(e.getMessage()).build();
        }

        return TalimatGenelResponse.builder().sonuc("00").aciklama("Talimat çıkar işlemi başarılı").build();

    }

    @Override
    public MutabakatDTO mutabakatSorgu(Integer input) throws Exception {
        log.info("kurum: {}, mutabakat sorgulaniyor, tarih: {}", kurum, input);
        return service.mutabakatSorgula(input);
    }
}
