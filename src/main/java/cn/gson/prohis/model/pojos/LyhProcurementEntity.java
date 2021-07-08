package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class LyhProcurementEntity {
    private int procurementId;
    private Integer drugId;
    private Integer procurementPrice;
    private String procurementState;
    private String userName;
    private String procurementName;
    private Timestamp procurementDate;
    private Timestamp procurementFirstdate;


    public int getProcurementId() {
        return procurementId;
    }

    public void setProcurementId(int procurementId) {
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


}
