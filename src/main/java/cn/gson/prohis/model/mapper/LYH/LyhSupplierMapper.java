package cn.gson.prohis.model.mapper.LYH;


import cn.gson.prohis.model.pojos.LyhSupplierEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhSupplierMapper {

    public List<LyhSupplierEntity> findAll(LyhSupplierEntity supplierEntity);


    public void insertSupplier(LyhSupplierEntity supplierEntity);

    public void updateById(Integer supplierId);

    public void updateSupplier(LyhSupplierEntity supplierEntity);

    public List<LyhSupplierEntity> findByName();
}
