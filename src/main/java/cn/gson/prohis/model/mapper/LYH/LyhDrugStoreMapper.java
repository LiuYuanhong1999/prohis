package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhDrugEntity;
import cn.gson.prohis.model.pojos.LyhDrugstoreEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LyhDrugStoreMapper {


    public List<LyhDrugstoreEntity> findAll(LyhDrugstoreEntity drugstoreEntity);

//    public int updateById(Map<String,Object> map);

public void updateById(int numbers,int drugId);


public List<LyhDrugstoreEntity> findByName(int drugId);

public void insertDrugStore(LyhDrugstoreEntity lyhDrugstoreEntity);

//根据调拨单批量修改数量
public void updateById2(Integer numbers,Integer drugId,String procurementId);
}
