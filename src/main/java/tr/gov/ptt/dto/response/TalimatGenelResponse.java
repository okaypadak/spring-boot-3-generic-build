package tr.gov.ptt.dto.response;

import tr.gov.ptt.dto.tandem.TandemDetayResponse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TalimatGenelResponse<T> {
    private String sonuc;
    private String aciklama;
    private TandemDetayResponse tandemVeri;
    private T detay;

}
