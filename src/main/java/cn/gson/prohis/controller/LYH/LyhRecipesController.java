package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.pojos.LyhRecipeEntity;
import cn.gson.prohis.model.service.LYH.LyhRecipesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LyhRecipesController {

    @Resource
    LyhRecipesService recipesService;


    @RequestMapping("/add-recipes")
    public void insertByName(String executeId,String recipesName,Integer patientId){

//        System.out.println(executeId+"------------------"+recipesName);

      recipesService.insertByName(executeId,recipesName,patientId);


    }


    @RequestMapping("/find-recipes")
    public List<LyhRecipeEntity> findAll(){
        return recipesService.findAll();

    }

}
