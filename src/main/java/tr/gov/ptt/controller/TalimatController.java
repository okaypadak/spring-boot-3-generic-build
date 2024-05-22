package tr.gov.ptt.controller;

import tr.gov.ptt.dto.request.*;
import tr.gov.ptt.dto.MutabakatDTO;
import tr.gov.ptt.dto.response.TalimatGenelResponse;
import tr.gov.ptt.kanal.IChannel;
import tr.gov.ptt.kurulum.KanalYukleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TalimatController {

    @Autowired
    private KanalYukleService kanalYukleService;


    @PostMapping("/talimatSorgula")
    @ResponseBody
    public TalimatGenelResponse<?> talimatSorgula(@RequestBody TalimatSorgulaRequest request) throws Exception {

        IChannel process = kanalYukleService.getKanal(request.getKanal(), request.getKurum());
        return process.talimatSorgula(request);

    }

    @PostMapping("/talimatEkle")
    @ResponseBody
    public TalimatGenelResponse<?> talimatEkle(@RequestBody TalimatEkleRequest request) throws Exception {

        IChannel channel = kanalYukleService.getKanal(request.getKanal(), request.getKurum());
        return channel.talimatEkle(request);
    }

    @PostMapping("/talimatCikar")
    @ResponseBody
    public TalimatGenelResponse<?> talimatCikar(@RequestBody TalimatCikarRequest request) throws Exception {

        IChannel channel = kanalYukleService.getKanal(request.getKanal(), request.getKurum());
        return channel.talimatCikar(request);
    }

    @PostMapping("/mutabakatSorgu")
    @ResponseBody
    public MutabakatDTO mutabakatSorgu(@RequestBody MutabakatRequest request) throws Exception {

        IChannel channel = kanalYukleService.getKanal(request.getKanal(), request.getKurum());
        return channel.mutabakatSorgu(request.getTarih());
    }
}
