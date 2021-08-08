package cn.gson.prohis.model.pojos;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

public class ZsxCallNumber {

  private long callNumberId;
  private String registrationNumber;
  private ZsxRegistration registration;
  private Timestamp callNumberTime;

  public ZsxRegistration getRegistration() {
    return registration;
  }

  public void setRegistration(ZsxRegistration registration) {
    this.registration = registration;
  }

  public long getCallNumberId() {
    return callNumberId;
  }

  public void setCallNumberId(long callNumberId) {
    this.callNumberId = callNumberId;
  }


  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  public Timestamp getCallNumberTime() {
    return callNumberTime;
  }

  public void setCallNumberTime(Timestamp callNumberTime) {
    this.callNumberTime = callNumberTime;
  }
}
