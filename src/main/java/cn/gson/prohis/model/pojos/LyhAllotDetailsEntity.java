package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;


public class LyhAllotDetailsEntity {
    private int allotdetailsId;
    private String allotId;
    private Timestamp allotdetailsDate;
    private Integer pharmacyId;
    private String allotdetailsName;
    private int numbers;


    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public int getAllotdetailsId() {
        return allotdetailsId;
    }

    public void setAllotdetailsId(int allotdetailsId) {
        this.allotdetailsId = allotdetailsId;
    }


    public String getAllotId() {
        return allotId;
    }

    public void setAllotId(String allotId) {
        this.allotId = allotId;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Timestamp getAllotdetailsDate() {
        return allotdetailsDate;
    }

    public void setAllotdetailsDate(Timestamp allotdetailsDate) {
        this.allotdetailsDate = allotdetailsDate;
    }


    public Integer getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(Integer pharmacyId) {
        this.pharmacyId = pharmacyId;
    }


    public String getAllotdetailsName() {
        return allotdetailsName;
    }

    public void setAllotdetailsName(String allotdetailsName) {
        this.allotdetailsName = allotdetailsName;
    }



        private LyhAllotEntity allotEntity;
    public LyhAllotEntity getAllotEntity() {
        return allotEntity;
    }

    public void setAllotEntity(LyhAllotEntity allotEntity) {
        this.allotEntity = allotEntity;
    }



    private LyhPharmacyEntity lyhPharmacyEntity;

    public LyhPharmacyEntity getLyhPharmacyEntity() {
        return lyhPharmacyEntity;
    }

    public void setLyhPharmacyEntity(LyhPharmacyEntity lyhPharmacyEntity) {
        this.lyhPharmacyEntity = lyhPharmacyEntity;
    }
}
