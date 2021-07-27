package cn.gson.prohis.model.service.YXJ;

import cn.gson.prohis.model.mapper.YXJ.YxjDeptMapper;
import cn.gson.prohis.model.pojos.YxjDept;
import cn.gson.prohis.model.pojos.YxjPhysical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 部门Service
 */
@Service
public class YxjDeptService {
    @Autowired
    YxjDeptMapper yxjDeptMapper;

    /**
     * 查询所有部门
     * @return
     */
    public List<YxjDept> selDept(){return yxjDeptMapper.selDept();}

    /**
     * 新增部门
     * @param yxjDept
     */
    public void addDept(YxjDept yxjDept){
        if (yxjDept.getDeptId() != null){
            yxjDeptMapper.updateDept(yxjDept);
        }else {
            yxjDeptMapper.addDept(yxjDept);}
        }


    /**
     * 修改部门
     * @param yxjDept
     */
    public void updateDept(YxjDept yxjDept){yxjDeptMapper.updateDept(yxjDept);}


    /**
     * 根据类别id查询
     * @param deptId
     * @return
     */
    public YxjDept selDeptId(Integer deptId){ return yxjDeptMapper.selDeptId(deptId); }
}
