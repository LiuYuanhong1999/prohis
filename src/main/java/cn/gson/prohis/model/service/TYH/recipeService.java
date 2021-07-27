package cn.gson.prohis.model.service.TYH;

import cn.gson.prohis.model.mapper.LYH.LyhDrugMapper;
import cn.gson.prohis.model.mapper.TYH.recipeMapper;
import cn.gson.prohis.model.mapper.TYH.regMapper;
import cn.gson.prohis.model.mapper.YXJ.projectMapper;
import cn.gson.prohis.model.pojos.LyhDrugEntity;
import cn.gson.prohis.model.pojos.TyhHosregEntity;
import cn.gson.prohis.model.pojos.TyhRecipedetailEntity;
import cn.gson.prohis.model.pojos.YxjProjectEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class recipeService {
    @Resource
    regMapper regMapper;

    @Resource
    recipeMapper recipeMapper;

    @Resource
    LyhDrugMapper lyhDrugMapper;

    @Resource
    projectMapper projectMapper;

    public List<TyhHosregEntity> chufangbr(){
        return regMapper.chufangbr();
    }

    public List<TyhRecipedetailEntity> chufang(Integer id) {
        return recipeMapper.chufang(id);
    }

    public List<LyhDrugEntity> findYp(){
        return lyhDrugMapper.findYp();
    }

    public List<YxjProjectEntity> findpro1(){
        return projectMapper.findpro1();
    }

    public List<YxjProjectEntity> findpro2(){
        return projectMapper.findpro2();
    }

    public YxjProjectEntity findxm2(Integer id) {
        return projectMapper.findxm2(id);
    }

    public YxjProjectEntity findxm1(Integer id) {
        return projectMapper.findxm1(id);
    }

    public LyhDrugEntity findyp2(Integer id) {
        return lyhDrugMapper.findyp2(id);
    }
}
