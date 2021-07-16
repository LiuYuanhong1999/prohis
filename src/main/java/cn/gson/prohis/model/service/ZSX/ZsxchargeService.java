package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxChargeMapper;
import cn.gson.prohis.model.pojos.ZsxCharge;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class ZsxchargeService {
    @Resource
    ZsxChargeMapper chargeMapper;

    public List<ZsxCharge> findByCharge(){
        return chargeMapper.findByCharge();
    }


    public void saveCharge(ZsxCharge charge){

        if (charge.getChargeId()==null || charge.getChargeId().equals("")){
            chargeMapper.addCharge(charge);
        }else{
            chargeMapper.updateCharge(charge);
        }
    }
}
