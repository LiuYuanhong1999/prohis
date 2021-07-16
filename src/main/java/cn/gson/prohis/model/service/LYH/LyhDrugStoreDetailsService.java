package cn.gson.prohis.model.service.LYH;

import cn.gson.prohis.model.mapper.LYH.LyhDrugStoreDetailsMapper;
import cn.gson.prohis.model.pojos.LyhDrugStoreDetailsEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhDrugStoreDetailsService {
    @Resource
    LyhDrugStoreDetailsMapper bs;



    public List<LyhDrugStoreDetailsEntity> findAll(int drugId,String procurementId){
     return bs.findAll(drugId,procurementId);
    }
}
