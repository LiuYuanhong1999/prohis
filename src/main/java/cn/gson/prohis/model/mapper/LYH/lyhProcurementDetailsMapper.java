package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhProcurementDetailsEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface lyhProcurementDetailsMapper {


    public void insertDetails(@Param("list") List<LyhProcurementDetailsEntity> list);
}
