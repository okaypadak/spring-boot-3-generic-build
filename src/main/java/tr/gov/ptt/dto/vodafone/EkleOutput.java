package tr.gov.ptt.dto.vodafone;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EkleOutput {
    private String responseCode;
    private String responseCodeDesc;
    private String requestTimestamp;
    private String correlationId;
    private int companyId;
    private int institutionId;
    private String transactionDate;
    private int stan;
    private String msisdn;
    private String customerCode;
    private String customerReferenceType;
    private OriginatorInfo originatorInfo;
    private String acceptanceDate;
}
