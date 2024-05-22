package tr.gov.ptt.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.gov.ptt.dto.Kullanici;
import tr.gov.ptt.enumeration.Kanal;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseRequest {

    @NotNull
    private Kanal kanal;
    @NotNull
    private Kullanici kullanici;

}
