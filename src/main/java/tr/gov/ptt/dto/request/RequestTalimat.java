package tr.gov.ptt.dto.request;

import lombok.Data;

@Data
public class RequestTalimat<T> {
    private String kurum;
    private String kanal;
    private T detay;

}
