package dev.padak.backend.dto.vodafone;

import lombok.Data;

@Data
public class OriginatorInfo {
    private int city;
    private String branch;
    private String teller;
    private String user;
}
