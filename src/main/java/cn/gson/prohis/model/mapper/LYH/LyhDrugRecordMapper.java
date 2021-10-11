package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhDrugRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhDrugRecordMapper {

    void insertDrugRecord(LyhDrugRecord drugRecord);


    List<LyhDrugRecord> findByName(Integer drugId);


    void updateByPiCi(Integer drugId,Integer numbers);
}
