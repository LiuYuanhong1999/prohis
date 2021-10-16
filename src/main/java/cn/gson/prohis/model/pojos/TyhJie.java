package cn.gson.prohis.model.pojos;


import java.util.List;

public class TyhJie {

  private String jieId;
  private java.sql.Timestamp jieDate;
  private double jiePrice;
  private String hosregNum;

  private List<TyhJiex> tyhJiexes;

  public List<TyhJiex> getTyhJiexes() {
    return tyhJiexes;
  }

  public void setTyhJiexes(List<TyhJiex> tyhJiexes) {
    this.tyhJiexes = tyhJiexes;
  }

  public String getJieId() {
    return jieId;
  }

  public void setJieId(String jieId) {
    this.jieId = jieId;
  }


  public java.sql.Timestamp getJieDate() {
    return jieDate;
  }

  public void setJieDate(java.sql.Timestamp jieDate) {
    this.jieDate = jieDate;
  }


  public double getJiePrice() {
    return jiePrice;
  }

  public void setJiePrice(double jiePrice) {
    this.jiePrice = jiePrice;
  }


  public String getHosregNum() {
    return hosregNum;
  }

  public void setHosregNum(String hosregNum) {
    this.hosregNum = hosregNum;
  }

  @Override
  public String toString() {
    return "TyhJie{" +
            "jieId='" + jieId + '\'' +
            ", jieDate=" + jieDate +
            ", jiePrice=" + jiePrice +
            ", hosregNum='" + hosregNum + '\'' +
            ", tyhJiexes=" + tyhJiexes +
            '}';
  }
}
