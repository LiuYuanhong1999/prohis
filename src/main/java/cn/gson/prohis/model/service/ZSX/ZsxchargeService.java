package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxChargeMapper;
import cn.gson.prohis.model.pojos.ZsxCharge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZsxchargeService {
    @Autowired
    ZsxChargeMapper chargeMapper;

    public List<ZsxCharge> findByCharge(){
        return chargeMapper.findByCharge();
    }
}
