package tr.gov.ptt.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import tr.gov.ptt.enumeration.Kurum;

@Data
@AllArgsConstructor
public class TalimatSorgulaRequest extends BaseRequest {

	private Kurum kurum;
	private String telefonNo;
	private String adSoyad;
	private String hvkNo;

}
