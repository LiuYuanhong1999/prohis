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


    public List<LyhSupplierEntity> findAll(){
        return bs.findAll();
    }
}
