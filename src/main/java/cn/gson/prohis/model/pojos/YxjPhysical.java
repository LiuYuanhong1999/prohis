package cn.gson.prohis.model.pojos;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

/**
 * 体检类别实体
 */
public class YxjPhysical {

  private Integer phId;
  private String phName;
  private String phType;
  private String phCharge;
  private double phPrice;

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer getPhId() {
    return phId;
  }

  public void setPhId(Integer phId) {
    this.phId = phId;
  }


  public String getPhName() {
    return phName;
  }

  public void setPhName(String phName) {
    this.phName = phName;
  }


  public String getPhType() {
    return phType;
  }

  public void setPhType(String phType) {
    this.phType = phType;
  }


  public String getPhCharge() {
    return phCharge;
  }

  public void setPhCharge(String phCharge) {
    this.phCharge = phCharge;
  }


  public double getPhPrice() {
    return phPrice;
  }

  public void setPhPrice(double phPrice) {
    this.phPrice = phPrice;
  }

  /**
   * 一个类别对应多个记录
   */
  private List<YxjRecord> yxjRecordList;

  public List<YxjRecord> getYxjRecordList() {
    return yxjRecordList;
  }

  public void setYxjRecordList(List<YxjRecord> yxjRecordList) {
    this.yxjRecordList = yxjRecordList;
  }


  @Override
  public String toString() {
    return "YxjPhysical{" +
            "phId=" + phId +
            ", phName='" + phName + '\'' +
            ", phType='" + phType + '\'' +
            ", phCharge='" + phCharge + '\'' +
            ", phPrice=" + phPrice +
            ", yxjRecordList=" + yxjRecordList +
            '}';
  }
}
