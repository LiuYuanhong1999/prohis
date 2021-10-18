package cn.gson.prohis.model.service.TYH;

import cn.gson.prohis.model.mapper.TYH.chunotMapper;
import cn.gson.prohis.model.mapper.TYH.regMapper;
import cn.gson.prohis.model.pojos.TyhChunotEntity;
import cn.gson.prohis.model.pojos.TyhHosregEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class chunotService {
    @Resource
    chunotMapper chunotMapper;

    @Resource
    haoMapper haoMapper;

    @Resource
    regMapper regMapper;

    public List<TyhChunotEntity> findchunot(String cha){
        return chunotMapper.findchunot(cha);
    }

    public List<TyhHosregEntity> findchureg(){
        return regMapper.findchureg();
    }

    public TyhHosregEntity findchureg2(String num) {
        return regMapper.findchureg2(num);
    }

    public void addchunot(TyhChunotEntity tyhChunotEntity) {
        tyhChunotEntity.setChunotNum(haoMapper.hao("cy"));
        chunotMapper.addchunot(tyhChunotEntity);
        chunotMapper.updatereg(tyhChunotEntity.getHosregNum());
    }

    public void delchunot(String chuId, String zhuId) {
        chunotMapper.delchunot(chuId);
        chunotMapper.updatereg2(zhuId);
    }
}
