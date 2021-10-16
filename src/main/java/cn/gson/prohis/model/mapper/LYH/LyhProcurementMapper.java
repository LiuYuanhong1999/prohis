package cn.gson.prohis.model.mapper.LYH;


import cn.gson.prohis.model.pojos.LyhProcurementEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LyhProcurementMapper {

         void insertBy(LyhProcurementEntity lyhProcurementEntity);

         List<LyhProcurementEntity> findAll(LyhProcurementEntity procurementEntity);

         int updateById(Map<String,Object> map);

         void deleteById(List<String> list);

         List<LyhProcurementEntity> findAll2();
}
