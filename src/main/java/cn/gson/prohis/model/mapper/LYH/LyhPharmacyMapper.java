package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhPharmacyEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhPharmacyMapper {

    public List<LyhPharmacyEntity> findAll(String drugName,Integer drugState,String drugJixin,String supplierName);


    public List<LyhPharmacyEntity> findByName(String pharmacyName);


    void updateById(Integer numbers,Integer drugId);
    void updateById2(Integer numbers,Integer drugId);
}
