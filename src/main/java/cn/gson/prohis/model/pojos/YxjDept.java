package cn.gson.prohis.model.pojos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;
import java.util.List;

/**
 * 部门实体类
 */
public class YxjDept {

  private Integer deptId;
  private String deptName;
  private Date deptTime;
  private long deptNum;

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer getDeptId() {
    return deptId;
  }

  public void setDeptId(Integer deptId) {
    this.deptId = deptId;
  }


  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }


  public Date getDeptTime() {
    return deptTime;
  }

  public void setDeptTime(Date deptTime) {
    this.deptTime = deptTime;
  }


  public long getDeptNum() {
    return deptNum;
  }

  public void setDeptNum(long deptNum) {
    this.deptNum = deptNum;
  }


  private List<YxjStaff> yxjStaffs;

  //一个部门对应多个员工
  public List<YxjStaff> getYxjStaffs() {
    return yxjStaffs;
  }

  public void setYxjStaffs(List<YxjStaff> yxjStaffs) {
    this.yxjStaffs = yxjStaffs;
  }
}
