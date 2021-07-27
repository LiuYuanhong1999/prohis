package cn.gson.prohis.controller.TYH;

import cn.gson.prohis.model.pojos.*;
import cn.gson.prohis.model.service.TYH.recipeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class recipeController {
    @Resource
    recipeService recipeService;

    @RequestMapping("/find-chub")
    public List<TyhHosregEntity> chufangbr(){
        return recipeService.chufangbr();
    }

    @RequestMapping("/find-chufang")
    public List<TyhRecipedetailEntity> chufang(Integer id){
        return recipeService.chufang(id);
    }

    @RequestMapping("/find-yp")
    public List<LyhDrugEntity> findYp(){
        return recipeService.findYp();
    }

    @RequestMapping("/find-pro1")
    public List<YxjProjectEntity> findpro1(){
        return recipeService.findpro1();
    }

    @RequestMapping("/find-pro2")
    public List<YxjProjectEntity> findpro2(){
        return recipeService.findpro2();
    }

    @RequestMapping("/find-xm2")
    public YxjProjectEntity findxm2(Integer id){
        return recipeService.findxm2(id);
    }

    @RequestMapping("/find-xm1")
    public YxjProjectEntity findxm1(Integer id){
        return recipeService.findxm1(id);
    }

    @RequestMapping("find-yp2")
    public LyhDrugEntity findyp2(Integer id){
        return recipeService.findyp2(id);
    }
}
