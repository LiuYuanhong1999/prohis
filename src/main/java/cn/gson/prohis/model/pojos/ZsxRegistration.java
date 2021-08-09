package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

public class ZsxRegistration {

  private Integer registrationId;
  private String registrationNumber;
  private Integer patientDataId;
  private String room;
  private int doctot;
  private Timestamp registrationTime;
  private Double registrationFee;
  private Integer registrationState;
  private String registrationType;
  private String registrationName;

  public String getRegistrationType() {
    return registrationType;
  }

  public void setRegistrationType(String registrationType) {
    this.registrationType = registrationType;
  }

  public String getRegistrationName() {
    return registrationName;
  }

  public void setRegistrationName(String registrationName) {
    this.registrationName = registrationName;
  }

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

  private YxjDesk desk;

  public YxjDesk getDesk() {
    return desk;
  }

  public void setDesk(YxjDesk desk) {
    this.desk = desk;
  }

  public Integer getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(Integer registrationId) {
    this.registrationId = registrationId;
  }


  public Integer getPatientDataId() {
    return patientDataId;
  }

  public void setPatientDataId(Integer patientDataId) {
    this.patientDataId = patientDataId;
  }


  public String getRoom() {
    return room;
  }

  public void setRoom(String room) {
    this.room = room;
  }


  public int getDoctot() {
    return doctot;
  }

  public void setDoctot(int doctot) {
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

  public Double getRegistrationFee() {
    return registrationFee;
  }

  public void setRegistrationFee(Double registrationFee) {
    this.registrationFee = registrationFee;
  }

  public TyhHosnotEntity tyhHosnotEntity;

  public TyhHosnotEntity getTyhHosnotEntity() {
    return tyhHosnotEntity;
  }

  public void setTyhHosnotEntity(TyhHosnotEntity tyhHosnotEntity) {
    this.tyhHosnotEntity = tyhHosnotEntity;
  }
}
