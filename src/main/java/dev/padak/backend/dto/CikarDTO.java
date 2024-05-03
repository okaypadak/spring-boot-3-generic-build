package dev.padak.backend.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class CikarDTO {

    private String telefonNo;
    private String adSoyad;
    private Long hesapId;
    private LocalDateTime talimatTarihi;
}
