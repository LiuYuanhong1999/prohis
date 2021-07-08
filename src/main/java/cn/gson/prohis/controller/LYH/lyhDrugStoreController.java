package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.pojos.LyhDrugstoreEntity;
import cn.gson.prohis.model.service.LYH.lyhDrugStoreService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class lyhDrugStoreController {
    @Resource
    lyhDrugStoreService bs;


    @RequestMapping("/find-drugstore")
    public List<LyhDrugstoreEntity> findAll(){
        return bs.findAll();
    }
}
