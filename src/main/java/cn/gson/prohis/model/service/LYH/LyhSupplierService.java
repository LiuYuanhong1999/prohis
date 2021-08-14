package cn.gson.prohis.model.service.LYH;

import cn.gson.prohis.model.mapper.LYH.LyhSupplierMapper;
import cn.gson.prohis.model.pojos.LyhSupplierEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhSupplierService {

    @Resource
    LyhSupplierMapper bs;


    public List<LyhSupplierEntity> findAll(LyhSupplierEntity supplierEntity){
        return bs.findAll(supplierEntity);
    }



    public void insertSupplier(LyhSupplierEntity supplierEntity){
        if (supplierEntity.getSupplierId()==null){
            bs.insertSupplier(supplierEntity);
        }if (supplierEntity.getSupplierId() !=null){
            bs.updateSupplier(supplierEntity);
        }else {
            System.out.println("错误");
        }
    }


    public void updateById(Integer supplierId){
        bs.updateById(supplierId);
    }



    public List<LyhSupplierEntity> findByName(){
        return bs.findByName();
    }
}
