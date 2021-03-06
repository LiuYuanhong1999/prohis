package cn.gson.prohis.controller.TYH;

import cn.gson.prohis.model.pojos.TyhHosnotEntity;
import cn.gson.prohis.model.pojos.TyhHosregEntity;
import cn.gson.prohis.model.service.TYH.regService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class regController {
    @Resource
    regService regService;

    @RequestMapping("/findAll-reg")
    public List<TyhHosregEntity> findAll(String cha,String cha2){
        return regService.findAll(cha,cha2);
    }

    @RequestMapping("/find-not")
    public List<TyhHosnotEntity> findnot(){
        return regService.findnot();
    }

    @RequestMapping("/find-not2")
    public List<TyhHosnotEntity> findnot2(){
        return regService.findnot2();
    }

    @RequestMapping("/find-reg")
    public TyhHosnotEntity findreg(String num){
        return regService.findreg(num);
    }

    @RequestMapping("/find-regx")
    public TyhHosnotEntity findregx(String num){
        return regService.findregx(num);
    }

    @PostMapping("add-reg")
    public void addreg(@RequestBody TyhHosregEntity tyhHosregEntity){
        regService.addreg(tyhHosregEntity);
    }

    @RequestMapping("suoding-reg")
    public void suoding(String num){
        regService.suoding(num);
    }

    @RequestMapping("jiesuo-reg")
    public void jiesuo(String num){
        regService.jiesuo(num);
    }
}
