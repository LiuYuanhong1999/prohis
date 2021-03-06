package cn.gson.prohis.model.service.LYH;


import cn.gson.prohis.model.mapper.LYH.LyhProcurementDetailsMapper;
import cn.gson.prohis.model.mapper.LYH.LyhProcurementMapper;
import cn.gson.prohis.model.pojos.LyhProcurementDetailsEntity;
import cn.gson.prohis.model.pojos.LyhProcurementEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Service
public class LyhProcurementService {
    @Resource
    LyhProcurementMapper bs;

    @Resource
    LyhProcurementDetailsMapper ds;
    public void addProcurement(LyhProcurementEntity lyhProcurementEntity){

        Timestamp d = new Timestamp(System.currentTimeMillis());

        LyhProcurementEntity procurement=new LyhProcurementEntity();
        procurement.setProcurementId(lyhProcurementEntity.getProcurementId());
        procurement.setProcurementState(lyhProcurementEntity.getProcurementState());
        procurement.setProcurementName(lyhProcurementEntity.getProcurementName());
        procurement.setSupplierId(lyhProcurementEntity.getSupplierId());
        procurement.setProcurementDate(d);


        bs.insertBy(procurement);
        System.out.println(lyhProcurementEntity.getProcurementId());
        for (LyhProcurementDetailsEntity entity : lyhProcurementEntity.getLyhProcurementDetailsEntities()) {

            entity.setProcurementId(lyhProcurementEntity.getProcurementId());
            ds.insertDetails(entity);

        }


    }

    public List<LyhProcurementEntity> findAll(LyhProcurementEntity procurementEntity){

        System.out.println(procurementEntity.getProcurementState()+"-----------------------wwwwwwwwwwwwwwwwwww");
        return bs.findAll(procurementEntity);
    }



        public List<LyhProcurementEntity> findAll2(LyhProcurementEntity procurementEntity){

        if (procurementEntity.getProcurementState().isEmpty()){

            return bs.findAll3();
        }else {

            return bs.findAll2(procurementEntity);
        }

        }

    public void deleteById(List<String> list){
        bs.deleteById(list);
    }


    public int updateById(Map<String,Object> map){

        return bs.updateById(map);
    }


}
