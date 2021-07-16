package cn.gson.prohis.controller.LYH;


import cn.gson.prohis.model.pojos.LyhDrugStoreDetailsEntity;
import cn.gson.prohis.model.service.LYH.LyhDrugStoreDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LyhDrugStoreDetailsController {
    @Resource
    LyhDrugStoreDetailsService bs;



    @RequestMapping("find-drugStoreDetails")
    public List<LyhDrugStoreDetailsEntity> findAll(int drugId,String procurementId){

        return bs.findAll(drugId,procurementId);

    }
}
