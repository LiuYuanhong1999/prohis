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
    YxjPhysicalMapper yxjPhysicalMapper;

    /**
     * 查询所有类别
     * @return
     */
    public List<YxjPhysical> findByPhysical(){
        return yxjPhysicalMapper.findByPhysical();
    };

    /**
     * /体检类别新增
     * @param physical
     */
    public void addPhysical(YxjPhysical physical){
        if (physical.getPhId()!=null){
            yxjPhysicalMapper.updatePhysical(physical);
        }else {
            yxjPhysicalMapper.addPhysical(physical);
        }

    }

    /**
     * /体检类别修改
     * @param physical
     */
    public void updatePhysical(YxjPhysical physical){

        yxjPhysicalMapper.updatePhysical(physical);

    }

    /**
     * 根据ID删除类别
     * @param phId
     */
    public void delPhysical(Integer phId){

        yxjPhysicalMapper.delPhysical(phId);}


    /**
     * 根据类别id查询
     * @param phId
     * @return
     */
    public YxjPhysical selPhId(Integer phId){
        return yxjPhysicalMapper.selPhId(phId);
    }

    }
