package dev.padak.backend.process;

import dev.padak.backend.payment.IClient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public abstract class BaseProcess implements IProcess {

    @Getter
    @Setter
    private IClient client;

    @Override
    public void payLoad(Double number) {

    }

    @Override
    public void payLoadCancel(Integer targetDateAsInt) {

    }

}
