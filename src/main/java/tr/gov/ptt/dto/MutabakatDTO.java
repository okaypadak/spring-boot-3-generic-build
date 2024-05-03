package tr.gov.ptt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class MutabakatDTO {
    private Long ekleAdet;
    private Long cikarAdet;
}
