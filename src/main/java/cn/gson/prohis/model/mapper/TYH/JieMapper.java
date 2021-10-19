package cn.gson.prohis.model.mapper.TYH;

import cn.gson.prohis.model.pojos.TyhJie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JieMapper {
    List<TyhJie> findJie(Integer id);

    List<TyhJie> findJiex(String id);
}
