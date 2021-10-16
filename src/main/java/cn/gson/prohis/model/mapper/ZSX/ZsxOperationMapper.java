package cn.gson.prohis.model.mapper.ZSX;

import cn.gson.prohis.model.pojos.ZsxOperation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZsxOperationMapper {
    List<ZsxOperation> findOperation();
}
