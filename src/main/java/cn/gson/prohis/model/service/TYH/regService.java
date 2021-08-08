package cn.gson.prohis.model.service.TYH;

import cn.gson.prohis.model.mapper.TYH.regMapper;
import cn.gson.prohis.model.pojos.TyhHosnotEntity;
import cn.gson.prohis.model.pojos.TyhHosregEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
 @Service
public class regService {
    @Resource
    regMapper regMapper;

    public List<TyhHosregEntity> findAll(String cha,String cha2){
        System.out.println("1"+cha);
        System.out.println("2"+cha2);

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

    public void addreg(TyhHosregEntity tyhHosregEntity) {
        SimpleDateFormat myFmt = new SimpleDateFormat("yyMMddHHmmssSSS");
        Date date = new Date();
        String a=myFmt.format(date);
        String b="zhuyuan_";
        tyhHosregEntity.setHosregNum(b + a);
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
