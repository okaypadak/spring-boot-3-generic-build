package tr.gov.ptt.kanal;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Lazy
@Slf4j
@NoArgsConstructor
public class MobilKanal extends TemelKanal {
    public void otherMethod() {
        System.out.println("otherDefaultMethod");
    }

}
