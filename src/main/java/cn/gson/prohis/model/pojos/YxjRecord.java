package cn.gson.prohis.model.pojos;


public class YxjRecord {

  private long recordId;
  private String recordName;
  private long phId;
  private String recordZxr;
  private java.sql.Timestamp recordTime;
  private long recordZt;
  private long patientId;

  public long getPatientId() {
    return patientId;
  }

  public void setPatientId(long patientId) {
    this.patientId = patientId;
  }

  public long getRecordId() {
    return recordId;
  }

  public void setRecordId(long recordId) {
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


  public java.sql.Timestamp getRecordTime() {
    return recordTime;
  }

  public void setRecordTime(java.sql.Timestamp recordTime) {
    this.recordTime = recordTime;
  }


  public long getRecordZt() {
    return recordZt;
  }

  public void setRecordZt(long recordZt) {
    this.recordZt = recordZt;
  }

  public TyhRecipedetailEntity tyhRecipedetailEntity;

  public TyhRecipedetailEntity getTyhRecipedetailEntity() {
    return tyhRecipedetailEntity;
  }

  public void setTyhRecipedetailEntity(TyhRecipedetailEntity tyhRecipedetailEntity) {
    this.tyhRecipedetailEntity = tyhRecipedetailEntity;
  }
}
