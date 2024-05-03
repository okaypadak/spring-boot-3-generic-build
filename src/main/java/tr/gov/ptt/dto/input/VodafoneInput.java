package tr.gov.ptt.dto.input;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class VodafoneInput {

	private String telefonNo;
	private String adSoyad;
	private String hvkNo;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime talimatTarihi;

}
