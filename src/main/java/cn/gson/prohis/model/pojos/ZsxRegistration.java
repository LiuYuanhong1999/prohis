package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

public class ZsxRegistration {

  private Integer registrationId;
  private String registrationNumber;
  private String patientDataId;
  private String room;
  private String doctot;
  private Timestamp registrationTime;
  private String registrationFee;
  private Integer registrationState;

  public Integer getRegistrationState() {
    return registrationState;
  }

  public void setRegistrationState(Integer registrationState) {
    this.registrationState = registrationState;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  private ZsxPatientData patient;

  public ZsxPatientData getPatient() {
    return patient;
  }

  public void setPatient(ZsxPatientData patient) {
    this.patient = patient;
  }

  public Integer getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(Integer registrationId) {
    this.registrationId = registrationId;
  }


  public String getPatientDataId() {
    return patientDataId;
  }

  public void setPatientDataId(String patientDataId) {
    this.patientDataId = patientDataId;
  }


  public String getRoom() {
    return room;
  }

  public void setRoom(String room) {
    this.room = room;
  }


  public String getDoctot() {
    return doctot;
  }

  public void setDoctot(String doctot) {
    this.doctot = doctot;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  public Timestamp getRegistrationTime() {
    return registrationTime;
  }

  public void setRegistrationTime(Timestamp registrationTime) {
    this.registrationTime = registrationTime;
  }

  public String getRegistrationFee() {
    return registrationFee;
  }

  public void setRegistrationFee(String registrationFee) {
    this.registrationFee = registrationFee;
  }

}
