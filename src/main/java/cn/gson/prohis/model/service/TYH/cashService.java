package cn.gson.prohis.model.service.TYH;

import cn.gson.prohis.model.mapper.TYH.cashMapper;
import cn.gson.prohis.model.pojos.TyhCashEntity;
import cn.gson.prohis.model.pojos.TyhHosregEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class cashService {
    @Resource
    cashMapper cashMapper;

    public List<TyhCashEntity> findAll(String cha){
        return cashMapper.findAll(cha);
    }

    public void addcash(TyhCashEntity tyhCashEntity) {
        System.out.println(tyhCashEntity);
        SimpleDateFormat myFmt = new SimpleDateFormat("yyMMddHHmmssSSS");
        Date date = new Date();
        String a=myFmt.format(date);
        String b="yajin_";
        tyhCashEntity.setCashNum(b + a);
        TyhHosregEntity tyhHosregEntity = cashMapper.findnum2(tyhCashEntity.getHosregNum());
        System.out.println(tyhCashEntity.getCashPrice());
        cashMapper.addcash(tyhCashEntity);
        cashMapper.updateyue(tyhCashEntity.getCashPrice(),tyhHosregEntity.getTyhPatientEntity().getPatientId());
    }

    public List<TyhHosregEntity> findnum(){
        return cashMapper.findnum();
    }

    public TyhHosregEntity findnum2(String num2) {
        return cashMapper.findnum2(num2);
    }

    public void delcash(TyhCashEntity tyhCashEntity) {
        cashMapper.delcash(tyhCashEntity.getCashNum());
        cashMapper.updateyue2(tyhCashEntity.getCashPrice(),tyhCashEntity.getTyhHosregEntity().getTyhPatientEntity().getPatientId());
    }
}
