package cn.gson.prohis.controller.YXJ;

import cn.gson.prohis.model.pojos.YxjFunctionInfo;
import cn.gson.prohis.model.pojos.YxjRoleInfo;
import cn.gson.prohis.model.service.YXJ.YxjRoleService;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class YxjRoleController {
    @Autowired
    YxjRoleService yxjRoleService;

    /**
     * 查询所有角色
     * @return
     */
    @RequestMapping("/allRole")
    public List<YxjRoleInfo> allRole(){return yxjRoleService.allRole();}

    /**
     * 新增角色
     * @param yxjRoleInfo
     */
    @RequestMapping("/addRole")
    public void addRole(@RequestBody YxjRoleInfo yxjRoleInfo){yxjRoleService.addRole(yxjRoleInfo);}

    /**
     * 权限列表
     * @return
     */
    @RequestMapping("/allFunc")
    public List<YxjFunctionInfo> allFunc(){return yxjRoleService.allFunc();}


    /**
     * 授权权限
     * @param grant
     */
    @PostMapping("/saveGrant")
    public void saveGrant(@RequestParam("grant") String grant){
        JSONObject o = JSONObject.parseObject(grant);
        Integer roleId = Integer.parseInt(o.get("roleId").toString());
        List<Integer> checkedKeys = JSONArray.parseArray(o.get("checkedKeys").toString(),Integer.TYPE);
        yxjRoleService.saveGrant(roleId,checkedKeys);
    }

    /**
     * 根据当前用户查询已授权的权限
     * @param userId
     * @return
     */
    @RequestMapping("/allGrantFun")
    public List<Integer> allGrantFun(Integer userId){
        return yxjRoleService.roleFun(userId);
    }
}
