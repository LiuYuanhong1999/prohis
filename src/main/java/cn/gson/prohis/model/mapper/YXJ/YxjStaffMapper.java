package cn.gson.prohis.model.mapper.YXJ;

import cn.gson.prohis.model.pojos.YxjDept;
import cn.gson.prohis.model.pojos.YxjStaff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YxjStaffMapper {

    /**
     * 查询所有员工
     * @return
     */
    List<YxjStaff> allStaff();

    /**
     * 新增员工
     * @param yxjStaff
     */
    void addStaff(YxjStaff yxjStaff);

    /**
     * 修改员工
     * @param yxjStaff
     */
    void updateStaff(YxjStaff yxjStaff);

    /**
     * 查询部门
     * @return
     */
    List<YxjDept> allDept();

}
