package tr.gov.ptt.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TelekomSorguResponse {
    private String hesapId;
    private String adSoyad;
}
