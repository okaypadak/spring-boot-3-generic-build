package dev.padak.backend.client;

import dev.padak.backend.dto.CikarDTO;
import dev.padak.backend.dto.output.TalimatOutput;
import dev.padak.backend.dto.request.MutabakatKapatRequest;
import dev.padak.backend.dto.request.TalimatEkleRequest;
import dev.padak.backend.dto.request.TalimatSorgulaRequest;
import org.springframework.stereotype.Component;

@Component
public interface IClient<T> {

    void setKurum(String kurum);

    TalimatOutput<?> sorgula(TalimatSorgulaRequest input) throws Exception;
    TalimatOutput<?> ekle(TalimatEkleRequest input) throws Exception;
    TalimatOutput<?> cikar(CikarDTO input) throws Exception;
    TalimatOutput<?> mutabakatKapat(MutabakatKapatRequest input) throws Exception;

}
