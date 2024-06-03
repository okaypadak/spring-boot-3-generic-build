package tr.gov.ptt.client;

import tr.gov.ptt.dto.output.MutakabatKapatResponse;
import tr.gov.ptt.dto.output.TalimatOutput;
import tr.gov.ptt.dto.request.MutabakatKapatRequest;
import tr.gov.ptt.dto.request.TalimatEkleRequest;
import tr.gov.ptt.dto.request.TalimatSorgulaRequest;
import org.springframework.stereotype.Component;
import tr.gov.ptt.entity.TalimatEntity;

@Component
public interface IClient {

    TalimatOutput sorgula(TalimatSorgulaRequest input);
    TalimatOutput ekle(TalimatEkleRequest input);
    TalimatOutput cikar(TalimatEntity input);
    MutakabatKapatResponse mutabakatKapat(MutabakatKapatRequest input);

}
