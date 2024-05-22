package tr.gov.ptt.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AraIslemOutput {
    private Long stan;
    private String telefonNo;
}
