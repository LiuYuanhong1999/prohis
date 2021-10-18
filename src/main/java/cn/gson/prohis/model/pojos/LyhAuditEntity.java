package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;


public class LyhAuditEntity {
    private int auditId;
    private String procurementId;
    private Timestamp auditDate;
    private String auditUser;
    private Integer auditState;
    private Integer meiYon;
    private Integer supplierId;


    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getMeiYon() {
        return meiYon;
    }

    public void setMeiYon(Integer meiYon) {
        this.meiYon = meiYon;
    }

    public Integer getAuditState() {
        return auditState;
    }

    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getAuditId() {
        return auditId;
    }

    public void setAuditId(int auditId) {
        this.auditId = auditId;
    }


    public String getProcurementId() {
        return procurementId;
    }

    public void setProcurementId(String procurementId) {
        this.procurementId = procurementId;
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


    private List<LyhReportEntity> reportEntities;

    public List<LyhReportEntity> getReportEntities() {
        return reportEntities;
    }

    public void setReportEntities(List<LyhReportEntity> reportEntities) {
        this.reportEntities = reportEntities;
    }
}
