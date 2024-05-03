package dev.padak.backend.dto.request;

import lombok.Data;

@Data
public class RequestTalimat<T> {
    private String kurum;
    private String kanal;
    private T detay;

}
