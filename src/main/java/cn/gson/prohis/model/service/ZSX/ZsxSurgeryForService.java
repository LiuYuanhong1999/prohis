package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxSurgeryForMapper;
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
}
