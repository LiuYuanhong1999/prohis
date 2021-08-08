package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.ZsxMedicalCardRecord;
import cn.gson.prohis.model.pojos.ZsxPatientData;
import cn.gson.prohis.model.service.ZSX.ZsxMedicalCardService;
import org.springframework.web.bind.annotation.*;

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

    /*
    * 新增修改病人、诊疗卡
    * */
    @PostMapping("/saveMedicalCard")
    public void saveMedical(@RequestBody ZsxPatientData patientData){
        medicalCardService.saveMedicalCard(patientData);
    }
    /*
    * 新增充值记录
    * */
    @PostMapping("/add-record")
    public void addMedicalCardRecord(@RequestBody ZsxMedicalCardRecord medicalCardRecord){
        medicalCardService.addMedicalCardRecord(medicalCardRecord);
    }
}
