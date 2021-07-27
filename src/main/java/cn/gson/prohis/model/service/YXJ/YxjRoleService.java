package cn.gson.prohis.model.service.YXJ;

import cn.gson.prohis.model.mapper.YXJ.YxjFunctionMapper;
import cn.gson.prohis.model.mapper.YXJ.YxjRoleMapper;
import cn.gson.prohis.model.pojos.YxjFunctionInfo;
import cn.gson.prohis.model.pojos.YxjRoleFunction;
import cn.gson.prohis.model.pojos.YxjRoleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class YxjRoleService {
    @Autowired
    YxjRoleMapper yxjRoleMapper;

    @Autowired
    YxjFunctionMapper yxjFunctionMapper;

    /**
     * 查询所有角色
     * @return
     */
    public List<YxjRoleInfo> allRole(){return yxjRoleMapper.allRole();}

    /**
     *新增角色
     * @param yxjRoleInfo
     */
    public void addRole(YxjRoleInfo yxjRoleInfo){yxjRoleMapper.addRole(yxjRoleInfo);}

    /**
     * 查询权限列表
     * @return
     */
    public List<YxjFunctionInfo> allFunc(){return yxjFunctionMapper.allFunc();};

    /**
     * 授权
     */
    public void saveGrant(Integer roleId,List<Integer> checkedKeys){
        if(checkedKeys != null){
            yxjFunctionMapper.saveGrant(roleId,checkedKeys);
        }else {
            checkedKeys.clear();  }
        }

    /**
     * 根据登录用户Id查询已授权权限
     * @param userId
     * @return
     */
    public List<Integer> roleFun(Integer userId){
        return yxjFunctionMapper.roleFun(userId);
    }
}
