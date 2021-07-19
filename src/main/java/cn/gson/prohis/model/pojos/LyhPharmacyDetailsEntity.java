package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class LyhPharmacyDetailsEntity {
    private int detailsId;
    private Timestamp detailsDate;
    private Integer drugId;
    private Integer pharmacyId;
    private Integer numbers;

    public int getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(int detailsId) {
        this.detailsId = detailsId;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Timestamp getDetailsDate() {
        return detailsDate;
    }

    public void setDetailsDate(Timestamp detailsDate) {
        this.detailsDate = detailsDate;
    }


    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(Integer pharmacyId) {
        this.pharmacyId = pharmacyId;
    }


    private LyhPharmacyEntity lyhPharmacyEntity;

    public LyhPharmacyEntity getLyhPharmacyEntity() {
        return lyhPharmacyEntity;
    }

    public void setLyhPharmacyEntity(LyhPharmacyEntity lyhPharmacyEntity) {
        this.lyhPharmacyEntity = lyhPharmacyEntity;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }
}
