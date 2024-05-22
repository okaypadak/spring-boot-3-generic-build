package tr.gov.ptt.dto.tandem;

import lombok.Data;

import java.util.List;

@Data
public class PCHListResponse {
    private String code;
    private String msg;
    private List<Hesap> hesaplar;

    @Data
    static class Hesap {
        private String hesapno;
        private String adSoyad;
        private String unvan1;
        private String unvan2;
        private String unvan3;
        private String paraTuru;
        private String ibanno;
    }
}
