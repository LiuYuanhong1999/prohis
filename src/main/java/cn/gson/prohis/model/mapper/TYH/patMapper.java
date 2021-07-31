package cn.gson.prohis.model.mapper.TYH;

import cn.gson.prohis.model.pojos.TyhPatientEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface patMapper {

    TyhPatientEntity findbrname(Integer id);
}
