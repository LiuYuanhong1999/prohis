package cn.gson.prohis.model.service.LYH;


import cn.gson.prohis.model.mapper.LYH.lyhProcurementDetailsMapper;
import cn.gson.prohis.model.mapper.LYH.lyhProcurementMapper;
import cn.gson.prohis.model.pojos.LyhProcurementDetailsEntity;
import cn.gson.prohis.model.pojos.LyhProcurementEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class lyhProcurementService {
    @Resource
    lyhProcurementMapper bs;

    @Resource
    lyhProcurementDetailsMapper ds;
    public void addProcurement(LyhProcurementEntity lyhProcurementEntity){
        bs.insertBy(lyhProcurementEntity);
        System.out.println(lyhProcurementEntity.getProcurementId());
        for (LyhProcurementDetailsEntity entity : lyhProcurementEntity.getLyhProcurementDetailsEntities()) {

            entity.setProcurementId(lyhProcurementEntity.getProcurementId());
            ds.insertDetails(entity);

        }


    }

    public List<LyhProcurementEntity> findAll(){
        return bs.findAll();
    }
}
