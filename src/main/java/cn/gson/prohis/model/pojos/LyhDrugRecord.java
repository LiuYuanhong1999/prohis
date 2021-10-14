package cn.gson.prohis.model.pojos;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;



public class LyhDrugRecord {
    private int recodeId;
    private Integer drugId;
    private Integer piCi;
    private Timestamp recodeDate;
    private Integer numbers;
    private String procurementId;

    public String getProcurementId() {
        return procurementId;
    }

    public void setProcurementId(String procurementId) {
        this.procurementId = procurementId;
    }

    public int getRecodeId() {
        return recodeId;
    }

    public void setRecodeId(int recodeId) {
        this.recodeId = recodeId;
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

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Timestamp getRecodeDate() {
        return recodeDate;
    }

    public void setRecodeDate(Timestamp recodeDate) {
        this.recodeDate = recodeDate;
    }


    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }



    private LyhDrugEntity drugEntity;

    public LyhDrugEntity getDrugEntity() {
        return drugEntity;
    }

    public void setDrugEntity(LyhDrugEntity drugEntity) {
        this.drugEntity = drugEntity;
    }
}
