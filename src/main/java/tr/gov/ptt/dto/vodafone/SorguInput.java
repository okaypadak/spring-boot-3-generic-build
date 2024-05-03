package tr.gov.ptt.dto.vodafone;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SorguInput {
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
    private String nameSurname;
}
