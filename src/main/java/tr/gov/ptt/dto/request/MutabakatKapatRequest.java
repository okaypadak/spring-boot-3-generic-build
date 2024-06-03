package tr.gov.ptt.dto.request;

import lombok.Data;
import tr.gov.ptt.enumeration.Kanal;
import tr.gov.ptt.enumeration.Kurum;

@Data
public class MutabakatKapatRequest {
    private Kanal kanal;
    private Kurum kurum;
    private Integer ekleAdet;
    private Integer cikarAdet;
    private Integer tarih;
}
