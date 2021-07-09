package cn.gson.prohis.model.service.LYH;

import cn.gson.prohis.model.mapper.LYH.LyhDrugStoreMapper;
import cn.gson.prohis.model.pojos.LyhDrugstoreEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhDrugStoreService {

    @Resource
    private LyhDrugStoreMapper bs;


    public List<LyhDrugstoreEntity> findAll(){
        return bs.findAll();
    }
}
