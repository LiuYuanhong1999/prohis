package cn.gson.prohis.model.mapper.LYH;


import cn.gson.prohis.model.pojos.LyhReportDetailsEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LyhReportDetailsMapper {

    public void insertByReport(LyhReportDetailsEntity detailsEntity);
}
