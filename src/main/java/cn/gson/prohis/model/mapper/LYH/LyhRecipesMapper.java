package cn.gson.prohis.model.mapper.LYH;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LyhRecipesMapper {

     void insertByName(String executeId,String recipesName);

}
