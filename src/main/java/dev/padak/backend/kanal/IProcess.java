package dev.padak.backend.kanal;

import dev.padak.backend.dto.MutabakatDTO;
import dev.padak.backend.dto.request.TalimatCikarRequest;
import dev.padak.backend.dto.request.TalimatEkleRequest;
import dev.padak.backend.dto.request.TalimatSorgulaRequest;
import dev.padak.backend.dto.response.TalimatGenelResponse;

public interface IProcess {

    void setKurum(String kurum);

    TalimatGenelResponse talimatSorgula(TalimatSorgulaRequest input) throws Exception;
    TalimatGenelResponse talimatEkle(TalimatEkleRequest input) throws Exception;

    TalimatGenelResponse talimatCikar(TalimatCikarRequest input) throws Exception;
    MutabakatDTO mutabakatSorgu(Integer input) throws Exception;

}
