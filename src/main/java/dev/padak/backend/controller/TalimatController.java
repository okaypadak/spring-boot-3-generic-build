package dev.padak.backend.controller;

import dev.padak.backend.dto.request.RequestTalimat;
import dev.padak.backend.dto.MutabakatDTO;
import dev.padak.backend.dto.request.MutabakatSorguRequest;
import dev.padak.backend.dto.request.TalimatCikarRequest;
import dev.padak.backend.dto.request.TalimatEkleRequest;
import dev.padak.backend.dto.request.TalimatSorgulaRequest;
import dev.padak.backend.dto.response.TalimatGenelResponse;
import dev.padak.backend.kanal.IProcess;
import dev.padak.backend.kurulum.KanalYukleService;
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
    public TalimatGenelResponse<?> talimatSorgula(@RequestBody RequestTalimat<TalimatSorgulaRequest> request) throws Exception {

        IProcess process = kanalYukleService.getKanal(request.getKanal(), request.getKurum());
        process.setKurum(request.getKurum());
        return process.talimatSorgula(TalimatSorgulaRequest.builder().telefonNo(request.getDetay().getTelefonNo()).hvkNo(request.getDetay().getHvkNo()).build());

    }

    @PostMapping("/talimatEkle")
    @ResponseBody
    public TalimatGenelResponse<?> talimatEkle(@RequestBody RequestTalimat<TalimatEkleRequest> request) throws Exception {

        IProcess process = kanalYukleService.getKanal(request.getKanal(), request.getKurum());
        process.setKurum(request.getKurum());
        return process.talimatEkle(request.getDetay());
    }

    @PostMapping("/talimatCikar")
    @ResponseBody
    public TalimatGenelResponse<?> talimatCikar(@RequestBody RequestTalimat<TalimatCikarRequest> request) throws Exception {

        IProcess process = kanalYukleService.getKanal(request.getKanal(), request.getKurum());
        process.setKurum(request.getKurum());
        return process.talimatCikar(request.getDetay());
    }

    @PostMapping("/mutabakatSorgu")
    @ResponseBody
    public MutabakatDTO mutabakatSorgu(@RequestBody RequestTalimat<MutabakatSorguRequest> request) throws Exception {

        IProcess process = kanalYukleService.getKanal(request.getKanal(), request.getKurum());
        process.setKurum(request.getKurum());
        return process.mutabakatSorgu(request.getDetay().getTarih());
    }
}
