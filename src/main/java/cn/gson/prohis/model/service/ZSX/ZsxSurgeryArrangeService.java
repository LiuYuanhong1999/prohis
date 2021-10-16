package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxSurgeryArrangeMapper;
import cn.gson.prohis.model.pojos.ZsxSurgeryArrange;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ZsxSurgeryArrangeService {
    @Resource
    ZsxSurgeryArrangeMapper surgeryArrangeMapper;

    public List<ZsxSurgeryArrange> findSurgeryArrange(){
        return surgeryArrangeMapper.findSurgeryArrange();
    }
}
