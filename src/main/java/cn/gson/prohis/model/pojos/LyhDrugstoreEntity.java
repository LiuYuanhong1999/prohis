package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class LyhDrugstoreEntity {
    private int drugstoreId;
    private Integer drugId;
    private Integer drugstoreNumber;
    private Timestamp drugstoreDate;
    private Integer procurementId;
    private Integer auditId;


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getDrugstoreId() {
        return drugstoreId;
    }

    public void setDrugstoreId(int drugstoreId) {
        this.drugstoreId = drugstoreId;
    }


    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }


    public Integer getDrugstoreNumber() {
        return drugstoreNumber;
    }

    public void setDrugstoreNumber(Integer drugstoreNumber) {
        this.drugstoreNumber = drugstoreNumber;
    }


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Timestamp getDrugstoreDate() {
        return drugstoreDate;
    }

    public void setDrugstoreDate(Timestamp drugstoreDate) {
        this.drugstoreDate = drugstoreDate;
    }


    public Integer getProcurementId() {
        return procurementId;
    }

    public void setProcurementId(Integer procurementId) {
        this.procurementId = procurementId;
    }


    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }


}
