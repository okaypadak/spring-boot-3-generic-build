package dev.padak.backend.dto.vodafone;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class MutabakatInput {
    private String transactionId;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime transactionDate;
    private int companyId;
    private int institutionId;
    private int stan;
    private String correlationId;
    private String ipAddress;
    private OriginatorInfo originatorInfo;
    private int currency;
    private String description;
    private String reconDate;
    private List<ReconData> reconDataList;
}
