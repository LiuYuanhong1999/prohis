package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.service.LYH.LyhRecipesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LyhRecipesController {

    @Resource
    LyhRecipesService recipesService;


    @RequestMapping("/add-recipes")
    public void insertByName(String executeId,String recipesName){

//        System.out.println(executeId+"------------------"+recipesName);


        recipesService.insertByName(executeId, recipesName);


    }


}
