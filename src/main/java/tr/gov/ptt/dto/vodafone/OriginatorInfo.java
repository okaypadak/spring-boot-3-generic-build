package tr.gov.ptt.dto.vodafone;

import lombok.Data;

@Data
public class OriginatorInfo {
    private int city;
    private String branch;
    private String teller;
    private String user;
}
