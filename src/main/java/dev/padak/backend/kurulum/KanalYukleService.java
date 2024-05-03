package dev.padak.backend.kurulum;

import dev.padak.backend.client.IClient;
import dev.padak.backend.kanal.IProcess;
import dev.padak.backend.kanal.MobilKanal;
import dev.padak.backend.kanal.WebKanal;
import dev.padak.backend.dto.Yukle;
import dev.padak.backend.service.IService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class KanalYukleService {

    private final ApplicationContext applicationContext;

    @Getter
    Map<String, IProcess> mobil = new HashMap<>();

    @Getter
    Map<String, IProcess> web = new HashMap<>();

    private final Map<String, Map<String, IProcess>> kanallar = new HashMap<>();

    @Autowired
    public KanalYukleService(Map<String, IClient> clients, Map<String, IService> services, ApplicationContext applicationContext) {

        this.applicationContext = applicationContext;

        List<Yukle> yukleList = new ArrayList<>();

        Arrays.stream(Kurum.values()).forEach(tek -> {
            yukleList.add(new Yukle(tek.getClientAdi().replace("Client",""),clients.get(tek.getClientAdi()), services.get(tek.getServiceAdi())));
        });


        yukleList.forEach(tek -> {
            web.put(tek.getAd(), createWeb(tek.getClient(),tek.getService()));
            mobil.put(tek.getAd(), createMobil(tek.getClient(),tek.getService()));
        });


        kanallar.put("web", web);
        kanallar.put("mobil", mobil);
    }

    private WebKanal createWeb(IClient client, IService servis) {
        WebKanal kanal = (WebKanal) applicationContext.getBean("webKanal");
        kanal.setClient(client);
        kanal.setService(servis);
        return kanal;
    }

    private MobilKanal createMobil(IClient client, IService servis) {
        MobilKanal kanal = (MobilKanal) applicationContext.getBean("mobilKanal");
        kanal.setClient(client);
        kanal.setService(servis);
        return kanal;
    }


    public IProcess getKanal(String kanalAdi, String kurum) {

        return kanallar.get(kanalAdi).get(Kurum.valueOf(kurum).name());

    }


}
