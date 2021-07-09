package cn.gson.prohis.model.service.LYH;

import cn.gson.prohis.model.mapper.LYH.LyhDrugMapper;
import cn.gson.prohis.model.pojos.LyhDrugEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhDrugService {
    @Resource
    LyhDrugMapper bs;

    public List<LyhDrugEntity> findById(int supplierId){
        return bs.findById(supplierId);
    }
}