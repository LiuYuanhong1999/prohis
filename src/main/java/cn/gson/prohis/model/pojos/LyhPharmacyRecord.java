package cn.gson.prohis.model.pojos;

import java.sql.Timestamp;



public class LyhPharmacyRecord {
    private int recordId;
    private Integer drugId;
    private Integer piCi;
    private Integer numbers;
    private Timestamp recordDate;


    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }


    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }


    public Integer getPiCi() {
        return piCi;
    }

    public void setPiCi(Integer piCi) {
        this.piCi = piCi;
    }


    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public Timestamp getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Timestamp recordDate) {
        this.recordDate = recordDate;
    }

}
