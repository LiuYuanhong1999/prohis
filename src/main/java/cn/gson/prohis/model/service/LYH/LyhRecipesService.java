package cn.gson.prohis.model.service.LYH;


import cn.gson.prohis.model.mapper.LYH.LyhRecipesMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LyhRecipesService {
    @Resource
    LyhRecipesMapper recipesMapper;



    public void insertByName(String executeId,String recipesName){
        recipesMapper.insertByName(executeId, recipesName);
    }

}
