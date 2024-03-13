package dev.padak.backend.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class ClientLoadService {

    private final Map<String, BaseMoneyService> paymentMethods = new HashMap<>();

    @Autowired
    public ClientLoadService(Map<String, BaseMoneyService> paymentMethodBeans) {
        for (BaseMoneyService baseMoneyService : paymentMethodBeans.values()) {
            String paymentMethodName = baseMoneyService.getClass().getSimpleName();
            paymentMethods.put(paymentMethodName, baseMoneyService);
        }
    }

    public BaseMoneyService getClient(String methodName) {
        return paymentMethods.get(methodName);
    }
}
