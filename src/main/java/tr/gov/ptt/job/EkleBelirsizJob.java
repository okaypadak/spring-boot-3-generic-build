package tr.gov.ptt.job;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.core.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tr.gov.ptt.client.IClient;
import tr.gov.ptt.dto.AraIslemOutput;
import tr.gov.ptt.dto.Kullanici;
import tr.gov.ptt.dto.output.TalimatOutput;
import tr.gov.ptt.dto.request.TalimatSorgulaRequest;
import tr.gov.ptt.enumeration.Kurum;
import tr.gov.ptt.service.TalimatService;

import java.util.Map;

@Component
@Slf4j
@RequiredArgsConstructor
public class EkleBelirsizJob {

    private final TalimatService talimatService;
    private final Map<String, IClient> clients;


    @Scheduled(zone = "Europe/Istanbul", cron = "0 0/5 * * * ?")
    @SchedulerLock(name = "TaskScheduler_ekleBelirsizleriDuzelt", lockAtLeastForString = "PT2M", lockAtMostForString = "PT15M")
    protected void scan() {

        talimatService.ekleBelirsizleriGetir().forEach(tek -> {

            try {

                Kullanici kullanici = new Kullanici(tek.getKullaniciId(),tek.getMerkezId(), tek.getSubeId(), tek.getGiseNo());
                TalimatSorgulaRequest talimatSorgulaRequest = new TalimatSorgulaRequest(Kurum.valueOf(tek.getKurum()), tek.getTelefonNo(), tek.getAdSoyad(), tek.getHesapNo());
                talimatSorgulaRequest.setKullanici(kullanici);

                TalimatOutput sorgu = clients.get(tek.getKurum() + "Client").sorgula(talimatSorgulaRequest);

                if(sorgu.getSonuc()) {
                    talimatService.durumlariGuncelle(tek, 5, 5);
                } else {
                    TalimatOutput<AraIslemOutput> response = clients.get(tek.getKurum() + "Client").cikar(tek);

                    if (response.getSonuc()) {
                        talimatService.guncelleIptalClient(tek, response.getDetay().getStan(), 5);
                    }

                }


            } catch (Exception e) {
                log.warn("Belirsiz işlem aşamasında Client hata: kurum: {}, telefon: {}, hata: {}", tek.getKurum(), tek.getTelefonNo(), e.getMessage());
            }

        });
    }


}
