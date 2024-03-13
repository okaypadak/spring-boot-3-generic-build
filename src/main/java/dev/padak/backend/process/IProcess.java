package dev.padak.backend.process;

public interface IProcess {
    void payLoad(Double number);

    void payLoadCancel(Integer targetDateAsInt);

}
