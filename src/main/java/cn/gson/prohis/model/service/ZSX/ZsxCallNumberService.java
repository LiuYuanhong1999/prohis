package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxCallNumberMapper;
import cn.gson.prohis.model.pojos.ZsxCallNumber;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ZsxCallNumberService {
    @Resource
    ZsxCallNumberMapper callNumberMapper;

    public List<ZsxCallNumber> findCallNumber(){
        return callNumberMapper.findCallNumber();
    }

    public void updateState(String registrationNumber){
        callNumberMapper.updateState(registrationNumber);
    }
}
