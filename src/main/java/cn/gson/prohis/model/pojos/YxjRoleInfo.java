package cn.gson.prohis.model.pojos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;
import java.util.List;

/**
 * 角色实体类
 */
public class YxjRoleInfo {

  private long roleId;
  private String roleName;
  private Date roleTime;

  //一个角色对多个权限组
  private List<YxjFunctionInfo> yxjFunctionInfos;

  public List<YxjFunctionInfo> getYxjFunctionInfos() {
    return yxjFunctionInfos;
  }

  public void setYxjFunctionInfos(List<YxjFunctionInfo> yxjFunctionInfos) {
    this.yxjFunctionInfos = yxjFunctionInfos;
  }

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public Date getRoleTime() {
    return roleTime;
  }

  public void setRoleTime(Date roleTime) {
    this.roleTime = roleTime;
  }

}
