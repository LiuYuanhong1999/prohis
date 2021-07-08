package cn.gson.prohis.model.service.YXJ;

import cn.gson.prohis.model.mapper.YXJ.PhysicalMapper;
import cn.gson.prohis.model.pojos.Physical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 体检类别 Service
 */
@Service
public class PhysicalService {
    @Autowired
    PhysicalMapper physicalMapper;

    /**
     * 查询所有类别
     * @return
     */
    public List<Physical> findByPhysical(){
        return physicalMapper.findByPhysical();
    };

    /**
     * /体检类别新增
     * @param physical
     */
    public void addPhysical(Physical physical){
        physicalMapper.addPhysical(physical);
    }

    /**
     * /体检类别修改
     * @param physical
     */
    public void updatePhysical(Physical physical){
        physicalMapper.updatePhysical(physical);
    }
}
