package cn.gson.prohis.model.service.LYH;


import cn.gson.prohis.model.mapper.LYH.lyhProcurementMapper;
import cn.gson.prohis.model.pojos.LyhProcurementEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class lyhProcurementService {
    @Resource
    lyhProcurementMapper bs;

    public void addProcurement(LyhProcurementEntity lyhProcurementEntity){
        bs.insertBy(lyhProcurementEntity);
    }
}
