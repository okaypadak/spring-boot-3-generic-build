package tr.gov.ptt.job;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.core.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tr.gov.ptt.client.IClient;
import tr.gov.ptt.service.TalimatService;
import tr.gov.ptt.service.TandemService;

import java.util.Map;

@Component
@Slf4j
@RequiredArgsConstructor
public class CikisBelirsizJob {

    private final TandemService tandemService;

    private final Map<String, IClient> clients;
    private final TalimatService talimatService;

    //TODO ÇAKIŞMALARIN ÖNÜNE GEÇECEK ÇÖZÜM
    //SHEDLOCK
    @Scheduled(zone = "Europe/Istanbul", cron = "0 0/5 * * * ?")
    @SchedulerLock(name = "TaskScheduler_cikisBelirsizleriDuzelt", lockAtLeastForString = "PT2M", lockAtMostForString = "PT15M")
    protected void scan() {

        talimatService.cikisBelirsizleriGetir().forEach(tek -> {

            if(tek.getDurum() == 2) {
                try {
                    clients.get(tek.getKurum()+"Client").cikar(tek);
                    talimatService.clientDurumGuncelle(tek, 5);
                    log.info("Batch çalıştı, talimat client çıkarma işlemi başarılı, kurum: {}, telefon: {}",tek.getKurum(), tek.getTelefonNo());
                } catch (Exception e) {
                    log.warn("Belirsiz işlem aşamasında Client hata: kurum: {}, telefon: {}, hata: {}",tek.getKurum(), tek.getTelefonNo(), e.getMessage());
                }
            }

            if(tek.getTandemDurum() == 2) {
                try {
                    tandemService.talimatCikar(tek);
                    talimatService.tandemDurumGuncelle(tek, 5);
                    log.info("Batch çalıştı, talimat TANDEM çıkarma işlemi başarılı, kurum: {}, telefon: {}",tek.getKurum(), tek.getTelefonNo());
                } catch (Exception e) {
                    log.warn("Belirsiz işlem aşamasında TANDEM hata: kurum: {}, telefon: {}, hata: {}",tek.getKurum(), tek.getTelefonNo(), e.getMessage());
                }
            }

        });
    }


}
