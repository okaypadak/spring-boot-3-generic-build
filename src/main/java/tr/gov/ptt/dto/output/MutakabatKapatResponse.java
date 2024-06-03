package tr.gov.ptt.dto.output;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MutakabatKapatResponse {

	private Boolean sonuc;
	private String aciklama;

}
