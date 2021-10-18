package cn.gson.prohis.model.pojos;


import java.sql.Timestamp;

public class ZsxOperationNote {

  private long operationNoteId;
  private long operationId;
  private long surgeryArrangeId;
  private String operationNoteMoney;
  private long operationZt;
  private long executedelId;
  private Timestamp operDate;
  private long patientId;

  public long getPatientId() {
    return patientId;
  }

  public void setPatientId(long patientId) {
    this.patientId = patientId;
  }

  public Timestamp getOperDate() {
    return operDate;
  }

  public void setOperDate(Timestamp operDate) {
    this.operDate = operDate;
  }

  public long getOperationNoteId() {
    return operationNoteId;
  }

  public void setOperationNoteId(long operationNoteId) {
    this.operationNoteId = operationNoteId;
  }


  public long getOperationId() {
    return operationId;
  }

  public void setOperationId(long operationId) {
    this.operationId = operationId;
  }


  public long getSurgeryArrangeId() {
    return surgeryArrangeId;
  }

  public void setSurgeryArrangeId(long surgeryArrangeId) {
    this.surgeryArrangeId = surgeryArrangeId;
  }


  public String getOperationNoteMoney() {
    return operationNoteMoney;
  }

  public void setOperationNoteMoney(String operationNoteMoney) {
    this.operationNoteMoney = operationNoteMoney;
  }


  public long getOperationZt() {
    return operationZt;
  }

  public void setOperationZt(long operationZt) {
    this.operationZt = operationZt;
  }


  public long getExecutedelId() {
    return executedelId;
  }

  public void setExecutedelId(long executedelId) {
    this.executedelId = executedelId;
  }

  public TyhRecipedetailEntity tyhRecipedetailEntity;

  public TyhRecipedetailEntity getTyhRecipedetailEntity() {
    return tyhRecipedetailEntity;
  }

  public void setTyhRecipedetailEntity(TyhRecipedetailEntity tyhRecipedetailEntity) {
    this.tyhRecipedetailEntity = tyhRecipedetailEntity;
  }}



