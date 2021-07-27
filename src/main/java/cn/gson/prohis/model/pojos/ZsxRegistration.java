package cn.gson.prohis.model.pojos;


import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Date;

public class ZsxRegistration {

  private Integer registrationId;
  private String patientDataId;
  private String room;
  private String doctot;
  private Date registrationTime;
  private String registrationFee;
  private Integer registrationState;

  public Integer getRegistrationState() {
    return registrationState;
  }

  public void setRegistrationState(Integer registrationState) {
    this.registrationState = registrationState;
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


  public Date getRegistrationTime() {
    return registrationTime;
  }

  public void setRegistrationTime(Date registrationTime) {
    this.registrationTime = registrationTime;
  }

  public String getRegistrationFee() {
    return registrationFee;
  }

  public void setRegistrationFee(String registrationFee) {
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
