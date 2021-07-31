package cn.gson.prohis.model.pojos;



public class LyhCheckDetailsEntity {
    private int detailsId;
    private Integer drugId;
    private Integer checkId;
    private Integer detailsNumber;


    public Integer getDetailsNumber() {
        return detailsNumber;
    }

    public void setDetailsNumber(Integer detailsNumber) {
        this.detailsNumber = detailsNumber;
    }

    public int getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(int detailsId) {
        this.detailsId = detailsId;
    }


    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }


    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }



    private LyhCheckEntity checkEntity;

    public LyhCheckEntity getCheckEntity() {
        return checkEntity;
    }

    public void setCheckEntity(LyhCheckEntity checkEntity) {
        this.checkEntity = checkEntity;
    }


    private LyhDrugEntity lyhDrugEntity;

    public LyhDrugEntity getLyhDrugEntity() {
        return lyhDrugEntity;
    }

    public void setLyhDrugEntity(LyhDrugEntity lyhDrugEntity) {
        this.lyhDrugEntity = lyhDrugEntity;
    }
}
