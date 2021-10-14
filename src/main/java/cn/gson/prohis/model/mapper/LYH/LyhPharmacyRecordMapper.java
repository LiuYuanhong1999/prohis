package cn.gson.prohis.model.mapper.LYH;


import cn.gson.prohis.model.pojos.LyhPharmacyRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhPharmacyRecordMapper {
    void insertPharmacyRecord(LyhPharmacyRecord record);

    List<LyhPharmacyRecord> findRecord();
}
