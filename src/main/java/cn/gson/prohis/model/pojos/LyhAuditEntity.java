package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;


public class LyhAuditEntity {
    private int auditId;
    private String prescriptionId;
    private Timestamp auditDate;
    private String auditUser;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getAuditId() {
        return auditId;
    }

    public void setAuditId(int auditId) {
        this.auditId = auditId;
    }


    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Timestamp getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Timestamp auditDate) {
        this.auditDate = auditDate;
    }


    public String getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser;
    }


    private List<LyhDrugstoreEntity> lyhDrugstoreEntities;

    public List<LyhDrugstoreEntity> getLyhDrugstoreEntities() {
        return lyhDrugstoreEntities;
    }

    public void setLyhDrugstoreEntities(List<LyhDrugstoreEntity> lyhDrugstoreEntities) {
        this.lyhDrugstoreEntities = lyhDrugstoreEntities;
    }

    public LyhProcurementEntity lyhProcurementEntity;

    public LyhProcurementEntity getLyhProcurementEntity() {
        return lyhProcurementEntity;
    }

    public void setLyhProcurementEntity(LyhProcurementEntity lyhProcurementEntity) {
        this.lyhProcurementEntity = lyhProcurementEntity;
    }
}