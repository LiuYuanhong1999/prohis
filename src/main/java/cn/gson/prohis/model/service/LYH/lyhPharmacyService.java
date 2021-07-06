package cn.gson.prohis.model.service.LYH;

import cn.gson.prohis.model.mapper.LYH.lyhPharmacyMapper;
import cn.gson.prohis.model.pojos.LyhpharmacyEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class lyhPharmacyService {
    @Resource
    lyhPharmacyMapper bs;


    public List<LyhpharmacyEntity> findAll(){
        return bs.findAll();
    }

    public List<LyhpharmacyEntity> findByName(String pharmacyName){
        return bs.findByName(pharmacyName);
    }
}
