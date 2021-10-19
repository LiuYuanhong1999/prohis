package cn.gson.prohis.model.service.TYH;

import cn.gson.prohis.model.mapper.TYH.cashMapper;
import cn.gson.prohis.model.pojos.TyhCashEntity;
import cn.gson.prohis.model.pojos.TyhHosregEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class cashService {
    @Resource
    cashMapper cashMapper;

    @Resource
    haoMapper haoMapper;

    public List<TyhCashEntity> findAll(String cha){
        return cashMapper.findAll(cha);
    }

    public List<TyhCashEntity> findTcash(String cha){
        return cashMapper.findTcash(cha);
    }

    public List<TyhCashEntity> findAllcash(String cha){
        return cashMapper.findAllcash(cha);
    }

    public void addcash(TyhCashEntity tyhCashEntity) {
        tyhCashEntity.setCashNum(haoMapper.hao("yj"));
        TyhHosregEntity tyhHosregEntity = cashMapper.findnum2(tyhCashEntity.getHosregNum());
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

    public void delTcash(TyhCashEntity s) {
        s.setCashNum(haoMapper.hao("yj"));
        s.setCashPrice(0-s.getCashPrice());
        System.out.println(s);
        cashMapper.delTcash(s);
        cashMapper.xiuYue(s);
    }
}
