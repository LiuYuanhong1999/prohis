package cn.gson.prohis.model.mapper.ZSX;

import cn.gson.prohis.model.pojos.ZsxOperationNote;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface opernoteMapper {
    List<ZsxOperationNote> findOper(Integer id);
}
