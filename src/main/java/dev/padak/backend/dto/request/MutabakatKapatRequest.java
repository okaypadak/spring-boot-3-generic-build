package dev.padak.backend.dto.request;

import lombok.Data;

@Data
public class MutabakatKapatRequest {
    private Integer ekleAdet;
    private Integer cikarAdet;
    private String tarih;
}
