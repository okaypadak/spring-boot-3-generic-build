package tr.gov.ptt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
public class Kullanici {
    @NotNull(message = "Kullanıcı Id boş olamaz.")
    private Integer kullaniciId;
    @NotNull(message = "Başmüdürlük Id boş olamaz.")
    private Integer merkezId;
    @NotNull(message = "Şube Id boş olamaz.")
    private Integer subeId;
    @NotNull(message = "Gişe No boş olamaz.")
    private Integer giseNo;
}