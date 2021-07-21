package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhAllotDetailsEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LyhAllotDetailsMapper {

    public void insertAllotDetails(LyhAllotDetailsEntity lyhAllotDetailsEntity);
}
