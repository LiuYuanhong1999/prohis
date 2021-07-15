package cn.gson.prohis.model.pojos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.transaction.Transactional;
import javax.xml.crypto.Data;
import java.beans.Transient;
import java.util.Date;

/**
 * 体检记录实体类
 */
public class YxjRecord {

  private Integer recordId;
  private String recordName;
  private long phId;
  private String recordZxr;
  private Date recordTime;


  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer getRecordId() {
    return recordId;
  }

  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
  }


  public String getRecordName() {
    return recordName;
  }

  public void setRecordName(String recordName) {
    this.recordName = recordName;
  }


  public long getPhId() {
    return phId;
  }

  public void setPhId(long phId) {
    this.phId = phId;
  }


  public String getRecordZxr() {
    return recordZxr;
  }

  public void setRecordZxr(String recordZxr) {
    this.recordZxr = recordZxr;
  }

  public Date getRecordTime() { return recordTime; }

  public void setRecordTime(Date recordTime) { this.recordTime = recordTime; }

  /**
   * 多条记录对应一个类别
   */
  private YxjPhysical yxjPhysical;


  @Transactional
  public YxjPhysical getYxjPhysical() {
    return yxjPhysical;
  }

  public void setYxjPhysical(YxjPhysical yxjPhysical) {
    this.yxjPhysical = yxjPhysical;
  }

  @Override
  public String toString() {
    return "YxjRecord{" +
            "recordId=" + recordId +
            ", recordName='" + recordName + '\'' +
            ", phId=" + phId +
            ", recordZxr='" + recordZxr + '\'' +
            ", yxjPhysical=" + yxjPhysical +
            '}';
  }
}
