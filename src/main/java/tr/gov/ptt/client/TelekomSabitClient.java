package tr.gov.ptt.client;

import tr.gov.ptt.dto.AraIslemOutput;
import tr.gov.ptt.dto.Kullanici;
import tr.gov.ptt.dto.output.MutakabatKapatResponse;
import tr.gov.ptt.dto.output.TalimatOutput;
import tr.gov.ptt.dto.request.MutabakatKapatRequest;
import tr.gov.ptt.dto.request.TalimatEkleRequest;
import tr.gov.ptt.dto.request.TalimatSorgulaRequest;
import tr.gov.ptt.dto.response.TelekomSorguResponse;
import tr.gov.ptt.entity.TalimatEntity;
import tr.gov.ptt.exception.ClientException;
import tr.gov.ptt.util.DateUtil;
import tr.gov.ptt.ws.client.telekom.mutabakat.model.mutabakat.MutabakatResponse;
import tr.gov.ptt.ws.client.telekom.mutabakat.ws.MutabakatWSBindingStub;
import tr.gov.ptt.ws.client.telekom.mutabakat.ws.MutabakatWSLocator;
import tr.gov.ptt.ws.client.telekom.talimatSabit.ortak.*;
import tr.gov.ptt.ws.client.telekom.talimatSabit.ws.TalimatWSBindingStub;
import tr.gov.ptt.ws.client.telekom.talimatSabit.ws.TalimatWSLocator;
import tr.gov.ptt.enumeration.Kurum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tr.gov.ptt.ws.client.telekom.mutabakat.model.mutabakat.MutabakatBilgi;
import tr.gov.ptt.ws.client.telekom.mutabakat.model.mutabakat.MutabakatRequest;
import tr.gov.ptt.ws.client.telekom.mutabakat.model.ortak.IslemYapan;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Slf4j
public class TelekomSabitClient implements IClient {

    private static int mesajTipiSorgu = 200;
    private static int mesajTipiTahsilat = 220;
    private static int mesajTipiTahsilatIptal = 220;
    private static int islemKoduSorgu = 96;
    private static int islemKoduTahsilat = 66;
    private static int islemKoduTahsilatIptal = 76;
    private static int sirketKodu = 0;
    private static int paraKodu = 949;
    private static int islemKaynagiSorgu = 00;
    private static int islemKaynagiTahsilat = 20;
    private static int islemKaynagiIptal = 30;
    private static int erisimTipi = 1;

//    private int sehirKodu = 6;
//    private String subeKodu = "1";
//    private String giseKodu = "45";
//    private String kullaniciKodu = "1";

    private Integer kurumKodu = 0;

    private static int mesajTipiMutabakat = 520;
    private static int islemKoduMutabakat = 60;
    private static int islemKaynagi = 00;
    
    TalimatWSBindingStub proxytalimatSabit = null;
    MutabakatWSBindingStub proxyMutabakat = null;



    

    @Override
    public TalimatOutput<TelekomSorguResponse> sorgula(TalimatSorgulaRequest input) {

        proxytalimatSabit = getMobilTalimatAuthorizationStub();

        int islemTarihi = DateUtil.yyyyMMdd2Integer();
        int islemSaati =  DateUtil.HHmmss2Integer();

        int stan = Integer.parseInt(this.generateStan());

        TalimatBilgiSorgulamaRequest sorgu = new TalimatBilgiSorgulamaRequest();

        TalimatOutput<TelekomSorguResponse> output = new TalimatOutput<TelekomSorguResponse>();

        sorgu.setMesajTipi(mesajTipiSorgu);
        sorgu.setIslemKodu(islemKoduSorgu);
        sorgu.setStan(stan);
        sorgu.setKurumKodu(kurumKodu);
        sorgu.setSirketKodu(sirketKodu);
        sorgu.setParaKodu(paraKodu);
        sorgu.setIslemKaynagi(islemKaynagiSorgu);
        sorgu.setIslemTarihi(islemTarihi);
        sorgu.setIslemSaati(islemSaati);

        tr.gov.ptt.ws.client.telekom.talimatSabit.ortak.IslemYapan islemYapan = new tr.gov.ptt.ws.client.telekom.talimatSabit.ortak.IslemYapan();

        Kullanici kullanici = input.getKullanici();

        islemYapan.setGiseKodu(kullanici.getGiseNo().toString());
        islemYapan.setSubeKodu(kullanici.getSubeId().toString());
        islemYapan.setSehirKodu(kullanici.getMerkezId());
        islemYapan.setKullaniciKodu(kullanici.getKullaniciId().toString());
        sorgu.setIslemYapan(islemYapan);

        ErisimBilgi erisimBilgi = new ErisimBilgi();
        erisimBilgi.setErisimTipi(erisimTipi);
        erisimBilgi.setErisimNo(input.getTelefonNo());

        sorgu.setErisimBilgi(erisimBilgi);
        sorgu.setTalimatTipi(2L);

        TalimatBilgiSorgulamaResponse sonuc;

        try {
            sonuc = proxytalimatSabit.talimatSorgulama(sorgu);
        } catch (Exception e) {
            log.warn("kurum: {}, sunucu hatası yakalandı, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            throw new ClientException("Sunucu hatası yakalandı: "+e.getMessage());
        }


        if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("00")) {

            TalimatHesap[] talimatdizi = sonuc.getTalimatHesapDizi();
            TalimatHesap talimat = talimatdizi[0];

            String talimatSonuc = talimat.getTalimatCevapKodu();

            if (talimatSonuc.equals("00")) {

                TalimatHesap[] hesap = sonuc.getTalimatHesapDizi();
                Long hesapId = hesap[0].getHesapId();
                String adSoyad = hesap[0].getAdsoyadUnvan();

                log.info("kurum: {}, talimat yapılabilir, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());

                output.setSonuc(true);
                output.setAciklama("Talimat yapılabilir");

                output.setDetay(TelekomSorguResponse.builder().adSoyad(adSoyad).hesapId(hesapId.toString()).build());
            }

            else if (talimatSonuc.equals("5C")) {

                log.info("kurum: {}, hesabın bu kurumdan talimatı var, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());

                output.setSonuc(false);
                output.setAciklama("Hesabın bu kurumdan talimatı var.");
            }

            else if (talimatSonuc.equals("5D")) {

                log.info("kurum: {}, hesabın başka kurumdan talimatı var, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
                output.setSonuc(false);
                output.setAciklama("Hesabın başka kurumdan talimatı var.");
            }

            else {

                log.warn("kurum: {}, sorgu başarısız, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
                output.setSonuc(false);
                output.setAciklama("Diğer hata, sorgu başarısız");
            }

        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("58")) {

            log.info("kurum: {}, hesabın kaydı bulunamadı, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Hesap kaydı bulunamadı.");
        }

        else {
            //staticMethods.logYaz("Abone No: " + talimatInput.getTelefonNo(), " için sorgu başarısız", logKurumAd, "");
            log.info("kurum: {}, xxx telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Diğer hata, sorgu başarısız");
        }

        return output;
    }

    @Override
    public TalimatOutput<?> ekle(TalimatEkleRequest input) {

        proxytalimatSabit = getMobilTalimatAuthorizationStub();

        int islemTarihi = DateUtil.yyyyMMdd2Integer();
        int islemSaati = DateUtil.HHmmss2Integer();

        int stan = Integer.parseInt(this.generateStan());

        tr.gov.ptt.ws.client.telekom.talimatSabit.ortak.TalimatEkleRequest sorgu = new tr.gov.ptt.ws.client.telekom.talimatSabit.ortak.TalimatEkleRequest();


        TalimatOutput<AraIslemOutput> output = new TalimatOutput<AraIslemOutput>();

        sorgu.setMesajTipi(mesajTipiTahsilat);
        sorgu.setIslemKodu(islemKoduTahsilat);
        sorgu.setStan(stan);
        sorgu.setKurumKodu(kurumKodu);
        sorgu.setSirketKodu(sirketKodu);
        sorgu.setParaKodu(paraKodu);
        sorgu.setIslemKaynagi(islemKaynagiTahsilat);
        sorgu.setIslemTarihi(islemTarihi);
        sorgu.setIslemSaati(islemSaati);

        tr.gov.ptt.ws.client.telekom.talimatSabit.ortak.IslemYapan islemYapan = new tr.gov.ptt.ws.client.telekom.talimatSabit.ortak.IslemYapan();

        Kullanici kullanici = input.getKullanici();

        islemYapan.setGiseKodu(kullanici.getGiseNo().toString());
        islemYapan.setSubeKodu(kullanici.getSubeId().toString());
        islemYapan.setSehirKodu(kullanici.getMerkezId());
        islemYapan.setKullaniciKodu(kullanici.getKullaniciId().toString());
        sorgu.setIslemYapan(islemYapan);

        sorgu.setHesapId(input.getHesapId());
        sorgu.setTalimatKanalKurumKodu(kurumKodu);
        sorgu.setIslemKabulTarihi(islemTarihi);
        sorgu.setTalimatTipi(2L);

        TalimatEkleResponse sonuc;

        try {
            sonuc = proxytalimatSabit.talimatEkle(sorgu);
        } catch (Exception e) {
            throw new ClientException("Sunucu hatası yakalandı: "+e.getMessage());
        }


        if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("00")) {

            log.info("kurum: {}, talimat işlemi başarılı, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(true);
            output.setAciklama("Talimat yapıldı");
            output.setDetay(AraIslemOutput.builder().stan(Long.valueOf(stan)).telefonNo(input.getTelefonNo()).build());

        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("85")) {

            log.info("kurum: {}, bildirim mesajı daha önce gönderildi ve işlem yapıldı, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Bildirim mesajı daha önce gönderildi ve işlem yapıldı.");

        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("42")) {

            log.info("kurum: {}, telefon numarası hatalı, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Telefon numarası hatalı");

        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5C")) {

            log.info("kurum: {}, hesabın bu kurumdan talimatı var telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Hesabın bu kurumdan talimatı var.");
        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5D")) {

            log.info("kurum: {}, hesabın başka kurumdan talimatı var, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Hesabın başka kurumdan talimatı var.");
        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5E")) {

            log.info("kurum: {}, hesabın bu kurumdan talimatı yok, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Hesabın bu kurumdan talimatı yok.");
        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5F")) {

            log.info("kurum: {}, hesabın talimatı yok, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Hesabın talimatı yok.");
        }

        else {

            log.warn("kurum: {}, sorgu başarısız, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Diğer hata, sorgu başarısız");
        }

        return output;
    }

    @Override
    public TalimatOutput<?> cikar(TalimatEntity input) {

        proxytalimatSabit = getMobilTalimatAuthorizationStub();

        TalimatOutput<AraIslemOutput> output = new TalimatOutput<AraIslemOutput>();

        TalimatCikarRequest sorgu = new TalimatCikarRequest();
        int stan = Integer.parseInt(this.generateStan());

        int islemTarihi = DateUtil.yyyyMMdd2Integer();
        int islemSaati = DateUtil.HHmmss2Integer();

        sorgu.setMesajTipi(mesajTipiTahsilatIptal);
        sorgu.setIslemKodu(islemKoduTahsilatIptal);
        sorgu.setStan(stan);
        sorgu.setKurumKodu(kurumKodu);
        sorgu.setSirketKodu(sirketKodu);
        sorgu.setParaKodu(paraKodu);
        sorgu.setIslemKaynagi(islemKaynagiIptal);
        sorgu.setIslemTarihi(islemTarihi);
        sorgu.setIslemSaati(islemSaati);

        tr.gov.ptt.ws.client.telekom.talimatSabit.ortak.IslemYapan islemYapan = new tr.gov.ptt.ws.client.telekom.talimatSabit.ortak.IslemYapan();

        islemYapan.setGiseKodu(input.getGiseNo().toString());
        islemYapan.setSubeKodu(input.getSubeId().toString());
        islemYapan.setSehirKodu(input.getMerkezId());
        islemYapan.setKullaniciKodu(input.getKullaniciId().toString());
        sorgu.setIslemYapan(islemYapan);

        sorgu.setHesapId(input.getHesapId());
        sorgu.setIslemKabulTarihi(islemTarihi);
        sorgu.setTalimatKanalKurumKodu(Long.valueOf(kurumKodu));

        TalimatCikarResponse sonuc = null;

        try {
            sonuc = proxytalimatSabit.talimatCikar(sorgu);
        } catch (Exception e) {
            log.warn("kurum: {}, sunucu hatası yakalandı, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            throw new ClientException("Sunucu hatası yakalandı: "+e.getMessage());
        }

        if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("00")) {

            log.info("kurum: {}, talimat çıkar işlemi işlemi başarılı, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            return TalimatOutput.builder().sonuc(true).aciklama("Talimat çıkar işlemi başarılı").detay(AraIslemOutput.builder().stan(Long.valueOf(sonuc.getStan())).telefonNo(input.getTelefonNo()).build()).build();

        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("85")) {

            log.info("kurum: {}, bildirim mesajı daha önce gönderildi ve işlem yapıldı, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Bildirim mesajı daha önce gönderildi ve işlem yapıldı.");

        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("42")) {

            log.info("kurum: {}, telefon numarası hatalı, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Telefon numarası hatalı");

        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5C")) {

            log.info("kurum: {}, hesabın bu kurumdan talimatı var, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Hesabın bu kurumdan talimatı var.");
        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5D")) {

            log.info("kurum: {}, hesabın başka kurumdan talimatı var, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Hesabın başka kurumdan talimatı var.");
        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5E")) {

            log.info("kurum: {}, hesabın bu kurumdan talimatı yok, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Hesabın bu kurumdan talimatı yok.");
        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5F")) {

            log.info("kurum: {}, hesabın talimatı yok, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Hesabın talimatı yok.");
        }

        else {
            log.warn("kurum: {}, sorgu başarısız, telefon: {}", Kurum.telekomSabit.name(), input.getTelefonNo());
            output.setSonuc(false);
            output.setAciklama("Diğer hata, sorgu başarısız");
        }

        return output;
    }

    @Override
    public MutakabatKapatResponse mutabakatKapat(MutabakatKapatRequest input) {
        proxyMutabakat = getMutAuthorizationStub();

        int sehirKodu = 6;
        String subeKodu = "3618";
        String giseKodu = "45";
        String kullaniciKodu = "2";

        int islemTarihi = DateUtil.yyyyMMdd2Integer();
        int islemSaati = DateUtil.HHmmss2Integer();

        int stan = Integer.parseInt(this.generateStan());

        MutabakatRequest sorgu = new MutabakatRequest();

        sorgu.setMesajTipi(mesajTipiMutabakat);
        sorgu.setIslemKodu(islemKoduMutabakat);
        sorgu.setStan(stan);
        sorgu.setKurumKodu(kurumKodu);
        sorgu.setSirketKodu(sirketKodu);
        sorgu.setParaKodu(paraKodu);
        sorgu.setIslemKaynagi(islemKaynagi);
        sorgu.setIslemTarihi(islemTarihi);
        sorgu.setIslemSaati(islemSaati);

        IslemYapan islemYapan = new IslemYapan();
        islemYapan.setGiseKodu(giseKodu);
        islemYapan.setSubeKodu(subeKodu);
        islemYapan.setSehirKodu(sehirKodu);
        islemYapan.setKullaniciKodu(kullaniciKodu);

        sorgu.setIslemYapan(islemYapan);

        sorgu.setMutabakatTipi(4);

        MutabakatBilgi[] mutabakatBilgiDizi = new MutabakatBilgi[2];

        MutabakatBilgi mutabakatTahsilat = new MutabakatBilgi();
        MutabakatBilgi mutabakatTahsilatIptal = new MutabakatBilgi();

        mutabakatTahsilat.setIslemKodu(66);
        mutabakatTahsilat.setMutabakatDurumu(0);
        mutabakatTahsilat.setToplamIslemSayisi(input.getEkleAdet());
        mutabakatTahsilat.setToplamIslemTutari(0);

        mutabakatBilgiDizi[0] = mutabakatTahsilat;

        mutabakatTahsilatIptal.setIslemKodu(76);
        mutabakatTahsilatIptal.setMutabakatDurumu(0);
        mutabakatTahsilatIptal.setToplamIslemSayisi(input.getCikarAdet());
        mutabakatTahsilatIptal.setToplamIslemTutari(0);

        mutabakatBilgiDizi[1] = mutabakatTahsilatIptal;

        sorgu.setMutabakatIslemSayisi(2);
        sorgu.setMutabakatBilgiDizi(mutabakatBilgiDizi);

        sorgu.setMutabakatTarihi(input.getTarih());

        MutabakatResponse mutakabatTamamla;

        try {
            mutakabatTamamla = proxyMutabakat.mutabakatBildir(sorgu);
        } catch (Exception e) {
            return MutakabatKapatResponse.<MutabakatResponse>builder()
                    .sonuc(false)
                    .aciklama("Mutabakat hatalı!")
                    .build();
        }

        if (mutakabatTamamla.getOzetCevapMesaj().getIslemSonucKodu().equals("00")) {

            return MutakabatKapatResponse.<MutabakatResponse>builder()
                    .sonuc(true)
                    .aciklama("Mutabakat başarılı tamamlandı")
                    .build();

        } else {
            return MutakabatKapatResponse.<MutabakatResponse>builder()
                    .sonuc(false)
                    .aciklama("Mutabakat işlemi başarısız")
                    .build();
        }
    }




    private String generateStan() {
        DateFormat saat = new SimpleDateFormat("HH");
        Date date = new Date();
        String saatstring = saat.format(date);

        DateFormat uzun = null;
        String stanstring = "";

        char firstChar = saatstring.charAt(0);

        if (firstChar == 0) {
            uzun = new SimpleDateFormat("HmmssSSS");

            Date dateTwo = new Date();
            stanstring = uzun.format(dateTwo);

        } else {
            uzun = new SimpleDateFormat("HHmmssSSS");

            Date dateTwo = new Date();
            stanstring = uzun.format(dateTwo);

            StringBuffer sb = new StringBuffer(stanstring);
            sb.deleteCharAt(sb.length() - 1);
            stanstring = sb.toString();
        }

        return stanstring;

    }

    private TalimatWSBindingStub getMobilTalimatAuthorizationStub() {

        try {
            kurumKodu = 2762;
            sirketKodu = 500;

            proxytalimatSabit = (TalimatWSBindingStub) new TalimatWSLocator().getTalimatWSPort(new URL(Kurum.telekomSabit.telekomSabit.getUrl() + "/TalimatWSPort"));
            proxytalimatSabit.setUsername(Kurum.telekomSabit.getKullaniciAdi());
            proxytalimatSabit.setPassword(Kurum.telekomSabit.getSifre());

            return proxytalimatSabit;
        } catch (Exception e ) {
            throw new ClientException("Stub oluşturulamadı");
        }

    }

    private MutabakatWSBindingStub getMutAuthorizationStub() {

        try {
            proxyMutabakat = (MutabakatWSBindingStub) new MutabakatWSLocator().getMutabakatWSPort(new URL(Kurum.telekomSabit.getUrl() + "/MutabakatWSPort"));
            proxyMutabakat.setUsername(Kurum.telekomSabit.getKullaniciAdi());
            proxyMutabakat.setPassword(Kurum.telekomSabit.getSifre());

            return proxyMutabakat;

        } catch (Exception e ) {
            throw new ClientException("Stub oluşturulamadı");
        }
    }


}
