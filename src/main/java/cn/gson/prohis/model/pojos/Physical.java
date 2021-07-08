package cn.gson.prohis.model.pojos;


/**
 * 体检类别实体
 */
public class Physical {

  private long phId;
  private String phName;
  private String phType;
  private String phCharge;
  private double phPrice;


  public long getPhId() {
    return phId;
  }

  public void setPhId(long phId) {
    this.phId = phId;
  }


  public String getPhName() {
    return phName;
  }

  public void setPhName(String phName) {
    this.phName = phName;
  }


  public String getPhType() {
    return phType;
  }

  public void setPhType(String phType) {
    this.phType = phType;
  }


  public String getPhCharge() {
    return phCharge;
  }

  public void setPhCharge(String phCharge) {
    this.phCharge = phCharge;
  }


  public double getPhPrice() {
    return phPrice;
  }

  public void setPhPrice(double phPrice) {
    this.phPrice = phPrice;
  }

}
