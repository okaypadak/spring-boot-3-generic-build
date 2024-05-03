package dev.padak.backend.dto.vodafone;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class SorguOutput {
    private String responseCode;
    private String responseCodeDesc;
    private String requestTimestamp;
    private String correlationId;
    private int companyId;
    private int institutionId;
    private String transactionDate;
    private String msisdn;
    private String customerCode;
    private String customerReferenceType;
    private String description;
    private OriginatorInfo originatorInfo;
    private List<Details> details;
}
