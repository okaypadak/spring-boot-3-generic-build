package tr.gov.ptt.controller;

import tr.gov.ptt.dto.request.RequestTalimat;
import tr.gov.ptt.dto.MutabakatDTO;
import tr.gov.ptt.dto.request.MutabakatSorguRequest;
import tr.gov.ptt.dto.request.TalimatCikarRequest;
import tr.gov.ptt.dto.request.GenelEkleRequest;
import tr.gov.ptt.dto.request.TalimatSorgulaRequest;
import tr.gov.ptt.dto.response.TalimatGenelResponse;
import tr.gov.ptt.kanal.IProcess;
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
    public TalimatGenelResponse<?> talimatSorgula(@RequestBody RequestTalimat<TalimatSorgulaRequest> request) throws Exception {

        IProcess process = kanalYukleService.getKanal(request.getKanal(), request.getKurum());
        process.setKurum(request.getKurum());
        return process.talimatSorgula(TalimatSorgulaRequest.builder().telefonNo(request.getDetay().getTelefonNo()).hvkNo(request.getDetay().getHvkNo()).build());

    }

    @PostMapping("/talimatEkle")
    @ResponseBody
    public TalimatGenelResponse<?> talimatEkle(@RequestBody RequestTalimat<GenelEkleRequest> request) throws Exception {

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
