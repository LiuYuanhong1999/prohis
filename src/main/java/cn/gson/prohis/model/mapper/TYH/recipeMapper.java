package cn.gson.prohis.model.mapper.TYH;

import cn.gson.prohis.model.pojos.TyhRecipedetailEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface recipeMapper {

    List<TyhRecipedetailEntity> chufang(Integer id);
}
