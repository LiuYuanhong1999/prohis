package cn.gson.prohis.model.service.LYH;

import cn.gson.prohis.model.mapper.LYH.LyhPharmacyRecordMapper;
import cn.gson.prohis.model.pojos.LyhPharmacyRecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhPharmacyRecordService {

    @Resource
    LyhPharmacyRecordMapper pharmacyRecordMapper;


    public List<LyhPharmacyRecord> findAll(){
      return   pharmacyRecordMapper.findRecord();
    }

}
