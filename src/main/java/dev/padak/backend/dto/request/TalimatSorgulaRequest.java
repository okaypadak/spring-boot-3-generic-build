package dev.padak.backend.dto.request;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class TalimatSorgulaRequest {

	private String telefonNo;
	private String adSoyad;
	private String hvkNo;

}
