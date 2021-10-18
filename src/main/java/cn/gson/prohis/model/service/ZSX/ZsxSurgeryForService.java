package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxSurgeryForMapper;
import cn.gson.prohis.model.pojos.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ZsxSurgeryForService {
    @Resource
    ZsxSurgeryForMapper surgeryForMapper;

    public List<ZsxSurgeryFor> findPrescription(){
        return surgeryForMapper.findPrescription();
    }

    public List<ZsxSurgeryFor> findRecipe(){
        return surgeryForMapper.findRecipe();
    }


    public List<ZsxPrescriptionDetails> selectPrescription(){
        return surgeryForMapper.selectPrescription();
    }


    public List<TyhRecipedetailEntity> selectRecipe(){
        return surgeryForMapper.selectRecipe();
    }

    public void savePrescription(ZsxSurgeryFor surgeryFor){
        if(surgeryFor.getSurgeryForId()==0){
            surgeryFor.setPrescriptionId(surgeryFor.getPrescription().getPrescriptionId());
            surgeryFor.setSurgeryForStaff(0);
            surgeryForMapper.addPrescription(surgeryFor);
        }else{
            surgeryFor.setPrescriptionId(surgeryFor.getPrescription().getPrescriptionId());
            surgeryForMapper.updatePrescription(surgeryFor);
        }

    }

    public void saveRecipe(ZsxSurgeryFor surgeryFor){
        if (surgeryFor.getSurgeryForId()==0){
            surgeryFor.setRecipeId(surgeryFor.getRecipe().getRecipeId());
            surgeryFor.setSurgeryForStaff(0);
            surgeryForMapper.addRecipe(surgeryFor);
        }else{
            surgeryFor.setRecipeId(surgeryFor.getRecipe().getRecipeId());
            surgeryForMapper.updateRecipe(surgeryFor);
        }
    }

    public void updateSurgeryForStaff(String surgeryForNumber){
        surgeryForMapper.updateSurgeryForStaff(surgeryForNumber);
    }
}
