package cn.gson.prohis.model.service.LYH;


import cn.gson.prohis.model.mapper.LYH.LyhAuditMapper;
import cn.gson.prohis.model.pojos.LyhAuditEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class LyhAuditService {

    @Resource
    LyhAuditMapper bs;


    public List<LyhAuditEntity> findAll(LyhAuditEntity auditEntity){

        System.out.println(auditEntity.getAuditState());

        return bs.findAll(auditEntity);
    }


    public List<LyhAuditEntity> findAll2(LyhAuditEntity auditEntity){

        if (auditEntity.getAuditState() ==null){
            System.out.println("-------------------------------------------1");
            return bs.findAll2();
        }else {
            System.out.println("-----------------------------------------------2");
            return bs.findAll3(auditEntity);
    }

}



    public int insertAudit(List<LyhAuditEntity> list){

        return bs.insertAudit(list);
    }



    public void updateById(Integer auditState,Integer auditId){

         bs.updateById(auditState, auditId);
    }
}

