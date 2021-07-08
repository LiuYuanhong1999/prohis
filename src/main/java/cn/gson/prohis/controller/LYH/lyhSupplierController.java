package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.pojos.LyhSupplierEntity;
import cn.gson.prohis.model.service.LYH.lyhSupplierService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class lyhSupplierController {
    @Resource
    lyhSupplierService bs;



    @RequestMapping("/find-supplier")
    public List<LyhSupplierEntity> findAll(){
        return bs.findAll();
    }
}
