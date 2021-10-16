package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxSurgeryForMapper;
import cn.gson.prohis.model.pojos.ZsxOperatingRoom;
import cn.gson.prohis.model.pojos.ZsxPrescription;
import cn.gson.prohis.model.pojos.ZsxSurgeryFor;
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

    public List<ZsxOperatingRoom> selectOperating(){
        return surgeryForMapper.selectOperating();
    }

    public List<ZsxPrescription> selectPrescription(){
        return surgeryForMapper.selectPrescription();
    }

    public List<ZsxPrescription> selectPatient(String prescriptionId){
        return surgeryForMapper.selectPatient(prescriptionId);
    }
}
