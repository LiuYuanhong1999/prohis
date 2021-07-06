package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.pojos.LyhpharmacyEntity;
import cn.gson.prohis.model.service.LYH.lyhPharmacyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class lyhPharmacyController {
    @Resource
    lyhPharmacyService bs;


    @RequestMapping("find-pharmacy")
    public List<LyhpharmacyEntity> findAll(){
        return bs.findAll();
    }


    @RequestMapping("find-pharmacyName")
    public List<LyhpharmacyEntity> findByName(String pharmacyName){
        return bs.findByName(pharmacyName);
    }
}
