package tr.gov.ptt.dto.request;

import lombok.Builder;
import lombok.Data;
import tr.gov.ptt.enumeration.Kanal;
import tr.gov.ptt.enumeration.Kurum;

@Data
@Builder
public class MutabakatRequest {

	private Kanal kanal;
	private Kurum kurum;
	private Integer tarih;

}
