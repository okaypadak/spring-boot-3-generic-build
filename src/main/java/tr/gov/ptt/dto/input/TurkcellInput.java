package tr.gov.ptt.dto.input;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class TurkcellInput {

	private String telefonNo;
	private String adSoyad;

}
