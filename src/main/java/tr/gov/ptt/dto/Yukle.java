package tr.gov.ptt.dto;

import tr.gov.ptt.client.IClient;
import tr.gov.ptt.service.IService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.gov.ptt.client.IClient;
import tr.gov.ptt.service.IService;
import tr.gov.ptt.client.IClient;
import tr.gov.ptt.service.IService;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Yukle {
    private String ad;
    private IClient client;
    private IService service;
}
