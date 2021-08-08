package cn.gson.prohis.model.pojos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

public class ZsxMedicalCard {

  private long medicalCardId;
  private String medicalCardNumber;
  private String medicalCardPassword;
  private Double medicalCardBalance;
  private long medicalCardLock;
  private Double nmsl;

  public Double getNmsl() {
    return nmsl;
  }

  public void setNmsl(Double nmsl) {
    this.nmsl = nmsl;
  }

  public void setMedicalCardRecord(List<ZsxMedicalCardRecord> medicalCardRecord) {
    this.medicalCardRecord = medicalCardRecord;
  }

  private List<ZsxMedicalCardRecord> medicalCardRecord;

  public List<ZsxMedicalCardRecord> getMedicalCardRecord() {
    return medicalCardRecord;
  }

  public void setMedicalCardRecords(List<ZsxMedicalCardRecord> medicalCardRecord) {
    this.medicalCardRecord = medicalCardRecord;
  }

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public long getMedicalCardId() {
    return medicalCardId;
  }

  public void setMedicalCardId(long medicalCardId) {
    this.medicalCardId = medicalCardId;
  }


  public String getMedicalCardNumber() {
    return medicalCardNumber;
  }

  public void setMedicalCardNumber(String medicalCardNumber) {
    this.medicalCardNumber = medicalCardNumber;
  }


  public String getMedicalCardPassword() {
    return medicalCardPassword;
  }

  public void setMedicalCardPassword(String medicalCardPassword) {
    this.medicalCardPassword = medicalCardPassword;
  }


  public Double getMedicalCardBalance() {
    return medicalCardBalance;
  }

  public void setMedicalCardBalance(Double medicalCardBalance) {
    this.medicalCardBalance = medicalCardBalance;
  }

  public long getMedicalCardLock() {
    return medicalCardLock;
  }

  public void setMedicalCardLock(long medicalCardLock) {
    this.medicalCardLock = medicalCardLock;
  }

  @Override
  public String toString() {
    return "ZsxMedicalCard{" +
            "medicalCardId=" + medicalCardId +
            ", medicalCardNumber='" + medicalCardNumber + '\'' +
            ", medicalCardPassword='" + medicalCardPassword + '\'' +
            ", medicalCardBalance=" + medicalCardBalance +
            ", medicalCardLock=" + medicalCardLock +
            ", nmsl=" + nmsl +
            ", medicalCardRecord=" + medicalCardRecord +
            '}';
  }
}
