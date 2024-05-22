package tr.gov.ptt.kurulum;

import tr.gov.ptt.client.IClient;
import tr.gov.ptt.enumeration.Kanal;
import tr.gov.ptt.enumeration.Kurum;
import tr.gov.ptt.kanal.IChannel;
import tr.gov.ptt.kanal.IpcKanal;
import tr.gov.ptt.kanal.PostawebKanal;
import tr.gov.ptt.dto.Yukle;
import tr.gov.ptt.service.IService;
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
    Map<String, IChannel> ipc = new HashMap<>();

    @Getter
    Map<String, IChannel> web = new HashMap<>();

    private final Map<String, Map<String, IChannel>> kanallar = new HashMap<>();

    @Autowired
    public KanalYukleService(Map<String, IClient> clients, Map<String, IService> services, ApplicationContext applicationContext) {

        this.applicationContext = applicationContext;

        List<Yukle> yukleList = new ArrayList<>();

        Arrays.stream(Kurum.values()).forEach(tek -> {
            yukleList.add(new Yukle(tek.getClientAdi().replace("Client",""),clients.get(tek.getClientAdi()), services.get(tek.getServiceAdi())));
        });


        yukleList.forEach(tek -> {
            web.put(tek.getAd(), createWeb(tek.getClient(),tek.getService()));
            ipc.put(tek.getAd(), createIpc(tek.getClient(),tek.getService()));
        });


        kanallar.put("POSTAWEB", web);
        kanallar.put("IPC", ipc);
    }

    private PostawebKanal createWeb(IClient client, IService servis) {
        PostawebKanal kanal = (PostawebKanal) applicationContext.getBean("postawebKanal");
        kanal.setClient(client);
        kanal.setService(servis);
        return kanal;
    }

    private IpcKanal createIpc(IClient client, IService servis) {
        IpcKanal kanal = (IpcKanal) applicationContext.getBean("ipcKanal");
        kanal.setClient(client);
        kanal.setService(servis);
        return kanal;
    }


    public IChannel getKanal(Kanal kanal, Kurum kurum) {

        return kanallar.get(kanal.getAciklama()).get(kurum.name());

    }


}
