package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhDrugEntity;
import cn.gson.prohis.model.pojos.LyhDrugstoreEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LyhDrugStoreMapper {


    public List<LyhDrugstoreEntity> findAll(Integer drugId,String procurementId);

//    public int updateById(Map<String,Object> map);

public void updateById(int numbers,String procurementId,int drugId);


public List<LyhDrugstoreEntity> findByName(int drugId,String procurementId);

public void insertDrugStore(LyhDrugstoreEntity lyhDrugstoreEntity);

}
