package tr.gov.ptt.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GenelEkleRequest {

	private Long hesapId;
	private String hesapNo;
	private String telefonNo;
	private String adSoyad;
	private String ibanNo;

}
