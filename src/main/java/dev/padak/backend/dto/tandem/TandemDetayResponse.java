package dev.padak.backend.dto.tandem;

import dev.padak.backend.dto.request.TalimatEkleRequest;
import dev.padak.backend.dto.response.TalimatGenelResponse;
import dev.padak.backend.dto.response.TelekomSorguResponse;
import lombok.Data;

@Data
public class TandemDetayResponse {

	private TandemDetay[] hesaplar;
	
}
