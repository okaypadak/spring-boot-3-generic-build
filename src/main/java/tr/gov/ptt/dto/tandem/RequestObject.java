package tr.gov.ptt.dto.tandem;

import lombok.Data;

@Data
public class RequestObject {
    private String kurum;
    private String telefonNo;
    private String hesapNo;
    private Integer merkezNo;
    private Integer subeNo;
    private Integer giseNo;
    private Integer kullaniciId;
}
