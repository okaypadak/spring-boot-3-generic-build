package dev.padak.backend.dto;

import dev.padak.backend.client.IClient;
import dev.padak.backend.service.IService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Yukle {
    private String ad;
    private IClient client;
    private IService service;
}
