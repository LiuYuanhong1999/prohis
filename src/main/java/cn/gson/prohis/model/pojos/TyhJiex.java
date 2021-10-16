package cn.gson.prohis.model.pojos;


import java.util.List;

public class TyhJiex {

  private long jiexId;
  private long projectId;
  private long drugId;
  private double jeixPrice;
  private String jieId;

  @Override
  public String toString() {
    return "TyhJiex{" +
            "jiexId=" + jiexId +
            ", projectId=" + projectId +
            ", drugId=" + drugId +
            ", jeixPrice=" + jeixPrice +
            ", jieId='" + jieId + '\'' +
            ", xId=" + xId +
            ", yxjProjectEntity=" + yxjProjectEntity +
            ", lyhDrugEntity=" + lyhDrugEntity +
            ", tyhJie=" + tyhJie +
            '}';
  }

  public List getxId() {
    return xId;
  }

  public void setxId(List xId) {
    this.xId = xId;
  }

  private List xId;

  private YxjProjectEntity yxjProjectEntity;

  private LyhDrugEntity lyhDrugEntity;

  private TyhJie tyhJie;

  public YxjProjectEntity getYxjProjectEntity() {
    return yxjProjectEntity;
  }

  public void setYxjProjectEntity(YxjProjectEntity yxjProjectEntity) {
    this.yxjProjectEntity = yxjProjectEntity;
  }

  public LyhDrugEntity getLyhDrugEntity() {
    return lyhDrugEntity;
  }

  public void setLyhDrugEntity(LyhDrugEntity lyhDrugEntity) {
    this.lyhDrugEntity = lyhDrugEntity;
  }

  public TyhJie getTyhJie() {
    return tyhJie;
  }

  public void setTyhJie(TyhJie tyhJie) {
    this.tyhJie = tyhJie;
  }

  public String getJieId() {
    return jieId;
  }

  public void setJieId(String jieId) {
    this.jieId = jieId;
  }

  public long getJiexId() {
    return jiexId;
  }

  public void setJiexId(long jiexId) {
    this.jiexId = jiexId;
  }


  public long getProjectId() {
    return projectId;
  }

  public void setProjectId(long projectId) {
    this.projectId = projectId;
  }


  public long getDrugId() {
    return drugId;
  }

  public void setDrugId(long drugId) {
    this.drugId = drugId;
  }


  public double getJeixPrice() {
    return jeixPrice;
  }

  public void setJeixPrice(double jeixPrice) {
    this.jeixPrice = jeixPrice;
  }

}
