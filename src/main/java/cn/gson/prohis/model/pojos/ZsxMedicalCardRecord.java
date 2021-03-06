package cn.gson.prohis.model.pojos;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Timestamp;
import java.util.Date;

public class ZsxMedicalCardRecord {

  private long medicalCardRecordId;
  private String medicalCardNumber;
  private Timestamp medicalCardTime;
  private String medicalCardPerson;
  private Double medicalCardMoney;

  public String getMedicalCardPerson() {
    return medicalCardPerson;
  }

  public void setMedicalCardPerson(String medicalCardPerson) {
    this.medicalCardPerson = medicalCardPerson;
  }

  public Double getMedicalCardMoney() {
    return medicalCardMoney;
  }

  public void setMedicalCardMoney(Double medicalCardMoney) {
    this.medicalCardMoney = medicalCardMoney;
  }

  public String getMedicalCardNumber() {
    return medicalCardNumber;
  }

  public void setMedicalCardNumber(String medicalCardNumber) {
    this.medicalCardNumber = medicalCardNumber;
  }

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public long getMedicalCardRecordId() {
    return medicalCardRecordId;
  }

  public void setMedicalCardRecordId(long medicalCardRecordId) {
    this.medicalCardRecordId = medicalCardRecordId;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:SS")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:SS", timezone = "GMT+8")
  public Timestamp getMedicalCardTime() {
    return medicalCardTime;
  }

  public void setMedicalCardTime(Timestamp medicalCardTime) {
    this.medicalCardTime = medicalCardTime;
  }

  @Override
  public String toString() {
    return "ZsxMedicalCardRecord{" +
            "medicalCardRecordId=" + medicalCardRecordId +
            ", medicalCardNumber='" + medicalCardNumber + '\'' +
            ", medicalCardTime=" + medicalCardTime +
            ", medicalCardPerson='" + medicalCardPerson + '\'' +
            ", medicalCardMoney='" + medicalCardMoney + '\'' +
            '}';
  }
}
