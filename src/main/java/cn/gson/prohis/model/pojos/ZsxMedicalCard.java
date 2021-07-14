package cn.gson.prohis.model.pojos;


import java.util.Set;

public class ZsxMedicalCard {

  private long medicalCardId;
  private String medicalCardNumber;
  private String medicalCardPassword;
  private String medicalCardBalance;
  private long medicalCardLock;

  private Set<ZsxMedicalCardRecord> medicalCardRecords;

  public Set<ZsxMedicalCardRecord> getMedicalCardRecords() {
    return medicalCardRecords;
  }

  public void setMedicalCardRecords(Set<ZsxMedicalCardRecord> medicalCardRecords) {
    this.medicalCardRecords = medicalCardRecords;
  }

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
