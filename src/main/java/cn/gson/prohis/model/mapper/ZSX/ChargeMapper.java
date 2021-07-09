package cn.gson.prohis.model.mapper.ZSX;

import cn.gson.prohis.model.pojos.ZCharge;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChargeMapper {

    public List<ZCharge> findByCharge();
}
