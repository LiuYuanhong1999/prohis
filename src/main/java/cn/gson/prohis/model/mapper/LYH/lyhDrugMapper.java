package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhDrugEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface lyhDrugMapper {

    public List<LyhDrugEntity> findById(int supplierId);
}
