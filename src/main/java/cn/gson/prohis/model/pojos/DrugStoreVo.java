package cn.gson.prohis.model.pojos;

public class DrugStoreVo {

    private String procurementId;
    private int numbers;
    private int drugId;
    private String piCi;


    public String getPiCi() {
        return piCi;
    }

    public void setPiCi(String piCi) {
        this.piCi = piCi;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public String getProcurementId() {
        return procurementId;
    }

    public void setProcurementId(String procurementId) {
        this.procurementId = procurementId;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }


}
