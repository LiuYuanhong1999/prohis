package cn.gson.prohis.model.service.TYH;

import cn.gson.prohis.model.mapper.TYH.cashMapper;
import cn.gson.prohis.model.pojos.TyhCashEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class cashService {
    @Resource
    cashMapper cashMapper;

    public List<TyhCashEntity> findAll(){
        return cashMapper.findAll();
    }

    public void addcash(TyhCashEntity tyhCashEntity) {
        cashMapper.addcash(tyhCashEntity);
    }
}
