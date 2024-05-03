package dev.padak.backend.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TalimatEkleRequest {

	private Long hesapId;
	private String hesapNo;
	private String telefonNo;
	private String adSoyad;
	private String ibanNo;

}