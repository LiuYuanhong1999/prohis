package cn.gson.prohis.model.mapper.YXJ;

import cn.gson.prohis.model.pojos.YxjProjectEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface projectMapper {
    public List<YxjProjectEntity> findpro1();

    public List<YxjProjectEntity> findpro2();

    YxjProjectEntity findxm2(Integer id);

    YxjProjectEntity findxm1(Integer id);
}
