package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxMedicalCardMapper;
import cn.gson.prohis.model.pojos.ZsxPatientData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ZsxMedicalCardService {
    @Resource
    ZsxMedicalCardMapper medicalCardMapper;

    public List<ZsxPatientData> findByMedicalCard(){
        return medicalCardMapper.findByMedicalCard();
    }
}
