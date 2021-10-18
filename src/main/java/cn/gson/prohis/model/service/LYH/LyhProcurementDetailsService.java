package cn.gson.prohis.model.service.LYH;

import cn.gson.prohis.model.mapper.LYH.LyhProcurementDetailsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LyhProcurementDetailsService {

    @Resource
    LyhProcurementDetailsMapper bs;

public void updateById(Integer numbers ,Integer proId){
    bs.updateById(numbers,proId);
}



}
