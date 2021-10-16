package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxOperationMapper;
import cn.gson.prohis.model.pojos.ZsxOperation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ZsxOperationService {
    @Resource
    ZsxOperationMapper operationMapper;

    public List<ZsxOperation> findOperation(){
        return operationMapper.findOperation();
    }
}
