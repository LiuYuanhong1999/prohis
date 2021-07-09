package cn.gson.prohis.model.pojos;

import antlr.collections.impl.LList;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;


public class LyhProcurementEntity {
    private String procurementId;
    private Integer drugId;
    private Integer procurementPrice;
    private String procurementState;
    private String userName;
    private String procurementName;
    private Timestamp procurementDate;
    private Timestamp procurementFirstdate;


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


    public Integer getProcurementPrice() {
        return procurementPrice;
    }

    public void setProcurementPrice(Integer procurementPrice) {
        this.procurementPrice = procurementPrice;
    }


    public String getProcurementState() {
        return procurementState;
    }

    public void setProcurementState(String procurementState) {
        this.procurementState = procurementState;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getProcurementName() {
        return procurementName;
    }

    public void setProcurementName(String procurementName) {
        this.procurementName = procurementName;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Timestamp getProcurementDate() {
        return procurementDate;
    }

    public void setProcurementDate(Timestamp procurementDate) {
        this.procurementDate = procurementDate;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Timestamp getProcurementFirstdate() {
        return procurementFirstdate;
    }

    public void setProcurementFirstdate(Timestamp procurementFirstdate) {
        this.procurementFirstdate = procurementFirstdate;
    }

private LyhDrugEntity lyhDrugEntity;

    public LyhDrugEntity getLyhDrugEntity() {
        return lyhDrugEntity;
    }

    public void setLyhDrugEntity(LyhDrugEntity lyhDrugEntity) {
        this.lyhDrugEntity = lyhDrugEntity;
    }

    private List<LyhAuditEntity> lyhAuditEntities;

    public List<LyhAuditEntity> getLyhAuditEntities() {
        return lyhAuditEntities;
    }

    public void setLyhAuditEntities(List<LyhAuditEntity> lyhAuditEntities) {
        this.lyhAuditEntities = lyhAuditEntities;
    }

    public List<LyhDrugstoreEntity> lyhDrugstoreEntities;

    public List<LyhDrugstoreEntity> getLyhDrugstoreEntities() {
        return lyhDrugstoreEntities;
    }

    public void setLyhDrugstoreEntities(List<LyhDrugstoreEntity> lyhDrugstoreEntities) {
        this.lyhDrugstoreEntities = lyhDrugstoreEntities;
    }



//  private LyhProcurementDetailsEntity lyhProcurementDetailsEntity;
//
//    public LyhProcurementDetailsEntity getLyhProcurementDetailsEntity() {
//        return lyhProcurementDetailsEntity;
//    }
//
//    public void setLyhProcurementDetailsEntity(LyhProcurementDetailsEntity lyhProcurementDetailsEntity) {
//        this.lyhProcurementDetailsEntity = lyhProcurementDetailsEntity;
//    }

    private List<LyhProcurementDetailsEntity> lyhProcurementDetailsEntities;

    public List<LyhProcurementDetailsEntity> getLyhProcurementDetailsEntities() {
        return lyhProcurementDetailsEntities;
    }

    public void setLyhProcurementDetailsEntities(List<LyhProcurementDetailsEntity> lyhProcurementDetailsEntities) {
        this.lyhProcurementDetailsEntities = lyhProcurementDetailsEntities;
    }

    @Override
    public String toString() {
        return "LyhProcurementEntity{" +
                "procurementId=" + procurementId +
                ", drugId=" + drugId +
                ", procurementPrice=" + procurementPrice +
                ", procurementState='" + procurementState + '\'' +
                ", userName='" + userName + '\'' +
                ", procurementName='" + procurementName + '\'' +
                ", procurementDate=" + procurementDate +
                ", procurementFirstdate=" + procurementFirstdate +
                ", lyhDrugEntity=" + lyhDrugEntity +
                ", lyhAuditEntities=" + lyhAuditEntities +
                ", lyhDrugstoreEntities=" + lyhDrugstoreEntities +
                ", lyhProcurementDetailsEntities=" + lyhProcurementDetailsEntities +
                '}';
    }
}
