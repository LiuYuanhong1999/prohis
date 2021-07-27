package cn.gson.prohis.model.service.YXJ;

import cn.gson.prohis.model.mapper.YXJ.YxjStaffMapper;
import cn.gson.prohis.model.pojos.YxjDept;
import cn.gson.prohis.model.pojos.YxjStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YxjStaffService {
    @Autowired
    YxjStaffMapper yxjStaffMapper;

    /**
     * 查询所有员工
     * @return
     */
    public List<YxjStaff> allStaff(){return yxjStaffMapper.allStaff();}

    /**
     * 新增员工
     * @param yxjStaff
     */
    public void addStaff(YxjStaff yxjStaff){
        if (yxjStaff.getStaffId() != null){
            yxjStaffMapper.updateStaff(yxjStaff);
        }else {
            yxjStaffMapper.addStaff(yxjStaff);}
        }


    /**
     * 修改员工
     * @param yxjStaff
     */
    public void updateStaff(YxjStaff yxjStaff){yxjStaffMapper.updateStaff(yxjStaff);}

    /**
     * 查询部门
     * @return
     */
    public List<YxjDept> allDept(){return yxjStaffMapper.allDept();}
}
