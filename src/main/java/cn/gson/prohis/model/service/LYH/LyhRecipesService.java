package cn.gson.prohis.model.service.LYH;


import cn.gson.prohis.model.mapper.LYH.LyhRecipesMapper;
import cn.gson.prohis.model.pojos.LyhRecipeEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhRecipesService {
    @Resource
    LyhRecipesMapper recipesMapper;



    public void insertByName(String executeId,String recipesName,int patientId){
        recipesMapper.insertByName(executeId, recipesName,patientId);
    }



    public List<LyhRecipeEntity> findAll(){
        return recipesMapper.findAll();

    }

}
