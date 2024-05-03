package dev.padak.backend.dto.input;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class TelekomInput {

	private String telefonNo;
	private String adSoyad;
	private Long hesapId;

}
