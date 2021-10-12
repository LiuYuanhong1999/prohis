package cn.gson.prohis.model.pojos;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

public class ZsxCharge {

  private Integer chargeId;
  private Timestamp chargeTime;
  private String chargePatientName;
  private long chargeOperatorId;
  private long dotor;
  private String chargeMoney;
//  连接病人表
  private ZsxPatientData patient;

  public ZsxPatientData getPatient() {
    return patient;
  }

  public void setPatient(ZsxPatientData patient) {
    this.patient = patient;
  }

  public Integer getChargeId() {
    return chargeId;
  }

  public void setChargeId(Integer chargeId) {
    this.chargeId = chargeId;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd  HH:mm:SS")
  @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:SS", timezone = "GMT+8")
  public Timestamp getChargeTime() {
    return chargeTime;
  }

  public void setChargeTime(Timestamp chargeTime) {
    this.chargeTime = chargeTime;
  }

  public String getChargePatientName() {
    return chargePatientName;
  }

  public void setChargePatientName(String chargePatientName) {
    this.chargePatientName = chargePatientName;
  }


  public long getChargeOperatorId() {
    return chargeOperatorId;
  }

  public void setChargeOperatorId(long chargeOperatorId) {
    this.chargeOperatorId = chargeOperatorId;
  }


  public long getDotor() {
    return dotor;
  }

  public void setDotor(long dotor) {
    this.dotor = dotor;
  }


  public String getChargeMoney() {
    return chargeMoney;
  }

  public void setChargeMoney(String chargeMoney) {
    this.chargeMoney = chargeMoney;
  }

  @Override
  public String toString() {
    return "ZsxCharge{" +
            "chargeId=" + chargeId +
            ", chargeTime=" + chargeTime +
            ", chargePatientName='" + chargePatientName + '\'' +
            ", chargeOperatorId=" + chargeOperatorId +
            ", dotor=" + dotor +
            ", chargeMoney='" + chargeMoney + '\'' +
            ", patient=" + patient +
            '}';
  }
}
