package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.ZsxCharge;
import cn.gson.prohis.model.service.ZSX.ZsxchargeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ZsxChargeController {
    @Resource
    ZsxchargeService chargeService;

    @RequestMapping("/charge")
    @ResponseBody
    public List<ZsxCharge> findByCharge(){
        return chargeService.findByCharge();
    }


    @PostMapping("/saveCharge")
    public void saveCharge(@RequestBody ZsxCharge charge){
        chargeService.saveCharge(charge);
    }

}
