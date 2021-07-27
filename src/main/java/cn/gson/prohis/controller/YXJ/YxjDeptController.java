package cn.gson.prohis.controller.YXJ;

import cn.gson.prohis.model.pojos.YxjDept;
import cn.gson.prohis.model.pojos.YxjPhysical;
import cn.gson.prohis.model.service.YXJ.YxjDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 部门控制
 */
@RestController
public class YxjDeptController {
    @Autowired
    YxjDeptService yxjDeptService;

    /**
     * 查询所有部门
     * @return
     */
    @RequestMapping("/sleDept")
    public List<YxjDept> selDept(){return yxjDeptService.selDept();}

    /**
     * 新增部门
     * @param yxjDept
     */
    @RequestMapping("/addDept")
    public void addDept(@RequestBody YxjDept yxjDept){yxjDeptService.addDept(yxjDept);}

    /**
     * 修改部门
     * @param yxjDept
     */
    @RequestMapping("/updateDept")
    public void updateDept(@RequestBody YxjDept yxjDept){yxjDeptService.updateDept(yxjDept);}


    /**
     * 根据类别ID查询
     * @param deptId
     * @return
     */
    @RequestMapping("/selDeptId")
    public YxjDept selDeptId(Integer deptId){
        return yxjDeptService.selDeptId(deptId);
    }
}
