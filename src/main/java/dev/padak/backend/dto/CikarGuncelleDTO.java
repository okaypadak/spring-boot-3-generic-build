package dev.padak.backend.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class CikarGuncelleDTO {

    private String telefonNo;
    private Integer stan;
}