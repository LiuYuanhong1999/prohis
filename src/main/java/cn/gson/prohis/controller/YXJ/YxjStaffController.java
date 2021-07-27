package cn.gson.prohis.controller.YXJ;

import cn.gson.prohis.model.pojos.YxjDept;
import cn.gson.prohis.model.pojos.YxjStaff;
import cn.gson.prohis.model.service.YXJ.YxjStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class YxjStaffController {
    @Autowired
    YxjStaffService yxjStaffService;

    /**
     * 查询员工
     * @return
     */
    @RequestMapping("/allStaff")
    public List<YxjStaff> allStaff(){return yxjStaffService.allStaff();}

    /**
     * 新增员工
     * @param yxjStaff
     */
    @RequestMapping("/addStaff")
    public void addStaff(@RequestBody YxjStaff yxjStaff){yxjStaffService.addStaff(yxjStaff);}

    /**
     * 修改员工
     * @param yxjStaff
     */
    @RequestMapping("/updateStaff")
    public void updateStaff(@RequestBody YxjStaff yxjStaff){yxjStaffService.updateStaff(yxjStaff);}

    /**
     * 查询部门表
     * @return
     */
    @RequestMapping("/allDept")
    public List<YxjDept> allDept(){return yxjStaffService.allDept();}
}
