package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhPharmacyEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface lyhPharmacyMapper {

    public List<LyhPharmacyEntity> findAll();


    public List<LyhPharmacyEntity> findByName(String pharmacyName);


}
