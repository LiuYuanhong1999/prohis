package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.ZsxCharge;
import cn.gson.prohis.model.service.ZSX.ZsxchargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ZsxChargeController {
    @Autowired
    ZsxchargeService chargeService;

    @RequestMapping("/charge")
    @ResponseBody
    public List<ZsxCharge> findByCharge(){
        return chargeService.findByCharge();
    }
}
