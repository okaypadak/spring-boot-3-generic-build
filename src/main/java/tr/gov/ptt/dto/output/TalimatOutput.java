package tr.gov.ptt.dto.output;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TalimatOutput<T> {

	private String sonuc;
	private String aciklama;
	private T detay;

}
