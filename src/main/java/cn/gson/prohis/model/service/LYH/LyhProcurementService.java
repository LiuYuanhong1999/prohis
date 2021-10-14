package cn.gson.prohis.model.service.LYH;


import cn.gson.prohis.model.mapper.LYH.LyhProcurementDetailsMapper;
import cn.gson.prohis.model.mapper.LYH.LyhProcurementMapper;
import cn.gson.prohis.model.pojos.LyhProcurementDetailsEntity;
import cn.gson.prohis.model.pojos.LyhProcurementEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class LyhProcurementService {
    @Resource
    LyhProcurementMapper bs;

    @Resource
    LyhProcurementDetailsMapper ds;
    public void addProcurement(LyhProcurementEntity lyhProcurementEntity){
        bs.insertBy(lyhProcurementEntity);
        System.out.println(lyhProcurementEntity.getProcurementId());
        for (LyhProcurementDetailsEntity entity : lyhProcurementEntity.getLyhProcurementDetailsEntities()) {

            entity.setProcurementId(lyhProcurementEntity.getProcurementId());
            ds.insertDetails(entity);

        }


    }

    public List<LyhProcurementEntity> findAll(String procurementState){

        System.out.println(procurementState+"-----------------------wwwwwwwwwwwwwwwwwww");
        return bs.findAll(procurementState);
    }

        public List<LyhProcurementEntity> findAll2(){
        return bs.findAll2();
        }

    public void deleteById(List<String> list){
        bs.deleteById(list);
    }


    public int updateById(Map<String,Object> map){

        return bs.updateById(map);
    }


}
