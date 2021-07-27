package cn.gson.prohis.model.mapper.YXJ;

import cn.gson.prohis.model.pojos.YxjRoleInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YxjRoleMapper {

    /**
     * 查询所有角色
     * @return
     */
    List<YxjRoleInfo> allRole();

    /**
     * 新增角色
     * @param yxjRoleInfo
     */
    void addRole(YxjRoleInfo yxjRoleInfo);


}
