package cn.gson.prohis.model.pojos;


import java.util.Date;

public class ZsxMedicalCardRecord {

  private long medicalCardRecordId;
  private Date medicalCardTime;


  public long getMedicalCardRecordId() {
    return medicalCardRecordId;
  }

  public void setMedicalCardRecordId(long medicalCardRecordId) {
    this.medicalCardRecordId = medicalCardRecordId;
  }


  public Date getMedicalCardTime() {
    return medicalCardTime;
  }

  public void setMedicalCardTime(Date medicalCardTime) {
    this.medicalCardTime = medicalCardTime;
  }
}
