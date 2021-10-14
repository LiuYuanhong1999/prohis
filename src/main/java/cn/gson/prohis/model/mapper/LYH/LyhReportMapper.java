package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhReportEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhReportMapper {

    List<LyhReportEntity> selectAll(Integer reportState);


    List<LyhReportEntity> selectAll2();
    void insertAll(LyhReportEntity reportEntity);


    void updateById(int reportState,int reportId);
}
