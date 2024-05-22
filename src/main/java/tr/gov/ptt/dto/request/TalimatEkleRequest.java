package tr.gov.ptt.dto.request;

import lombok.Builder;
import lombok.Data;
import tr.gov.ptt.enumeration.Kurum;

@Data
@Builder
public class TalimatEkleRequest extends BaseRequest {

	private Kurum kurum;
	private Long hesapId;
	private String hesapNo;
	private String telefonNo;
	private String adSoyad;
	private String ibanNo;

}
