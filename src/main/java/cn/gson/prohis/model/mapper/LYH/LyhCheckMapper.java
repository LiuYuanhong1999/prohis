package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhCheckEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhCheckMapper {

    public List<LyhCheckEntity> findAll();

    public void insertCheck(LyhCheckEntity checkEntity);
}
