package cn.gson.prohis.model.pojos;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Timestamp;
import java.util.List;

public class ZsxPrescription {

  private String prescriptionId;
  private long doctor;
  private Timestamp prescriptionTime;
  private long registrationId;
  private Double prescriptionMoney;

//  处方详情表
  private List<ZsxPrescriptionDetails> prescriptionDetails;
//  挂号表
  private ZsxRegistration registration;

  public ZsxRegistration getRegistration() {
    return registration;
  }

  public void setRegistration(ZsxRegistration registration) {
    this.registration = registration;
  }


  public List<ZsxPrescriptionDetails> getPrescriptionDetails() {
    return prescriptionDetails;
  }

  public void setPrescriptionDetails(List<ZsxPrescriptionDetails> prescriptionDetails) {
    this.prescriptionDetails = prescriptionDetails;
  }

  public String getPrescriptionId() {
    return prescriptionId;
  }

  public void setPrescriptionId(String prescriptionId) {
    this.prescriptionId = prescriptionId;
  }


  public long getDoctor() {
    return doctor;
  }

  public void setDoctor(long doctor) {
    this.doctor = doctor;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  public Timestamp getPrescriptionTime() {
    return prescriptionTime;
  }

  public void setPrescriptionTime(Timestamp prescriptionTime) {
    this.prescriptionTime = prescriptionTime;
  }

  public long getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(long registrationId) {
    this.registrationId = registrationId;
  }

  public Double getPrescriptionMoney() {
    return prescriptionMoney;
  }

  public void setPrescriptionMoney(Double prescriptionMoney) {
    this.prescriptionMoney = prescriptionMoney;
  }
}
