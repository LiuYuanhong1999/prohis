package cn.gson.prohis.model.pojos;




public class LyhReportDetailsEntity {
    private int detailsId;
    private Integer reportId;
    private String procurementId;
    private Integer drugId;
    private Integer numbers;
    private Integer piCi;


    public Integer getPiCi() {
        return piCi;
    }

    public void setPiCi(Integer piCi) {
        this.piCi = piCi;
    }

    public int getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(int detailsId) {
        this.detailsId = detailsId;
    }


    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }


    public String getProcurementId() {
        return procurementId;
    }

    public void setProcurementId(String procurementId) {
        this.procurementId = procurementId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }


    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }



    private LyhReportEntity lyhReportEntity;

    public LyhReportEntity getLyhReportEntity() {
        return lyhReportEntity;
    }

    public void setLyhReportEntity(LyhReportEntity lyhReportEntity) {
        this.lyhReportEntity = lyhReportEntity;
    }

        private LyhDrugEntity drugEntity;

    public LyhDrugEntity getDrugEntity() {
        return drugEntity;
    }

    public void setDrugEntity(LyhDrugEntity drugEntity) {
        this.drugEntity = drugEntity;
    }
}
