package cn.gson.prohis.model.service.TYH;

import cn.gson.prohis.model.mapper.YXJ.YxjRecordMapper;
import cn.gson.prohis.model.mapper.ZSX.opernoteMapper;
import cn.gson.prohis.model.pojos.YxjRecord;
import cn.gson.prohis.model.pojos.ZsxOperationNote;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class operService {
    @Resource
    opernoteMapper opernoteMapper;

    @Resource
    YxjRecordMapper yxjRecordMapper;

    public List<ZsxOperationNote> findOper(Integer id){
        return opernoteMapper.findOper(id);
    }

    public List<YxjRecord> findRecord(Integer id){
        return yxjRecordMapper.findRecord(id);
    }
}
