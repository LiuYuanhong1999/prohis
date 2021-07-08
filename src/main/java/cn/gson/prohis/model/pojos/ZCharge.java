package cn.gson.prohis.model.pojos;


import java.sql.Date;

public class ZCharge {

  private long chargeId;
  private Date chargeTime;
  private String chargePatientName;
  private long chargeOperatorId;
  private long dotor;
  private String chargeMoney;


  public long getChargeId() {
    return chargeId;
  }

  public void setChargeId(long chargeId) {
    this.chargeId = chargeId;
  }


  public Date getChargeTime() {
    return chargeTime;
  }

  public void setChargeTime(Date chargeTime) {
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

}
