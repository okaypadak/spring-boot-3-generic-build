package tr.gov.ptt.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EkleDTO {
    private Integer stan;
    private String telefonNo;
}
