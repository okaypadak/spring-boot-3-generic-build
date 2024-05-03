package dev.padak.backend.dto.response;

import lombok.Data;

@Data
public class VodafoneResponse {
    private String responseCode;
    private String responseDesc;
    private String correlationId;
    private String requestTimestamp;
    private String errorDetails;
}
