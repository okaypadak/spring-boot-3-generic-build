package dev.padak.backend.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EkleDTO {
    private Integer stan;
    private String telefonNo;
}
