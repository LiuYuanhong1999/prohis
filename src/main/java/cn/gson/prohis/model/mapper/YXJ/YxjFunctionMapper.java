package cn.gson.prohis.model.mapper.YXJ;

import cn.gson.prohis.model.pojos.YxjFunctionInfo;
import cn.gson.prohis.model.pojos.YxjRoleFunction;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YxjFunctionMapper {

    /**
     * 查询权限列表
     * @return
     */
    List<YxjFunctionInfo> allFunc();

    /**
     * 新增权限组
     */
    void saveGrant(Integer roleId,List<Integer> checkedKeys);

    /**
     * 根据用户id查询已授权权限
     * @param userId
     * @return
     */
    List<Integer> roleFun(Integer userId);
}
