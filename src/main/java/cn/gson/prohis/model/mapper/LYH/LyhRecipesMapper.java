package cn.gson.prohis.model.mapper.LYH;


import cn.gson.prohis.model.pojos.LyhRecipeEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LyhRecipesMapper {

     void insertByName(String executeId,String recipesName,int patientId);


     List<LyhRecipeEntity> findAll();
}
