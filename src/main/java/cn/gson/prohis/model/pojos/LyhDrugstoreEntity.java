package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;


public class LyhDrugstoreEntity {
    private int drugstoreId;
    private Integer drugId;
    private Integer drugstoreNumber;
    private Timestamp drugstoreDate;
    private String procurementId;
    private Integer auditId;
private String piCi;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getDrugstoreId() {
        return drugstoreId;
    }

    public void setDrugstoreId(int drugstoreId) {
        this.drugstoreId = drugstoreId;
    }


    public String getPiCi() {
        return piCi;
    }

    public void setPiCi(String piCi) {
        this.piCi = piCi;
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


    public String getProcurementId() {
        return procurementId;
    }

    public void setProcurementId(String procurementId) {
        this.procurementId = procurementId;
    }

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }




    private LyhDrugEntity lyhDrugEntity;


    public LyhDrugEntity getLyhDrugEntity() {
        return lyhDrugEntity;
    }

    public void setLyhDrugEntity(LyhDrugEntity lyhDrugEntity) {
        this.lyhDrugEntity = lyhDrugEntity;
    }


    private LyhProcurementEntity lyhProcurementEntity;

    public LyhProcurementEntity getLyhProcurementEntity() {
        return lyhProcurementEntity;
    }

    public void setLyhProcurementEntity(LyhProcurementEntity lyhProcurementEntity) {
        this.lyhProcurementEntity = lyhProcurementEntity;
    }

    private LyhAuditEntity lyhAuditEntity;

    public LyhAuditEntity getLyhAuditEntity() {
        return lyhAuditEntity;
    }

    public void setLyhAuditEntity(LyhAuditEntity lyhAuditEntity) {
        this.lyhAuditEntity = lyhAuditEntity;
    }


    private List<LyhPharmacyEntity> lyhPharmacyEntities;

    public List<LyhPharmacyEntity> getLyhPharmacyEntities() {
        return lyhPharmacyEntities;
    }

    public void setLyhPharmacyEntities(List<LyhPharmacyEntity> lyhPharmacyEntities) {
        this.lyhPharmacyEntities = lyhPharmacyEntities;
    }
}
