package tr.gov.ptt.kanal;

import tr.gov.ptt.dto.MutabakatDTO;
import tr.gov.ptt.dto.request.TalimatCikarRequest;
import tr.gov.ptt.dto.request.TalimatEkleRequest;
import tr.gov.ptt.dto.request.TalimatSorgulaRequest;
import tr.gov.ptt.dto.response.TalimatGenelResponse;

public interface IChannel {

    TalimatGenelResponse talimatSorgula(TalimatSorgulaRequest input) throws Exception;
    TalimatGenelResponse talimatEkle(TalimatEkleRequest input) throws Exception;

    TalimatGenelResponse talimatCikar(TalimatCikarRequest input) throws Exception;
    MutabakatDTO mutabakatSorgu(Integer input) throws Exception;

}
