package cn.gson.prohis.model.pojos;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

/**
 * 员工实体类
 */
public class YxjStaff {

  private Integer staffId;
  private String staffName;
  private String staffAge;
  private Date staffTime;
  private long deptId;

  private YxjDept yxjDept;

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer getStaffId() {
    return staffId;
  }

  public void setStaffId(Integer staffId) {
    this.staffId = staffId;
  }

  public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public String getStaffAge() {
    return staffAge;
  }

  public void setStaffAge(String staffAge) {
    this.staffAge = staffAge;
  }

  public Date getStaffTime() {
    return staffTime;
  }

  public void setStaffTime(Date staffTime) {
    this.staffTime = staffTime;
  }

  public long getDeptId() {
    return deptId;
  }

  public void setDeptId(long deptId) {
    this.deptId = deptId;
  }

  // 多个员工对应一个部门
  public YxjDept getYxjDept() {
    return yxjDept;
  }

  public void setYxjDept(YxjDept yxjDept) {
    this.yxjDept = yxjDept;
  }
}
