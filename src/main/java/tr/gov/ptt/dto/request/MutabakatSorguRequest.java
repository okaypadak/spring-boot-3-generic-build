package tr.gov.ptt.dto.request;

import lombok.Data;
import tr.gov.ptt.enumeration.Kurum;

@Data
public class MutabakatSorguRequest {
    private Kurum kurum;
    private Integer tarih;
}
