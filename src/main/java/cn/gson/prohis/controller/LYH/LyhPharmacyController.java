package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.pojos.LyhPharmacyEntity;
import cn.gson.prohis.model.service.LYH.LyhPharmacyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LyhPharmacyController {
    @Resource
    LyhPharmacyService bs;


    @RequestMapping("find-pharmacy")
    public List<LyhPharmacyEntity> findAll(){
        return bs.findAll();
    }


    @RequestMapping("find-pharmacyName")
    public List<LyhPharmacyEntity> findByName(String pharmacyName){
        return bs.findByName(pharmacyName);
    }
}
