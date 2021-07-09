package cn.gson.prohis.controller.LYH;


import cn.gson.prohis.model.pojos.LyhProcurementEntity;
import cn.gson.prohis.model.service.LYH.LyhProcurementService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LyhProcurementController {
    @Resource
    LyhProcurementService bs;



    @PostMapping("add-procurement")
    public void addProcurement(@RequestBody LyhProcurementEntity lyhProcurementEntity){
        System.out.println(lyhProcurementEntity);
        bs.addProcurement(lyhProcurementEntity);
    }


    @RequestMapping("find-procurement")
    public List<LyhProcurementEntity> findAll(){
        return bs.findAll();
    }
}
