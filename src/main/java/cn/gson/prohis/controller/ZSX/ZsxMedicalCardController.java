package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.ZsxPatientData;
import cn.gson.prohis.model.service.ZSX.ZsxMedicalCardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ZsxMedicalCardController {
    @Resource
    ZsxMedicalCardService medicalCardService;

    /*
    * 根据病人查询出诊疗卡和诊疗卡充值记录
    * */
    @RequestMapping("/medicalCard")
    @ResponseBody
    public List<ZsxPatientData> findByMedicalCard(){
        return medicalCardService.findByMedicalCard();
    }
}
