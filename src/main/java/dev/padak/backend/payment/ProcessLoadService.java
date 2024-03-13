package dev.padak.backend.payment;

import dev.padak.backend.payment.IClient;
import dev.padak.backend.process.AtmProcess;
import dev.padak.backend.process.DefaultProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProcessLoadService {

    private final ApplicationContext applicationContext;
    Map<String, AtmProcess> processATM = new HashMap<>();
    Map<String, DefaultProcess> processDEFAULT = new HashMap<>();

    @Autowired
    public ProcessLoadService(Map<String, IClient> bean, ApplicationContext applicationContext) {

        this.applicationContext = applicationContext;

        for (IClient tek : bean.values()) {

            String beanName = tek.getClass().getSimpleName();

            processDEFAULT.put(beanName, createDefault(tek));
            processATM.put(beanName, createATM(tek));

        }
    }

    private DefaultProcess createDefault(IClient client) {
        DefaultProcess process = (DefaultProcess) applicationContext.getBean("defaultProcess");
        process.setClient(client);
        return process;
    }

    private AtmProcess createATM(IClient client) {
        AtmProcess process = (AtmProcess) applicationContext.getBean("atmProcess");
        process.setClient(client);
        return process;
    }

    public AtmProcess getATM(String methodName) {
        return (AtmProcess) processATM.get(methodName);
    }
    public DefaultProcess getDEFAULT(String methodName) {
        return (DefaultProcess) processDEFAULT.get(methodName);
    }


}
