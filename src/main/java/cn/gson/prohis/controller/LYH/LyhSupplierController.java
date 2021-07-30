package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.pojos.LyhSupplierEntity;
import cn.gson.prohis.model.service.LYH.LyhSupplierService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LyhSupplierController {
    @Resource
    LyhSupplierService bs;



    @PostMapping("/find-supplier")
    public List<LyhSupplierEntity> findAll(@RequestBody LyhSupplierEntity supplierEntity){
        System.out.println(supplierEntity.getSupplierState()+"-------------------");
        return bs.findAll(supplierEntity);
    }



    @PostMapping("/add-supplier")
    public void insertSupplier(@RequestBody LyhSupplierEntity supplierEntity){
        bs.insertSupplier(supplierEntity);
    }

    @RequestMapping("/update-supplierId")
    public void  updateById(Integer supplierId){
        bs.updateById(supplierId);
    }

}
