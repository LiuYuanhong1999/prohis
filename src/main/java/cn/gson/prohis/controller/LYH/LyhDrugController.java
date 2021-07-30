package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.pojos.LyhDrugEntity;
import cn.gson.prohis.model.service.LYH.LyhDrugService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LyhDrugController {


    @Resource
    LyhDrugService bs;


    @RequestMapping("/find-name")
    public List<LyhDrugEntity> findById(int supplierId){
        return bs.findById(supplierId);
    }


    @RequestMapping("/find-drugAll")
    public List<LyhDrugEntity> findAll(Integer drugJia){

        System.out.println("--------------------"+drugJia);
      return   bs.findAll(drugJia);
    }


    @PostMapping("/add-drug")
    public void insertByDrug(@RequestBody LyhDrugEntity lyhDrugEntity){
        bs.insertByDrug(lyhDrugEntity);
    }

}
