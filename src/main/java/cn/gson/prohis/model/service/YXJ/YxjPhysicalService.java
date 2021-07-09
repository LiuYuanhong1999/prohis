package cn.gson.prohis.model.service.YXJ;

import cn.gson.prohis.model.mapper.YXJ.YxjPhysicalMapper;
import cn.gson.prohis.model.pojos.YxjPhysical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 体检类别 Service
 */
@Service
public class YxjPhysicalService {
    @Autowired
    YxjPhysicalMapper physicalMapper;

    /**
     * 查询所有类别
     * @return
     */
    public List<YxjPhysical> findByPhysical(){
        return physicalMapper.findByPhysical();
    };

    /**
     * /体检类别新增
     * @param physical
     */
    public void addPhysical(YxjPhysical physical){
        physicalMapper.addPhysical(physical);
    }

    /**
     * /体检类别修改
     * @param physical
     */
    public void updatePhysical(YxjPhysical physical){
        physicalMapper.updatePhysical(physical);
    }
}
