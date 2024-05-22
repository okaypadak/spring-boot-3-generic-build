package tr.gov.ptt.dto.response;

import lombok.Builder;
import lombok.Data;
import tr.gov.ptt.dto.tandem.PCHListResponse;

@Data
@Builder
public class TalimatGenelResponse<T> {
    private Boolean sonuc;
    private String aciklama;
    private PCHListResponse tandemVeri;
    private T detay;

}
