package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhPharmacyDetailsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhPharmacyDetailsMapper {
    public List<LyhPharmacyDetailsEntity> findAll(String drugName,Integer drugState,String drugJixin,String supplierName);


    public void insertDetails(LyhPharmacyDetailsEntity lyhPharmacyDetailsEntity);


}
