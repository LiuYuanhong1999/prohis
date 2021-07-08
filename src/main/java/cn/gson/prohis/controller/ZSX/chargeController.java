package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.ZCharge;
import cn.gson.prohis.model.service.ZSX.chargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class chargeController {
    @Autowired
    chargeService chargeService;

    @RequestMapping("/charge")
    @ResponseBody
    public List<ZCharge> findByCharge(){
        return chargeService.findByCharge();
    }
}
