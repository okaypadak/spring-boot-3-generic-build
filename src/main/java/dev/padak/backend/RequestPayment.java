package dev.padak.backend;

import lombok.Data;

@Data
public class RequestPayment {
    private String method;
    private Double amount;
}
