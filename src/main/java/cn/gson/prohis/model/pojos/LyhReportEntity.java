package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;


public class LyhReportEntity {
    private int reportId;
    private String procurementId;
    private String reportReason;
    private Timestamp reportTime;
    private String reportName;
    private Integer reportState;


    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }


    public String getProcurementId() {
        return procurementId;
    }

    public void setProcurementId(String procurementId) {
        this.procurementId = procurementId;
    }


    public String getReportReason() {
        return reportReason;
    }

    public void setReportReason(String reportReason) {
        this.reportReason = reportReason;
    }


    public Timestamp getReportTime() {
        return reportTime;
    }

    public void setReportTime(Timestamp reportTime) {
        this.reportTime = reportTime;
    }


    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }


    public Integer getReportState() {
        return reportState;
    }

    public void setReportState(Integer reportState) {
        this.reportState = reportState;
    }


    private List<LyhReportDetailsEntity> reportDetailsEntities;

    public List<LyhReportDetailsEntity> getReportDetailsEntities() {
        return reportDetailsEntities;
    }

    public void setReportDetailsEntities(List<LyhReportDetailsEntity> reportDetailsEntities) {
        this.reportDetailsEntities = reportDetailsEntities;
    }


    private LyhProcurementEntity lyhProcurementEntity;


    public LyhProcurementEntity getLyhProcurementEntity() {
        return lyhProcurementEntity;
    }

    public void setLyhProcurementEntity(LyhProcurementEntity lyhProcurementEntity) {
        this.lyhProcurementEntity = lyhProcurementEntity;
    }

    private LyhAuditEntity auditEntity;

    public LyhAuditEntity getAuditEntity() {
        return auditEntity;
    }

    public void setAuditEntity(LyhAuditEntity auditEntity) {
        this.auditEntity = auditEntity;
    }
}
