package cn.gson.prohis.model.service.TYH;

import cn.gson.prohis.model.mapper.LYH.LyhDrugMapper;
import cn.gson.prohis.model.mapper.TYH.patMapper;
import cn.gson.prohis.model.mapper.TYH.recipeMapper;
import cn.gson.prohis.model.mapper.TYH.regMapper;
import cn.gson.prohis.model.mapper.YXJ.projectMapper;
import cn.gson.prohis.model.pojos.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    @Resource
    patMapper patMapper;

    public List<TyhHosregEntity> chufangbr(String cha) {
        return regMapper.chufangbr(cha);
    }

    public List<TyhRecipeEntity> chufang1(Integer patientId) {
        return recipeMapper.chufang1(patientId);
    }

    public List<LyhDrugEntity> findYp() {
        return lyhDrugMapper.findYp();
    }

    public List<YxjProjectEntity> findpro1() {
        return projectMapper.findpro1();
    }

    public List<YxjProjectEntity> findpro2() {
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

    public TyhPatientEntity findbrname(Integer id) {
        return patMapper.findbrname(id);
    }

    public int addchufang(tyhRecipeVo tyhRecipeEntity) {
        TyhHosregEntity selchuf = regMapper.selchuf(tyhRecipeEntity.getPatientId());

        if (selchuf.getHosregZt()==1){
            SimpleDateFormat myFmt = new SimpleDateFormat("yyMMddHHmmssSSS");
            Date date = new Date();
            String a = myFmt.format(date);
            String b = "cf";
            tyhRecipeEntity.setRecipeId(b + a);
            recipeMapper.addchufang(tyhRecipeEntity);


            //药品
            if (tyhRecipeEntity.getDurg().size() != 0) {

                //处方
                tyhRecipeEntity.getDurg().forEach(v -> {
                    v.drugPrice = v.drugPrice * v.numbers;
                    recipeMapper.addchufangdel(v, tyhRecipeEntity.getRecipeId());
                });


                //护士
                int data = 0;
                for (int i = 1;i<=tyhRecipeEntity.getRecipeDay();i++){
                    SimpleDateFormat myFmt1 = new SimpleDateFormat("yyMMddHHmmssSSS");
                    Date date1 = new Date();
                    String c = myFmt1.format(date1);
                    String d = "hs";
                    tyhRecipeEntity.setExecuteId(d+c);
                    recipeMapper.addexe(tyhRecipeEntity,i);
                    recipeMapper.updatadata(tyhRecipeEntity.getExecuteId(),data);
                    data++;
                    tyhRecipeEntity.getDurg().forEach(v -> {
                        v.drugPrice = v.drugPrice * v.numbers;
                        recipeMapper.addexedel(v,tyhRecipeEntity.getExecuteId());
                    });
                }
            }


            //项目
            if (tyhRecipeEntity.getProject().size() != 0) {
                tyhRecipeEntity.getProject().forEach(v -> {
                    recipeMapper.addchufangdel2(v, tyhRecipeEntity.getRecipeId());
                });
            }
        }else if (selchuf.getHosregZt()==2){
            return 2;
        }

        return 1;
    }

    public List<TyhRecipeEntity> chufang(String patientId) {
        return recipeMapper.chufang(patientId);
    }

    public List<TyhRecipeEntity> chufang2(String patientId) {
        return recipeMapper.chufang2(patientId);
    }
}
