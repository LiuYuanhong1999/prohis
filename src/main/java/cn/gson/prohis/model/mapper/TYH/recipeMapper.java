package cn.gson.prohis.model.mapper.TYH;

import cn.gson.prohis.model.pojos.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface recipeMapper {

    List<TyhRecipeEntity> chufang1(Integer patientId);

    void addchufang(tyhRecipeVo tyhRecipeEntity);

    void addchufangdel(tyhDrugVo v,@Param("recipeId") String recipeId);

    void addchufangdel2(tyhProjectVo v,@Param("recipeId") String recipeId);

    List<TyhRecipeEntity> chufang(String patientId);

    List<TyhRecipeEntity> chufang2(String patientId);

    void addexedel(tyhDrugVo v, @Param("id") String id);

    void updatadata(String id, int i);

    void addexe(tyhRecipeVo v, int i);
}
