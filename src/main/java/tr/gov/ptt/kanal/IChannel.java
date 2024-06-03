package tr.gov.ptt.kanal;

import tr.gov.ptt.dto.MutabakatDTO;
import tr.gov.ptt.dto.output.MutakabatKapatResponse;
import tr.gov.ptt.dto.output.TalimatOutput;
import tr.gov.ptt.dto.request.MutabakatKapatRequest;
import tr.gov.ptt.dto.request.TalimatCikarRequest;
import tr.gov.ptt.dto.request.TalimatEkleRequest;
import tr.gov.ptt.dto.request.TalimatSorgulaRequest;
import tr.gov.ptt.dto.response.TalimatGenelResponse;

public interface IChannel {

    TalimatGenelResponse talimatSorgula(TalimatSorgulaRequest input);
    TalimatGenelResponse talimatEkle(TalimatEkleRequest input);

    TalimatGenelResponse talimatCikar(TalimatCikarRequest input);
    MutabakatDTO mutabakatSorgu(Integer input);
    MutakabatKapatResponse mutabakatKapat(MutabakatKapatRequest input);

}
