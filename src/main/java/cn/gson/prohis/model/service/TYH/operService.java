package cn.gson.prohis.model.service.TYH;

import cn.gson.prohis.model.mapper.YXJ.YxjRecordMapper;
import cn.gson.prohis.model.mapper.ZSX.opernoteMapper;
import cn.gson.prohis.model.pojos.TyhJie;
import cn.gson.prohis.model.pojos.TyhJiex;
import cn.gson.prohis.model.pojos.YxjRecord;
import cn.gson.prohis.model.pojos.ZsxOperationNote;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class operService {
    @Resource
    opernoteMapper opernoteMapper;

    @Resource
    YxjRecordMapper yxjRecordMapper;

    @Resource
    haoMapper haoMapper;

    public List<ZsxOperationNote> findOper(Integer id){
        return opernoteMapper.findOper(id);
    }

    public List<YxjRecord> findRecord(Integer id){
        return yxjRecordMapper.findRecord(id);
    }

    public void addJie(TyhJie jie) {
        jie.setJieId(haoMapper.hao("js"));
        opernoteMapper.addJie(jie);
        opernoteMapper.updataJie(jie.getPatientId());
        opernoteMapper.updateYj(jie.getJiePrice(),jie.getPatientId());
        String a = haoMapper.hao("yj");
        double b = 0-jie.getJiePrice();
        opernoteMapper.addYj(a,jie.getHosregNum(),b);

        for (TyhJiex tyhJiex : jie.getTyhJiexes()) {
            tyhJiex.setJieId(jie.getJieId());
            opernoteMapper.addJiex(tyhJiex);
            opernoteMapper.updateJie2(jie.getPatientId());
            opernoteMapper.updateJie3(jie.getPatientId());
        }
    }
}
