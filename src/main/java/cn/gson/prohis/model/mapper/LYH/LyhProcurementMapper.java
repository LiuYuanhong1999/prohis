package cn.gson.prohis.model.mapper.LYH;


import cn.gson.prohis.model.pojos.LyhProcurementEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhProcurementMapper {

public void insertBy(LyhProcurementEntity lyhProcurementEntity);

public List<LyhProcurementEntity> findAll();
}
