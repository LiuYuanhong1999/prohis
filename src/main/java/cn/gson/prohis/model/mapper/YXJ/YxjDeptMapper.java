package cn.gson.prohis.model.mapper.YXJ;

import cn.gson.prohis.model.pojos.YxjDept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 部门接口
 */
@Mapper
public interface YxjDeptMapper {

    /**
     * 查询所有部门
     * @return
     */
    List<YxjDept> selDept();

    /**
     * 新增部门
     * @param yxjDept
     */
    void addDept(YxjDept yxjDept);

    /**
     * 修改部门
     * @param yxjDept
     */
    void updateDept(YxjDept yxjDept);

    /**
     * 查询Id
     * @param deptId
     * @return
     */
    YxjDept selDeptId(Integer deptId);


}
