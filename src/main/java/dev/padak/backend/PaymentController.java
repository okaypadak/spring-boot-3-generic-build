package dev.padak.backend;

import dev.padak.backend.Client.BaseMoneyService;
import dev.padak.backend.Client.ClientLoadService;
import dev.padak.backend.process.DefaultProcess;
import dev.padak.backend.payment.ProcessLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PaymentController {
    @Autowired
    private ClientLoadService clientLoadService;

    @Autowired
    private ProcessLoadService processLoadService;


    @PostMapping("/load-money")
    @ResponseBody
    public String loadMoneyBasic(@RequestBody RequestPayment request) {
        BaseMoneyService selectedBaseMoneyService = clientLoadService.getClient(request.getMethod());
        if (selectedBaseMoneyService != null) {
            selectedBaseMoneyService.loadMoney(request.getAmount());
            return "Money loaded via " + request.getMethod() + " successfully";
        } else {
            return "Invalid payment method";
        }
    }

    @PostMapping("/load-money-canal")
    @ResponseBody
    public String loadMoney(@RequestBody RequestPayment request) {
        DefaultProcess selected = processLoadService.getDEFAULT(request.getMethod());
        if (selected != null) {
            selected.payLoad(request.getAmount());
            return "Money loaded via " + request.getMethod() + " successfully";
        } else {
            return "Invalid payment method";
        }
    }
}
