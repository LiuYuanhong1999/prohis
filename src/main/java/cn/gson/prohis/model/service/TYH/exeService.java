package cn.gson.prohis.model.service.TYH;

import cn.gson.prohis.model.mapper.TYH.exeMapper;
import cn.gson.prohis.model.pojos.TyhExecuteEntity;
import cn.gson.prohis.model.pojos.TyhExecutedelEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class exeService {
    @Resource
    exeMapper exeMapper;

    public List<TyhExecuteEntity> findExecute(){
        return exeMapper.findExecute();
    }

    public List<TyhExecutedelEntity> findExecutedel(String id) {
        return exeMapper.findExecutedel(id);
    }

    //查询发药药品

    public List<TyhExecuteEntity> findAll(){
        return exeMapper.findExecute2();
    }


    public void updata1(String id) {
        exeMapper.updata1(id);
    }

    public void updata2(String id) {
        exeMapper.updata2(id);
    }

    public void update3(String id) {
        exeMapper.update3(id);
    }
}
