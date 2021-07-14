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
    cashService cashService;

    public List<TyhHosregEntity> findAll(String cha,String cha2){
        System.out.println("1"+cha);
        System.out.println("2"+cha2);
        return regMapper.findAll(cha,cha2);
    }

    public List<TyhHosnotEntity> findnot(){
        return regMapper.findnot();
    }

    public TyhHosnotEntity findreg(String num) {
        return regMapper.findreg(num);
    }
}
