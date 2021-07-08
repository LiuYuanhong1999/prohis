package cn.gson.prohis.controller.LYH;


import cn.gson.prohis.model.pojos.LyhProcurementEntity;
import cn.gson.prohis.model.service.LYH.lyhProcurementService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class lyhProcurementController {
    @Resource
    lyhProcurementService bs;



    @PostMapping("add-procurement")
    public void addProcurement(@RequestBody LyhProcurementEntity lyhProcurementEntity){
        bs.addProcurement(lyhProcurementEntity);
    }
}
