package tr.gov.ptt.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class CikarGuncelleDTO {

    private String telefonNo;
    private Integer stan;
}