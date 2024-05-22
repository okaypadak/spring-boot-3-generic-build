package tr.gov.ptt.dto.vodafone;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CikarOutput {
    private String responseCode;
    private String responseCodeDesc;
    //@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private String requestTimestamp;
    private String correlationId;
    private int companyId;
    private int institutionId;
    //@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private String transactionDate;
    private int stan;
    private String msisdn;
    private String customerCode;
    private String customerReferenceType;
    private OriginatorInfo originatorInfo;
    //@JsonFormat(pattern = "yyyy-MM-dd")
    private String acceptanceDate;
}


