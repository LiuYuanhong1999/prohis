package cn.gson.prohis.model.pojos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class ZsxMedicalCard {

  private long medicalCardId;
  private String medicalCardNumber;
  private String medicalCardPassword;
  private String medicalCardBalance;
  private long medicalCardLock;

  private ZsxMedicalCardRecord medicalCardRecords;

  public ZsxMedicalCardRecord getMedicalCardRecords() {
    return medicalCardRecords;
  }

  public void setMedicalCardRecords(ZsxMedicalCardRecord medicalCardRecords) {
    this.medicalCardRecords = medicalCardRecords;
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


  public String getMedicalCardBalance() {
    return medicalCardBalance;
  }

  public void setMedicalCardBalance(String medicalCardBalance) {
    this.medicalCardBalance = medicalCardBalance;
  }


  public long getMedicalCardLock() {
    return medicalCardLock;
  }

  public void setMedicalCardLock(long medicalCardLock) {
    this.medicalCardLock = medicalCardLock;
  }

}
