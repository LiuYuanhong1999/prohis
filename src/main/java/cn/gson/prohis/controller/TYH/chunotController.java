package cn.gson.prohis.controller.TYH;

import cn.gson.prohis.model.pojos.TyhChunotEntity;
import cn.gson.prohis.model.pojos.TyhHosregEntity;
import cn.gson.prohis.model.service.TYH.chunotService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class chunotController {
    @Resource
    chunotService chunotService;

    @RequestMapping("/find-chunot")
    public List<TyhChunotEntity> findchunot(String cha){
        return chunotService.findchunot(cha);
    }

    @RequestMapping("/find-chureg")
    public List<TyhHosregEntity> findchureg(){
        return chunotService.findchureg();
    }

    @RequestMapping("/find-xreg")
    public TyhHosregEntity findchureg2(String num){
        return chunotService.findchureg2(num);
    }

    @PostMapping("/add-chunot")
    public void addchunot(@RequestBody TyhChunotEntity tyhChunotEntity){
        chunotService.addchunot(tyhChunotEntity);
    }

    @RequestMapping("/del-chunot")
    public void delchunot(String chuId,String zhuId){
        chunotService.delchunot(chuId,zhuId);
    }
}
