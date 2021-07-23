package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhAllotRecordEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LyhAllotRecordMapper {

    public void insertAllotRecord(LyhAllotRecordEntity lyhAllotRecordEntity);
}
