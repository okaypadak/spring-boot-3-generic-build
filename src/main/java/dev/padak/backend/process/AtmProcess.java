package dev.padak.backend.process;

import dev.padak.backend.payment.IClient;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Lazy
@NoArgsConstructor
public class AtmProcess extends BaseProcess {

//    @Autowired
//    private TandemClient tandemClient;

}
