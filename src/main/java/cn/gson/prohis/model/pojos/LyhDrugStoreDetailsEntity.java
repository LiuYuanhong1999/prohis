package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class LyhDrugStoreDetailsEntity {
    private int detailsId;
    private String procurementId;
    private String detailsName;
    private Timestamp detailsDate;
    private int drugId;
    private int numbers;
private String piCi;

    public String getPiCi() {
        return piCi;
    }

    public void setPiCi(String piCi) {
        this.piCi = piCi;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }



    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public int getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(int detailsId) {
        this.detailsId = detailsId;
    }


    public String getProcurementId() {
        return procurementId;
    }

    public void setProcurementId(String procurementId) {
        this.procurementId = procurementId;
    }


    public String getDetailsName() {
        return detailsName;
    }

    public void setDetailsName(String detailsName) {
        this.detailsName = detailsName;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Timestamp getDetailsDate() {
        return detailsDate;
    }

    public void setDetailsDate(Timestamp detailsDate) {
        this.detailsDate = detailsDate;
    }



private LyhProcurementDetailsEntity lyhProcurementDetailsEntity;

    public LyhProcurementDetailsEntity getLyhProcurementDetailsEntity() {
        return lyhProcurementDetailsEntity;
    }

    public void setLyhProcurementDetailsEntity(LyhProcurementDetailsEntity lyhProcurementDetailsEntity) {
        this.lyhProcurementDetailsEntity = lyhProcurementDetailsEntity;
    }



    private LyhDrugEntity lyhDrugEntity;

    public LyhDrugEntity getLyhDrugEntity() {
        return lyhDrugEntity;
    }

    public void setLyhDrugEntity(LyhDrugEntity lyhDrugEntity) {
        this.lyhDrugEntity = lyhDrugEntity;
    }


    public LyhDrugstoreEntity lyhDrugstoreEntity;

    public LyhDrugstoreEntity getLyhDrugstoreEntity() {
        return lyhDrugstoreEntity;
    }

    public void setLyhDrugstoreEntity(LyhDrugstoreEntity lyhDrugstoreEntity) {
        this.lyhDrugstoreEntity = lyhDrugstoreEntity;
    }
}
