package dev.padak.backend.dto.response;

import dev.padak.backend.dto.tandem.TandemDetayResponse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TalimatGenelResponse<T> {
    private String sonuc;
    private String aciklama;
    private TandemDetayResponse tandemVeri;
    private T detay;

}
