package cn.gson.prohis.model.pojos;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;

public class ZsxMedicalCardRecord {

  private long medicalCardRecordId;
  private Timestamp medicalCardTime;


  public long getMedicalCardRecordId() {
    return medicalCardRecordId;
  }

  public void setMedicalCardRecordId(long medicalCardRecordId) {
    this.medicalCardRecordId = medicalCardRecordId;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  public Timestamp getMedicalCardTime() {
    return medicalCardTime;
  }

  public void setMedicalCardTime(Timestamp medicalCardTime) {
    this.medicalCardTime = medicalCardTime;
  }
}
