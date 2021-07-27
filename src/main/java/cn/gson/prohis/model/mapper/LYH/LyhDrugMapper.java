package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhDrugEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhDrugMapper {

    public List<LyhDrugEntity> findById(int supplierId);

    public List<LyhDrugEntity> findAll();

    public List<LyhDrugEntity> findYp();

    LyhDrugEntity findyp2(Integer id);
}
