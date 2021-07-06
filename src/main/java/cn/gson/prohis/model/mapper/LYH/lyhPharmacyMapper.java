package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhpharmacyEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface lyhPharmacyMapper {

    public List<LyhpharmacyEntity> findAll();


    public List<LyhpharmacyEntity> findByName(String pharmacyName);
}
