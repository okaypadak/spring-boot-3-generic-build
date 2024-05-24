package tr.gov.ptt.kanal;

import tr.gov.ptt.client.IClient;
import tr.gov.ptt.dto.*;
import tr.gov.ptt.dto.request.TalimatCikarRequest;
import tr.gov.ptt.dto.request.TalimatEkleRequest;
import tr.gov.ptt.dto.request.TalimatSorgulaRequest;
import tr.gov.ptt.dto.output.TalimatOutput;
import tr.gov.ptt.dto.response.TalimatGenelResponse;
import tr.gov.ptt.dto.tandem.PCHListResponse;
import tr.gov.ptt.dto.tandem.ResponseObject;
import tr.gov.ptt.entity.TalimatEntity;
import tr.gov.ptt.service.IService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import tr.gov.ptt.service.TalimatService;
import tr.gov.ptt.service.TandemService;

import java.util.Optional;

@NoArgsConstructor
@Slf4j
public abstract class TemelKanal implements IChannel {

    @Setter
    @Getter
    protected IClient client;

    @Setter
    protected IService service;

    @Autowired
    private TandemService tandemService;

    @Autowired
    private TalimatService talimatService;


    @Override
    public TalimatGenelResponse<?> talimatSorgula(TalimatSorgulaRequest request) throws Exception {

        PCHListResponse tandemVeri = null;
        TalimatOutput<?> response = null;

        //servise git talimati sorgula
        log.info("kurum: {} client'ta sorgulama başlıyor, telefon: {}", request.getKurum().getClientAdi(), request.getTelefonNo());


        try {
            response = client.sorgula(request);
        } catch (Exception e) {
            log.warn("kurum: {}, hata: {}", request.getKurum(), e.getMessage());
            return TalimatGenelResponse.builder().sonuc(false).aciklama("Talimat sorgulama işlemi başarısız").build();
        }

        //kurumdan talimat  yapılabilir geldiyse
        if (response.getSonuc()) {

            ResponseObject tandemCevap;

            try {
                //Tandem talimati var mi?
                tandemCevap = tandemService.talimatSorgula(request.getKurum().getKod(), request.getTelefonNo());
            } catch (Exception e) {
                log.warn("kurum: {}, telefon: {}, hata: {}", request.getKurum().getClientAdi(), request.getTelefonNo(), e.getMessage());
                return TalimatGenelResponse.builder().sonuc(false).aciklama("Tandem sorgulamada hata").build();
            }

            if (!tandemCevap.getIsSuccess()) {
                log.info("kurum: {} tandem pçh listesini alıyor, telefon: {}", request.getKurum().getClientAdi(), request.getTelefonNo());

                try {
                    //Tandem'e git PÇH listesini al
                    tandemVeri = tandemService.getPCHListesi(request.getHvkNo());
                } catch (Exception e) {
                    log.warn("kurum: {}, telefon: {}, hata: {}", request.getKurum().getClientAdi(), request.getTelefonNo(), e.getMessage());
                    return TalimatGenelResponse.builder().sonuc(false).aciklama("Tandem PÇH listesi almada hata").build();
                }

                if (!tandemVeri.getCode().equals("00")) {
                    return TalimatGenelResponse.builder().sonuc(false).aciklama("PÇH bulunamadı").build();
                }

            } else {
                return TalimatGenelResponse.builder().sonuc(false).aciklama("Talimat mevcut").build();
            }

        } else {
            return TalimatGenelResponse.builder().sonuc(false).aciklama("Talimat mevcut").build();
        }

        //başarılı işlem olarak dön
        log.info("kurum: {}, işlem başarılı, telefon: {}", request.getKurum().getClientAdi(), request.getTelefonNo());
        return TalimatGenelResponse.builder().sonuc(response.getSonuc()).aciklama(response.getAciklama()).detay(response.getDetay()).tandemVeri(tandemVeri).build();
    }

    @Override
    public TalimatGenelResponse<?> talimatEkle(TalimatEkleRequest request) throws Exception {

        if (talimatService.bekleyenDurumKontrol(request.getTelefonNo()))
            return TalimatGenelResponse.builder().sonuc(false).aciklama("Bekleyen işlem mevcut lütfen daha sonra tekrar deneyiniz").build();

        try {
            //ilk kaydı veritananina ekle
            log.info("kurum: {}, başlangıç için veri kaydediliyor, telefon: {}", request.getKurum().getClientAdi(), request.getTelefonNo());
            TalimatEntity aktifTalimat = service.kaydet(request);

            //servise git talimati ekle
            log.info("kurum: {}, client'ta ekle başlıyor, telefon: {}", request.getKurum().getClientAdi(), request.getTelefonNo());

            TalimatOutput<AraIslemOutput> response = null;

            try {
                response = client.ekle(request);
            } catch (Exception e) {
                log.warn("kurum: {}, hata: {}", request.getKurum(), e.getMessage());
                talimatService.durumlariGuncelle(aktifTalimat, 4, 4);
                return TalimatGenelResponse.builder().sonuc(false).aciklama("Talimat ekle işlemi başarısız").build();
            }

            if (response.getSonuc()) {
                log.info("kurum: {}, ekleme başarılı veri güncelleniyor, telefon: {}", request.getKurum().getClientAdi(), request.getTelefonNo());

                //servis başarılı ise veritabanini güncelle
                talimatService.guncelleEkleClient(aktifTalimat, response.getDetay().getStan());

                try {
                    //TANDEM EKLE TEST İÇİN EKLENDİ
                    ResponseObject tandemSonuc = tandemService.talimatEkle(request);
                    talimatService.tandemDurumGuncelle(aktifTalimat, 1);


                    log.info("kurum: {}, tandem ekleme işlemi başarılı, telefon: {}", request.getKurum().getClientAdi(), request.getTelefonNo());
                } catch (Exception e) {
                    log.info("kurum: {}, tandem ekleme işlemi başarılız, hata: {}", request.getKurum().getClientAdi(), e.getMessage());
                }

            } else {

                talimatService.durumlariGuncelle(aktifTalimat, 6, 6);
                return TalimatGenelResponse.builder().sonuc(false).aciklama(response.getAciklama()).build();
            }

        } catch (Exception e) {
            log.warn("kurum: {}, telefon: {}, hata: {}", request.getKurum().getClientAdi(), request.getTelefonNo(), e.getMessage());
            return TalimatGenelResponse.builder().sonuc(false).aciklama(e.getMessage()).build();
        }

        log.info("kurum: {}, işlem başarılı, telefon: {}", request.getKurum().getClientAdi(), request.getTelefonNo());
        return TalimatGenelResponse.builder().sonuc(true).aciklama("Talimat ekle işlemi başarılı").build();
    }

    @Override
    public TalimatGenelResponse<?> talimatCikar(TalimatCikarRequest request) throws Exception {

        //VERİLERİ GETİR
        log.info("kurum: {}, telefon bilgisine göre verileri çekiyor, telefon: {}", request.getKurum().getClientAdi(), request.getTelefonNo());

        if (talimatService.bekleyenDurumKontrol(request.getTelefonNo()))
            return TalimatGenelResponse.builder().sonuc(false).aciklama("Bekleyen işlem mevcut lütfen daha sonra tekrar deneyiniz").build();

        Optional<TalimatEntity> aktifTalimatOptinal = talimatService.aktifTalimatGetir(request.getTelefonNo());

        if (aktifTalimatOptinal.isEmpty())
            return TalimatGenelResponse.builder().sonuc(false).aciklama("Aktif talimat bulunamadı.").build();

        TalimatEntity aktifTalimat = aktifTalimatOptinal.get();

        //TANDEM VE DURUM BELIRSIZE ÇEK
        talimatService.durumlariIptalBekleyenYap(aktifTalimat);

        //Servise git talimattan cikar
        log.info("kurum: {}, client'ten çıkış işlemi başlıyor, telefon: {}", request.getKurum().getClientAdi(), request.getTelefonNo());

        TalimatOutput<AraIslemOutput> response = null;

        try {
            response = client.cikar(aktifTalimat);
        } catch (Exception e) {
            log.warn("kurum: {}, hata: {}", request.getKurum(), e.getMessage());
        }

        if (response.getSonuc()) {
            //TALİMATTAN ÇIKARILDIĞINA DAİR BİLGİLERİ GÜNCELLE
            log.info("kurum: {}, çıkış işlemi için veri güncelleniyor, telefon: {}", request.getKurum().getClientAdi(), request.getTelefonNo());
            talimatService.guncelleIptalClient(aktifTalimat, response.getDetay().getStan(), 3);

            //TALİMATI TANDEMDEN ÇIKAR
            log.info("kurum: {}, tandem çıkarma işlemi başlıyor, telefon: {}", request.getKurum().getClientAdi(), request.getTelefonNo());

            try {
                ResponseObject tandemSonuc = tandemService.talimatCikar(aktifTalimat);
                if (tandemSonuc.getIsSuccess()) {
                    talimatService.guncelleIptalTandem(aktifTalimat);
                    log.info("kurum: {}, tandem çıkarma işlemi başarılı, telefon: {}", request.getKurum().getClientAdi(), request.getTelefonNo());
                } else {
                    log.warn("kurum: {}, tandem çıkarma hata verdi, hata: {}", request.getKurum().getClientAdi(), tandemSonuc.getMessage());
                }

            } catch (Exception e) {
                log.warn("kurum: {}, tandem çıkarma hata verdi, hata: {}", request.getKurum().getClientAdi(), e.getMessage());
            }

        }

        return TalimatGenelResponse.builder().sonuc(true).aciklama("Talimat çıkar işlemi başarılı").build();

    }

    @Override
    public MutabakatDTO mutabakatSorgu(Integer input) throws Exception {

        return service.mutabakatSorgula(input);
    }
}
