package cn.gson.prohis.model.mapper.ZSX;

import cn.gson.prohis.model.pojos.ZsxCallNumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZsxCallNumberMapper {
    List<ZsxCallNumber> findCallNumber();

    void addCallNumber(ZsxCallNumber callNumber);

    void updateState(String registrationNumber);
}
