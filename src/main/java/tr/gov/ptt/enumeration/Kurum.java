package tr.gov.ptt.enumeration;


import lombok.Getter;

public enum Kurum {
    telekomMobil("telekomMobilClient", "telekomMobilService", "https://pttwsint.ptt.gov.tr/turktelekom/test", "2762", "sifre123", "4"),
    telekomSabit("telekomSabitClient", "telekomSabitService", "https://pttwsint.ptt.gov.tr/turktelekom/bnkodeme/test", "2762", "sifre123", "4"),
    turkcell("turkcellClient", "turkcellService", "https://pttwsint.ptt.gov.tr/pttbank/turkcell/sertifikasyon/collgwWebServices", "ptt", "7777777777777777", "4"),
    vodafone("vodafoneClient", "vodafoneService", "https://pttwsint.ptt.gov.tr/vodafone/talimatislemleri", "", "", "4");

    @Getter
    private String clientAdi;

    @Getter
    private String url;

    @Getter
    private String kullaniciAdi;

    @Getter
    private String sifre;

    @Getter
    private String serviceAdi;

    @Getter
    private String kod;

    Kurum(String clientAdi, String serviceAdi, String url, String kullaniciAdi, String sifre, String kod) {
        this.clientAdi = clientAdi;
        this.url = url;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.serviceAdi = serviceAdi;
        this.kod = kod;
    }
}



