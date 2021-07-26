package cn.gson.prohis.model.pojos;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class ZsxPatientData {

  private Integer patientDataId;
  private String patientDataCard;
  private String patientDataName;
  private String patientDataPhone;
  private String patientDataSex;
  private String medicalCardNumber;

  public String getMedicalCardNumber() {
    return medicalCardNumber;
  }

  public void setMedicalCardNumber(String medicalCardNumber) {
    this.medicalCardNumber = medicalCardNumber;
  }

  //  连接诊疗卡
  private ZsxMedicalCard medicalCard;

  public ZsxMedicalCard getMedicalCard() {
    return medicalCard;
  }

  public void setMedicalCard(ZsxMedicalCard medicalCard) {
    this.medicalCard = medicalCard;
  }

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer getPatientDataId() {
    return patientDataId;
  }

  public void setPatientDataId(Integer patientDataId) {
    this.patientDataId = patientDataId;
  }


  public String getPatientDataCard() {
    return patientDataCard;
  }

  public void setPatientDataCard(String patientDataCard) {
    this.patientDataCard = patientDataCard;
  }


  public String getPatientDataName() {
    return patientDataName;
  }

  public void setPatientDataName(String patientDataName) {
    this.patientDataName = patientDataName;
  }


  public String getPatientDataPhone() {
    return patientDataPhone;
  }

  public void setPatientDataPhone(String patientDataPhone) {
    this.patientDataPhone = patientDataPhone;
  }


  public String getPatientDataSex() {
    return patientDataSex;
  }

  public void setPatientDataSex(String patientDataSex) {
    this.patientDataSex = patientDataSex;
  }


  @Override
  public String toString() {
    return "ZsxPatientData{" +
            "patientDataId=" + patientDataId +
            ", patientDataCard='" + patientDataCard + '\'' +
            ", patientDataName='" + patientDataName + '\'' +
            ", patientDataPhone='" + patientDataPhone + '\'' +
            ", patientDataSex='" + patientDataSex + '\'' +
            ", medicalCardNumber='" + medicalCardNumber + '\'' +
            ", medicalCard=" + medicalCard +
            '}';
  }
}
