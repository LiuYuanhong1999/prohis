package cn.gson.prohis.model.mapper.LYH;


import cn.gson.prohis.model.pojos.LyhRecordsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhRecordsMapper {

    List<LyhRecordsEntity> findAll();



    void insertById(int recordsState,String allotId);

}
