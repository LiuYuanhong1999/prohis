package cn.gson.prohis.model.pojos;


import java.sql.Timestamp;

public class ZsxCharge {

  private Integer chargeId;
  private Timestamp chargeTime;
  private String chargePatientName;
  private long chargeOperatorId;
  private long dotor;
  private String chargeMoney;
//  连接挂号表
  private ZsxRegistration registration;

  public ZsxRegistration getRegistration() {
    return registration;
  }

  public void setRegistration(ZsxRegistration registration) {
    this.registration = registration;
  }
//  连接处方表
  private ZsxPrescription prescription;

  public ZsxPrescription getPrescription() {
    return prescription;
  }

  public void setPrescription(ZsxPrescription prescription) {
    this.prescription = prescription;
  }

  public Integer getChargeId() {
    return chargeId;
  }

  public void setChargeId(Integer chargeId) {
    this.chargeId = chargeId;
  }

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
            ", registration=" + registration +
            ", prescription=" + prescription +
            '}';
  }
}
