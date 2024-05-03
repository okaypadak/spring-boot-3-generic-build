package dev.padak.backend.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TALIMATLAR", schema = "PTT", indexes = {
        @Index(name = "TALIMATLAR_UCLER_IDX", columnList = "TELEFON_NO, TALIMAT_BASLANGIC, TALIMAT_BITIS"),
        @Index(name = "TALIMATLAR_TELEFON_NO_IDX", columnList = "TELEFON_NO")
})
public class TalimatEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "TALIMATLAR_SEQ"
    )
    @SequenceGenerator(
            name = "TALIMATLAR_SEQ",
            sequenceName = "TALIMATLAR_SEQ",
            allocationSize = 1
    )
    private Long Id;

    @Column(name = "KURUM", nullable = false)
    private String kurum;

    @Column(name = "TELEFON_NO", nullable = false)
    private String telefonNo;

    @Column(name = "TAHSILAT_STAN")
    private Integer tahsilatStan;

    @Column(name = "IPTAL_STAN")
    private Integer iptalStan;

    @Column(name = "HESAP_ID")
    private Long hesapId;

    @Column(name = "TALIMAT_BASLANGIC")
    private Integer talimatBaslangic;

    @Column(name = "TALIMAT_BITIS")
    private Integer talimatBitis;

    @Column(name = "AD_SOYAD")
    private String adSoyad;

    @Column(name = "HESAP_NO")
    private String hesapNo;

    @Column(name = "IBAN_NO")
    private String ibanNo;

    @Column(name = "DURUM")
    private Integer durum;

    @Column(name = "TANDEM_DURUM")
    private Integer tandemDurum;

}
