package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;


public class LyhPharmacyEntity {
    private int pharmacyId;
    private Integer drugId;
    private Timestamp pharmacyDate;
    private Integer pharmacyNumber;


    public int getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }


    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Timestamp getPharmacyDate() {
        return pharmacyDate;
    }

    public void setPharmacyDate(Timestamp pharmacyDate) {
        this.pharmacyDate = pharmacyDate;
    }


    public Integer getPharmacyNumber() {
        return pharmacyNumber;
    }

    public void setPharmacyNumber(Integer pharmacyNumber) {
        this.pharmacyNumber = pharmacyNumber;
    }

private LyhDrugEntity lyhDrugEntity;

    public LyhDrugEntity getLyhDrugEntity() {
        return lyhDrugEntity;
    }

    public void setLyhDrugEntity(LyhDrugEntity lyhDrugEntity) {
        this.lyhDrugEntity = lyhDrugEntity;
    }


  private List<LyhPharmacyDetailsEntity> lyhPharmacyDetailsEntities;

    public List<LyhPharmacyDetailsEntity> getLyhPharmacyDetailsEntities() {
        return lyhPharmacyDetailsEntities;
    }

    public void setLyhPharmacyDetailsEntities(List<LyhPharmacyDetailsEntity> lyhPharmacyDetailsEntities) {
        this.lyhPharmacyDetailsEntities = lyhPharmacyDetailsEntities;
    }



    private List<LyhAllotEntity> lyhAllotEntities;

    public List<LyhAllotEntity> getLyhAllotEntities() {
        return lyhAllotEntities;
    }

    public void setLyhAllotEntities(List<LyhAllotEntity> lyhAllotEntities) {
        this.lyhAllotEntities = lyhAllotEntities;
    }



    private List<LyhAllotDetailsEntity> lyhAllotDetailsEntities;

    public List<LyhAllotDetailsEntity> getLyhAllotDetailsEntities() {
        return lyhAllotDetailsEntities;
    }

    public void setLyhAllotDetailsEntities(List<LyhAllotDetailsEntity> lyhAllotDetailsEntities) {
        this.lyhAllotDetailsEntities = lyhAllotDetailsEntities;
    }

    @Override
    public String toString() {
        return "LyhPharmacyEntity{" +
                "pharmacyId=" + pharmacyId +
                ", drugId=" + drugId +
                ", pharmacyDate=" + pharmacyDate +
                ", pharmacyNumber=" + pharmacyNumber +
                ", lyhDrugEntity=" + lyhDrugEntity +
                ", lyhPharmacyDetailsEntities=" + lyhPharmacyDetailsEntities +
                ", lyhAllotEntities=" + lyhAllotEntities +
                '}';
    }
}
