package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.TyhRecipedetailEntity;
import cn.gson.prohis.model.pojos.ZsxPrescription;
import cn.gson.prohis.model.pojos.ZsxPrescriptionDetails;
import cn.gson.prohis.model.pojos.ZsxSurgeryFor;
import cn.gson.prohis.model.service.ZSX.ZsxSurgeryForService;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/select_prescription")
    public List<ZsxPrescriptionDetails> selectPrescription(){
        return surgeryForService.selectPrescription();
    }

    @RequestMapping("/select_recipe")
    public List<TyhRecipedetailEntity> selectRecipe(){
        return surgeryForService.selectRecipe();
    }

    @PostMapping("/save_prescription")
    public void savePrescription(@RequestBody ZsxSurgeryFor surgeryFor){
        surgeryForService.savePrescription(surgeryFor);
    }

    @PostMapping("/save_recipe")
    public void saveRecipe(@RequestBody ZsxSurgeryFor surgeryFor){
        surgeryForService.saveRecipe(surgeryFor);
    }

    @RequestMapping("/update_surgery_for_staff")
    public void updateSurgeryForStaff(String surgeryForNumber){
        surgeryForService.updateSurgeryForStaff(surgeryForNumber);
    }
}
