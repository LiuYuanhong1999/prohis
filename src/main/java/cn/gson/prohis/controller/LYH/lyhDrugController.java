package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.pojos.LyhDrugEntity;
import cn.gson.prohis.model.service.LYH.lyhDrugService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class lyhDrugController {


    @Resource
    lyhDrugService bs;


    @RequestMapping("/find-name")
    public List<LyhDrugEntity> findById(int supplierId){
        return bs.findById(supplierId);
    }
}