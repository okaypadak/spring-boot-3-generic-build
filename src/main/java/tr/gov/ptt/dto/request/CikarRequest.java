package tr.gov.ptt.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.gov.ptt.dto.Kullanici;
import tr.gov.ptt.enumeration.Kanal;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CikarRequest<T> {

    @NotNull
    private Kanal kanal;
    @NotNull
    private T istek;
}
