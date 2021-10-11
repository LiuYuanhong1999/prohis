package cn.gson.prohis.model.mapper.LYH;


import cn.gson.prohis.model.pojos.LyhPharmacyRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LyhPharmacyRecordMapper {
    void insertPharmacyRecord(LyhPharmacyRecord record);
}
