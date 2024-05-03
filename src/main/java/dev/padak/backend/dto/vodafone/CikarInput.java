package dev.padak.backend.dto.vodafone;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CikarInput {
    private int companyId;
    private int institutionId;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime transactionDate;
    private int stan;
    private String msisdn;
    private String customerCode;
    private String customerReferenceType;
    private String description;
    private OriginatorInfo originatorInfo;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime acceptanceDate;
}
