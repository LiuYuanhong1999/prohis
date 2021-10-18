package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;


public class LyhAllotEntity {
    private String allotId;
    private int allotState;
    private Integer pharmacyId;
    private Integer allotNumber;
    private Integer drugId;
    private Timestamp allotTime;
    private Timestamp allotNowtime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Timestamp getAllotNowtime() {
        return allotNowtime;
    }

    public void setAllotNowtime(Timestamp allotNowtime) {
        this.allotNowtime = allotNowtime;
    }

    public String getAllotId() {
        return allotId;
    }

    public void setAllotId(String allotId) {
        this.allotId = allotId;
    }

    public int getAllotState() {
        return allotState;
    }

    public void setAllotState(int allotState) {
        this.allotState = allotState;
    }

    public Integer getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(Integer pharmacyId) {
        this.pharmacyId = pharmacyId;
    }


    public Integer getAllotNumber() {
        return allotNumber;
    }

    public void setAllotNumber(Integer allotNumber) {
        this.allotNumber = allotNumber;
    }


    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Timestamp getAllotTime() {
        return allotTime;
    }

    public void setAllotTime(Timestamp allotTime) {
        this.allotTime = allotTime;
    }



    private LyhPharmacyEntity pharmacyEntity;

    public LyhPharmacyEntity getPharmacyEntity() {
        return pharmacyEntity;
    }

    public void setPharmacyEntity(LyhPharmacyEntity pharmacyEntity) {
        this.pharmacyEntity = pharmacyEntity;
    }


   private List<LyhPharmacyDetailsEntity> lyhPharmacyDetailsEntities;

    public List<LyhPharmacyDetailsEntity> getLyhPharmacyDetailsEntities() {
        return lyhPharmacyDetailsEntities;
    }

    public void setLyhPharmacyDetailsEntities(List<LyhPharmacyDetailsEntity> lyhPharmacyDetailsEntities) {
        this.lyhPharmacyDetailsEntities = lyhPharmacyDetailsEntities;
    }

    private List<LyhAllotDetailsEntity> lyhAllotDetailsEntities;

    public List<LyhAllotDetailsEntity> getLyhAllotDetailsEntities() {
        return lyhAllotDetailsEntities;
    }

    public void setLyhAllotDetailsEntities(List<LyhAllotDetailsEntity> lyhAllotDetailsEntities) {
        this.lyhAllotDetailsEntities = lyhAllotDetailsEntities;
    }


    public List<LyhRecordsEntity> recordsEntities;

    public List<LyhRecordsEntity> getRecordsEntities() {
        return recordsEntities;
    }

    public void setRecordsEntities(List<LyhRecordsEntity> recordsEntities) {
        this.recordsEntities = recordsEntities;
    }
}
