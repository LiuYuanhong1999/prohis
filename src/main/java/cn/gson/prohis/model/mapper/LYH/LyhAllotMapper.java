package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhAllotEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LyhAllotMapper {

    public List<LyhAllotEntity> findAll();

    public void insertAllot(LyhAllotEntity lyhAllotEntity);



    public int updateById(Map<String,Object> map);
}
