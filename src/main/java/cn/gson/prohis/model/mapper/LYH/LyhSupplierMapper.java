package cn.gson.prohis.model.mapper.LYH;


import cn.gson.prohis.model.pojos.LyhSupplierEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhSupplierMapper {

    public List<LyhSupplierEntity> findAll();
}
