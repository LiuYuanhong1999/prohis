package cn.gson.prohis.model.service.TYH;

import cn.gson.prohis.model.mapper.TYH.regMapper;
import cn.gson.prohis.model.pojos.TyhHosnotEntity;
import cn.gson.prohis.model.pojos.TyhHosregEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
 @Service
public class regService {
    @Resource
    regMapper regMapper;

    @Resource
    haoMapper haoMapper;

    public List<TyhHosregEntity> findAll(String cha,String cha2){
        return regMapper.findAll(cha,cha2);
    }

    public List<TyhHosnotEntity> findnot(){
        return regMapper.findnot();
    }

     public List<TyhHosnotEntity> findnot2(){
         return regMapper.findnot2();
     }

    public TyhHosnotEntity findreg(String num) {
        return regMapper.findreg(num);
    }

     public TyhHosnotEntity findregx(String num) {
         return regMapper.findregx(num);
     }

    public void addreg(TyhHosregEntity tyhHosregEntity) {
        tyhHosregEntity.setHosregNum(haoMapper.hao("zy"));
        regMapper.addreg(tyhHosregEntity);
        regMapper.updatenot(tyhHosregEntity.getHosnotNum());
    }

    public void suoding(String num) {
         regMapper.suoding(num);
    }

    public void jiesuo(String num) {
        regMapper.jiesuo(num);
    }
}
