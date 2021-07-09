package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ChargeMapper;
import cn.gson.prohis.model.pojos.ZCharge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class chargeService {
    @Autowired
    ChargeMapper chargeMapper;

    public List<ZCharge> findByCharge(){
        return chargeMapper.findByCharge();
    }
}
