package cn.gson.prohis.model.pojos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

/**
 * 科室实体类
 */
public class YxjDesk {

  private Integer deskId;
  private String deskName;
  private Date deskTime;


  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer getDeskId() {
    return deskId;
  }

  public void setDeskId(Integer deskId) {
    this.deskId = deskId;
  }


  public String getDeskName() {
    return deskName;
  }

  public void setDeskName(String deskName) {
    this.deskName = deskName;
  }


  public Date getDeskTime() {
    return deskTime;
  }

  public void setDeskTime(Date deskTime) {
    this.deskTime = deskTime;
  }

}
