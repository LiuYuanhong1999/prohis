package cn.gson.prohis.model.service.LYH;

import cn.gson.prohis.model.mapper.LYH.LyhDrugRecordMapper;
import cn.gson.prohis.model.pojos.LyhDrugRecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhDrugRecordService {

    @Resource
    LyhDrugRecordMapper drugRecordMapper;


    public List<LyhDrugRecord> findAll(){
      return   drugRecordMapper.findDrugRecord();
    }

}
