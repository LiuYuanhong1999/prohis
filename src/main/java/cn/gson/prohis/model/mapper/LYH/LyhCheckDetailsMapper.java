package cn.gson.prohis.model.mapper.LYH;


import cn.gson.prohis.model.pojos.LyhCheckDetailsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhCheckDetailsMapper {

    public List<LyhCheckDetailsEntity> findAll();

    public void insertCheckDetails(LyhCheckDetailsEntity detailsEntity);
}
