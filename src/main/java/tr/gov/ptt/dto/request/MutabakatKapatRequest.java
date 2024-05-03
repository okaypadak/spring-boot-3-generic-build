package tr.gov.ptt.dto.request;

import lombok.Data;

@Data
public class MutabakatKapatRequest {
    private Integer ekleAdet;
    private Integer cikarAdet;
    private String tarih;
}
