package dev.padak.backend.client;

import dev.padak.backend.dto.CikarDTO;
import dev.padak.backend.dto.CikarGuncelleDTO;
import dev.padak.backend.dto.EkleDTO;
import dev.padak.backend.dto.output.TalimatOutput;
import dev.padak.backend.dto.input.TelekomInput;
import dev.padak.backend.dto.request.MutabakatKapatRequest;
import dev.padak.backend.dto.request.TalimatEkleRequest;
import dev.padak.backend.dto.request.TalimatSorgulaRequest;
import dev.padak.backend.dto.response.TelekomSorguResponse;
import dev.padak.backend.util.DateUtil;
import dev.padak.backend.ws.client.telekom.mutabakat.model.mutabakat.MutabakatResponse;
import dev.padak.backend.ws.client.telekom.mutabakat.ws.MutabakatWSBindingStub;
import dev.padak.backend.ws.client.telekom.mutabakat.ws.MutabakatWSLocator;
import dev.padak.backend.ws.client.telekom.talimatSabit.ortak.TalimatCikarResponse;
import dev.padak.backend.ws.client.telekom.talimatSabit.ws.TalimatWSBindingStub;
import dev.padak.backend.ws.client.telekom.talimatSabit.ws.TalimatWSLocator;
import dev.padak.backend.kurulum.Kurum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
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
    private int sehirKodu = 6;
    private String subeKodu = "1";
    private String giseKodu = "45";
    private String kullaniciKodu = "1";
    private Integer kurumKodu = 0;

    private static int mesajTipiMutabakat = 520;
    private static int islemKoduMutabakat = 60;
    private static int islemKaynagi = 00;

    private Kurum kurum;

    TalimatWSBindingStub proxytalimatSabit = null;
    MutabakatWSBindingStub proxyMutabakat = null;


    TalimatWSBindingStub getMobilTalimatAuthorizationStub() throws Exception {

        kurumKodu = 2762;
        sirketKodu = 500;

        proxytalimatSabit = (TalimatWSBindingStub) new TalimatWSLocator().getTalimatWSPort(new URL(kurum.getUrl() + "/TalimatWSPort"));
        proxytalimatSabit.setUsername(kurum.getKullaniciAdi());
        proxytalimatSabit.setPassword(kurum.getSifre());

        return proxytalimatSabit;
    }

    MutabakatWSBindingStub getMutAuthorizationStub() throws Exception {
        proxyMutabakat = (MutabakatWSBindingStub) new MutabakatWSLocator().getMutabakatWSPort(new URL(kurum.getUrl() + "/MutabakatWSPort"));
        proxyMutabakat.setUsername(kurum.getKullaniciAdi());
        proxyMutabakat.setPassword(kurum.getSifre());

        return proxyMutabakat;
    }

    @Override
    public void setKurum(String kurum) {
        this.kurum = Kurum.valueOf(kurum);
    }

    @Override
    public TalimatOutput<TelekomSorguResponse> sorgula(TalimatSorgulaRequest input) throws Exception {

        proxytalimatSabit = getMobilTalimatAuthorizationStub();

        int islemTarihi = DateUtil.yyyyMMdd2Integer();
        int islemSaati =  DateUtil.HHmmss2Integer();

        int stan = Integer.parseInt(this.generateStan());

        dev.padak.backend.ws.client.telekom.talimatSabit.ortak.TalimatBilgiSorgulamaRequest sorgu = new dev.padak.backend.ws.client.telekom.talimatSabit.ortak.TalimatBilgiSorgulamaRequest();

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

        dev.padak.backend.ws.client.telekom.talimatSabit.ortak.IslemYapan islemYapan = new dev.padak.backend.ws.client.telekom.talimatSabit.ortak.IslemYapan();
        islemYapan.setGiseKodu(giseKodu);
        islemYapan.setSubeKodu(subeKodu);
        islemYapan.setSehirKodu(sehirKodu);
        islemYapan.setKullaniciKodu(kullaniciKodu);
        sorgu.setIslemYapan(islemYapan);

        dev.padak.backend.ws.client.telekom.talimatSabit.ortak.ErisimBilgi erisimBilgi = new dev.padak.backend.ws.client.telekom.talimatSabit.ortak.ErisimBilgi();
        erisimBilgi.setErisimTipi(erisimTipi);
        erisimBilgi.setErisimNo(input.getTelefonNo());

        sorgu.setErisimBilgi(erisimBilgi);
        sorgu.setTalimatTipi(2L);

        dev.padak.backend.ws.client.telekom.talimatSabit.ortak.TalimatBilgiSorgulamaResponse sonuc = proxytalimatSabit.talimatSorgulama(sorgu);


        if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("00")) {

            dev.padak.backend.ws.client.telekom.talimatSabit.ortak.TalimatHesap[] talimatdizi = sonuc.getTalimatHesapDizi();
            dev.padak.backend.ws.client.telekom.talimatSabit.ortak.TalimatHesap talimat = talimatdizi[0];

            String talimatSonuc = talimat.getTalimatCevapKodu();

            if (talimatSonuc.equals("00")) {

                dev.padak.backend.ws.client.telekom.talimatSabit.ortak.TalimatHesap[] hesap = sonuc.getTalimatHesapDizi();
                Long hesapId = hesap[0].getHesapId();
                String adSoyad = hesap[0].getAdsoyadUnvan();

                log.info("kurum: {}, talimat yapılabilir, telefon: {}", kurum.name(), input.getTelefonNo());

                output.setSonuc("00");
                output.setAciklama("Talimat yapılabilir");

                output.setDetay(TelekomSorguResponse.builder().adSoyad(adSoyad).hesapId(hesapId.toString()).build());
            }

            else if (talimatSonuc.equals("42")) {

                log.info("kurum: {}, telefon numarası hatalı, telefon: {}", kurum.name(), input.getTelefonNo());
                output.setSonuc("42");
                output.setAciklama("Telefon numarası hatalı");

            }

            else if (talimatSonuc.equals("5C")) {

                log.info("kurum: {}, hesabın bu kurumdan talimatı var, telefon: {}", kurum.name(), input.getTelefonNo());

                output.setSonuc("5C");
                output.setAciklama("Hesabın bu kurumdan talimatı var.");
            }

            else if (talimatSonuc.equals("5D")) {

                log.info("kurum: {}, hesabın başka kurumdan talimatı var, telefon: {}", kurum.name(), input.getTelefonNo());
                output.setSonuc("5D");
                output.setAciklama("Hesabın başka kurumdan talimatı var.");
            }

            else {

                log.warn("kurum: {}, sorgu başarısız, telefon: {}", kurum.name(), input.getTelefonNo());
                output.setSonuc("DD");
                output.setAciklama("Diğer hata, sorgu başarısız");
            }

        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("58")) {

            log.info("kurum: {}, hesabın kaydı bulunamadı, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("58");
            output.setAciklama("Hesap kaydı bulunamadı.");
        }

        else {
            //staticMethods.logYaz("Abone No: " + talimatInput.getTelefonNo(), " için sorgu başarısız", logKurumAd, "");
            log.info("kurum: {}, xxx telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("DD");
            output.setAciklama("Diğer hata, sorgu başarısız");
        }

        return output;
    }

    @Override
    public TalimatOutput<?> ekle(TalimatEkleRequest input) throws Exception {

        proxytalimatSabit = getMobilTalimatAuthorizationStub();

        int islemTarihi = DateUtil.yyyyMMdd2Integer();
        int islemSaati = DateUtil.HHmmss2Integer();

        int stan = Integer.parseInt(this.generateStan());

        dev.padak.backend.ws.client.telekom.talimatSabit.ortak.TalimatEkleRequest sorgu = new dev.padak.backend.ws.client.telekom.talimatSabit.ortak.TalimatEkleRequest();
        dev.padak.backend.ws.client.telekom.talimatSabit.ortak.TalimatEkleResponse sonuc;

        TalimatOutput<EkleDTO> output = new TalimatOutput<EkleDTO>();

        sorgu.setMesajTipi(mesajTipiTahsilat);
        sorgu.setIslemKodu(islemKoduTahsilat);
        sorgu.setStan(stan);
        sorgu.setKurumKodu(kurumKodu);
        sorgu.setSirketKodu(sirketKodu);
        sorgu.setParaKodu(paraKodu);
        sorgu.setIslemKaynagi(islemKaynagiTahsilat);
        sorgu.setIslemTarihi(islemTarihi);
        sorgu.setIslemSaati(islemSaati);

        dev.padak.backend.ws.client.telekom.talimatSabit.ortak.IslemYapan islemYapan = new dev.padak.backend.ws.client.telekom.talimatSabit.ortak.IslemYapan();
        islemYapan.setGiseKodu(giseKodu);
        islemYapan.setSubeKodu(subeKodu);
        islemYapan.setSehirKodu(sehirKodu);
        islemYapan.setKullaniciKodu(kullaniciKodu);
        sorgu.setIslemYapan(islemYapan);

        sorgu.setHesapId(input.getHesapId());
        sorgu.setTalimatKanalKurumKodu(kurumKodu);
        sorgu.setIslemKabulTarihi(islemTarihi);
        sorgu.setTalimatTipi(2L);

        try {
            sonuc = proxytalimatSabit.talimatEkle(sorgu);

        } catch (java.io.IOException e) {

            log.warn("kurum: {}, sunucu hatası yakalandı, telefon: {}", kurum.name(), input.getTelefonNo());

            output.setSonuc("DD");
            output.setAciklama("Sunucu hatası yakalandı");

            return output;
        }

        if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("00")) {

            log.info("kurum: {}, talimat işlemi başarılı, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("00");
            output.setAciklama("Talimat yapıldı");
            output.setDetay(EkleDTO.builder().stan(stan).telefonNo(input.getTelefonNo()).build());


        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("85")) {

            log.info("kurum: {}, bildirim mesajı daha önce gönderildi ve işlem yapıldı, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("85");
            output.setAciklama("Bildirim mesajı daha önce gönderildi ve işlem yapıldı.");

        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("42")) {

            log.info("kurum: {}, telefon numarası hatalı, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("42");
            output.setAciklama("Telefon numarası hatalı");

        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5C")) {

            log.info("kurum: {}, hesabın bu kurumdan talimatı var telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("5C");
            output.setAciklama("Hesabın bu kurumdan talimatı var.");
        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5D")) {

            log.info("kurum: {}, hesabın başka kurumdan talimatı var, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("5D");
            output.setAciklama("Hesabın başka kurumdan talimatı var.");
        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5E")) {

            log.info("kurum: {}, hesabın bu kurumdan talimatı yok, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("5E");
            output.setAciklama("Hesabın bu kurumdan talimatı yok.");
        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5F")) {

            log.info("kurum: {}, hesabın talimatı yok, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("5F");
            output.setAciklama("Hesabın talimatı yok.");
        }

        else {

            log.warn("kurum: {}, sorgu başarısız, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("DD");
            output.setAciklama("Diğer hata, sorgu başarısız");
        }

        return output;
    }

    @Override
    public TalimatOutput<?> cikar(CikarDTO input) throws Exception {

        proxytalimatSabit = getMobilTalimatAuthorizationStub();

        TalimatOutput<CikarGuncelleDTO> output = new TalimatOutput<CikarGuncelleDTO>();

        dev.padak.backend.ws.client.telekom.talimatSabit.ortak.TalimatCikarRequest sorgu = new dev.padak.backend.ws.client.telekom.talimatSabit.ortak.TalimatCikarRequest();
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

        dev.padak.backend.ws.client.telekom.talimatSabit.ortak.IslemYapan islemYapan = new dev.padak.backend.ws.client.telekom.talimatSabit.ortak.IslemYapan();

        islemYapan.setGiseKodu(giseKodu);
        islemYapan.setSubeKodu(subeKodu);
        islemYapan.setSehirKodu(sehirKodu);
        islemYapan.setKullaniciKodu(kullaniciKodu);
        sorgu.setIslemYapan(islemYapan);

        sorgu.setHesapId(input.getHesapId());
        sorgu.setIslemKabulTarihi(islemTarihi);
        sorgu.setTalimatKanalKurumKodu(Long.valueOf(kurumKodu));

        dev.padak.backend.ws.client.telekom.talimatSabit.ortak.TalimatCikarResponse sonuc = null;

        try {

            sonuc = proxytalimatSabit.talimatCikar(sorgu);

        } catch (java.io.IOException e) {

            log.info("kurum: {}, sunucu hatası yakalandı, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("DD");
            output.setAciklama("Sunucu hatası yakalandı");
            output.setDetay(CikarGuncelleDTO.builder().telefonNo(input.getTelefonNo()).stan(stan).build());

            return output;
        }

        if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("00")) {

            log.info("kurum: {}, talimat çıkar işlemi işlemi başarılı, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("00");
            output.setAciklama("Talimat iptal işlemi başarılı.");
            output.setDetay(CikarGuncelleDTO.builder().stan(stan).telefonNo(input.getTelefonNo()).build());

        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("85")) {

            log.info("kurum: {}, bildirim mesajı daha önce gönderildi ve işlem yapıldı, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("85");
            output.setAciklama("Bildirim mesajı daha önce gönderildi ve işlem yapıldı.");

        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("42")) {

            log.info("kurum: {}, telefon numarası hatalı, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("42");
            output.setAciklama("Telefon numarası hatalı");

        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5C")) {

            log.info("kurum: {}, hesabın bu kurumdan talimatı var, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("5C");
            output.setAciklama("Hesabın bu kurumdan talimatı var.");
        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5D")) {

            log.info("kurum: {}, hesabın başka kurumdan talimatı var, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("5D");
            output.setAciklama("Hesabın başka kurumdan talimatı var.");
        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5E")) {

            log.info("kurum: {}, hesabın bu kurumdan talimatı yok, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("5E");
            output.setAciklama("Hesabın bu kurumdan talimatı yok.");
        }

        else if (sonuc.getOzetCevapMesaj().getIslemSonucKodu().equals("5F")) {

            log.info("kurum: {}, hesabın talimatı yok, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("5F");
            output.setAciklama("Hesabın talimatı yok.");
        }

        else {
            log.warn("kurum: {}, sorgu başarısız, telefon: {}", kurum.name(), input.getTelefonNo());
            output.setSonuc("DD");
            output.setAciklama("Diğer hata, sorgu başarısız");
        }

        return output;
    }

    @Override
    public TalimatOutput<?> mutabakatKapat(MutabakatKapatRequest input) throws Exception {
        proxyMutabakat = getMutAuthorizationStub();

        int sehirKodu = 6;
        String subeKodu = "3618";
        String giseKodu = "45";
        String kullaniciKodu = "2";

        int islemTarihi = DateUtil.yyyyMMdd2Integer();
        int islemSaati = DateUtil.HHmmss2Integer();

        int stan = Integer.parseInt(this.generateStan());

        dev.padak.backend.ws.client.telekom.mutabakat.model.mutabakat.MutabakatRequest sorgu = new dev.padak.backend.ws.client.telekom.mutabakat.model.mutabakat.MutabakatRequest();

        sorgu.setMesajTipi(mesajTipiMutabakat);
        sorgu.setIslemKodu(islemKoduMutabakat);
        sorgu.setStan(stan);
        sorgu.setKurumKodu(kurumKodu);
        sorgu.setSirketKodu(sirketKodu);
        sorgu.setParaKodu(paraKodu);
        sorgu.setIslemKaynagi(islemKaynagi);
        sorgu.setIslemTarihi(islemTarihi);
        sorgu.setIslemSaati(islemSaati);

        dev.padak.backend.ws.client.telekom.mutabakat.model.ortak.IslemYapan islemYapan = new dev.padak.backend.ws.client.telekom.mutabakat.model.ortak.IslemYapan();
        islemYapan.setGiseKodu(giseKodu);
        islemYapan.setSubeKodu(subeKodu);
        islemYapan.setSehirKodu(sehirKodu);
        islemYapan.setKullaniciKodu(kullaniciKodu);

        sorgu.setIslemYapan(islemYapan);

        sorgu.setMutabakatTipi(4);

        dev.padak.backend.ws.client.telekom.mutabakat.model.mutabakat.MutabakatBilgi[] mutabakatBilgiDizi = new dev.padak.backend.ws.client.telekom.mutabakat.model.mutabakat.MutabakatBilgi[2];

        dev.padak.backend.ws.client.telekom.mutabakat.model.mutabakat.MutabakatBilgi mutabakatTahsilat = new dev.padak.backend.ws.client.telekom.mutabakat.model.mutabakat.MutabakatBilgi();
        dev.padak.backend.ws.client.telekom.mutabakat.model.mutabakat.MutabakatBilgi mutabakatTahsilatIptal = new dev.padak.backend.ws.client.telekom.mutabakat.model.mutabakat.MutabakatBilgi();

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

        sorgu.setMutabakatTarihi(Integer.parseInt(input.getTarih()));

        dev.padak.backend.ws.client.telekom.mutabakat.model.mutabakat.MutabakatResponse mutakabatTamamla = proxyMutabakat.mutabakatBildir(sorgu);

        if (mutakabatTamamla.getOzetCevapMesaj().getIslemSonucKodu().equals("00")) {

            return TalimatOutput.<MutabakatResponse>builder()
                    .sonuc("00")
                    .aciklama("Mutabakat başarılı tamamlandı")
                    .detay(mutakabatTamamla)
                    .build();

        } else {
            return TalimatOutput.<MutabakatResponse>builder()
                    .sonuc("01")
                    .aciklama("Mutabakat hatalı")
                    .detay(null)
                    .build();
        }
    }




    public String generateStan() {
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

    public static String getParamStr(Object o) {
        String sentence = null;
        String retSentence = null;
        if (o == null)
            return "";
        else {
            try {
                sentence = o.toString();
                retSentence = new String(sentence.getBytes("ISO-8859-3"));
            } catch (UnsupportedEncodingException usep) {
                retSentence = sentence;
            }
            return retSentence;
        }
    }
}
