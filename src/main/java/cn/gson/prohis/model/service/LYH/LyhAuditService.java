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


    public List<LyhAuditEntity> findAll(){
        return bs.findAll();
    }



    public int insertAudit(List<LyhAuditEntity> list){

        return bs.insertAudit(list);
    }



    public int updateById(Map<String,Object> map){

        return bs.updateById(map);
    }
}

