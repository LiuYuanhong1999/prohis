package cn.gson.prohis.model.mapper.TYH;

import cn.gson.prohis.model.pojos.TyhCashEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface cashMapper {
    public List<TyhCashEntity> findAll();

    void addcash(TyhCashEntity tyhCashEntity);
}
