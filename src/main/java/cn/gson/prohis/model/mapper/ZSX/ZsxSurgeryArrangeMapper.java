package cn.gson.prohis.model.mapper.ZSX;

import cn.gson.prohis.model.pojos.ZsxSurgeryArrange;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZsxSurgeryArrangeMapper {
    List<ZsxSurgeryArrange> findSurgeryArrange();
}
