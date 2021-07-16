package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhDrugStoreDetailsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhDrugStoreDetailsMapper {

    public List<LyhDrugStoreDetailsEntity> findAll(int drugId,String procurementId);


    public void insertDetails(LyhDrugStoreDetailsEntity lyhDrugStoreDetailsEntity);

}
