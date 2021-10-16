package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhPharmacyDetailsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhPharmacyDetailsMapper {
    public List<LyhPharmacyDetailsEntity> findAll(LyhPharmacyDetailsEntity pharmacyDetailsEntity);


    public void insertDetails(LyhPharmacyDetailsEntity lyhPharmacyDetailsEntity);


}
