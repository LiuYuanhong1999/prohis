package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.ZsxOperatingRoom;
import cn.gson.prohis.model.pojos.ZsxPrescription;
import cn.gson.prohis.model.pojos.ZsxSurgeryFor;
import cn.gson.prohis.model.service.ZSX.ZsxSurgeryForService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ZsxSurgeryForController {
    @Resource
    ZsxSurgeryForService surgeryForService;

    @RequestMapping("/find_surgery_for_prescription")
    public List<ZsxSurgeryFor> findPrescription(){
        return surgeryForService.findPrescription();
    }
    @RequestMapping("/find_surgery_for_recipe")
    public List<ZsxSurgeryFor> findRecipe(){
        return surgeryForService.findRecipe();
    }

//    @RequestMapping("/select_operating")
//    public List<ZsxOperatingRoom> selectOperating(){
//        return surgeryForService.selectOperating();
//    }
    @RequestMapping("/select_prescription")
    public List<ZsxPrescription> selectPrescription(){
        return surgeryForService.selectPrescription();
    }

    @RequestMapping("/find-by-prescriptionId")
    @ResponseBody
    public List<ZsxPrescription> selectPatient(String prescriptionId){
        return surgeryForService.selectPatient(prescriptionId);
    }
}
