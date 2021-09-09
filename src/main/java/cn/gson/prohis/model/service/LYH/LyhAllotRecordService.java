package cn.gson.prohis.model.service.LYH;


import cn.gson.prohis.model.mapper.LYH.LyhAllotRecordMapper;
import cn.gson.prohis.model.pojos.LyhAllotRecordEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhAllotRecordService {

    @Resource
    LyhAllotRecordMapper bs;





    public List<LyhAllotRecordEntity> findAll(){
        return bs.findAll();
    }



}
