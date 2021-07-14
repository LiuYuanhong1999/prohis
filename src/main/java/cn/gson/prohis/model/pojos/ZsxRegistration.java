package cn.gson.prohis.model.pojos;


import java.sql.Date;

public class ZsxRegistration {

  private long registrationId;
  private String patientDataId;
  private String room;
  private String doctot;
  private Date registrationTime;
  private String registrationFee;

  private ZsxPatientData patient;

  public ZsxPatientData getPatient() {
    return patient;
  }

  public void setPatient(ZsxPatientData patient) {
    this.patient = patient;
  }

  public long getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(long registrationId) {
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

}
