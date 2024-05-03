package tr.gov.ptt.client;

import tr.gov.ptt.dto.CikarDTO;
import tr.gov.ptt.dto.output.TalimatOutput;
import tr.gov.ptt.dto.request.MutabakatKapatRequest;
import tr.gov.ptt.dto.request.GenelEkleRequest;
import tr.gov.ptt.dto.request.TalimatSorgulaRequest;
import org.springframework.stereotype.Component;

@Component
public interface IClient<T> {

    void setKurum(String kurum);

    TalimatOutput<?> sorgula(TalimatSorgulaRequest input) throws Exception;
    TalimatOutput<?> ekle(GenelEkleRequest input) throws Exception;
    TalimatOutput<?> cikar(CikarDTO input) throws Exception;
    TalimatOutput<?> mutabakatKapat(MutabakatKapatRequest input) throws Exception;

}
