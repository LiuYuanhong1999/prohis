package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;


public class LyhPharmacyEntity {
    private int pharmacyId;
    private String pharmacyName;
    private String pharmacyState;
    private String pharmacySpecifications;
    private String pharmacyDosage;
    private Timestamp pharmacyDate;
    private String pharmacyManufacturer;
    private Integer pharmacyNumber;
    private BigDecimal pharmacyPrice;


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }


    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }


    public String getPharmacyState() {
        return pharmacyState;
    }

    public void setPharmacyState(String pharmacyState) {
        this.pharmacyState = pharmacyState;
    }


    public String getPharmacySpecifications() {
        return pharmacySpecifications;
    }

    public void setPharmacySpecifications(String pharmacySpecifications) {
        this.pharmacySpecifications = pharmacySpecifications;
    }


    public String getPharmacyDosage() {
        return pharmacyDosage;
    }

    public void setPharmacyDosage(String pharmacyDosage) {
        this.pharmacyDosage = pharmacyDosage;
    }


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Timestamp getPharmacyDate() {
        return pharmacyDate;
    }

    public void setPharmacyDate(Timestamp pharmacyDate) {
        this.pharmacyDate = pharmacyDate;
    }


    public String getPharmacyManufacturer() {
        return pharmacyManufacturer;
    }

    public void setPharmacyManufacturer(String pharmacyManufacturer) {
        this.pharmacyManufacturer = pharmacyManufacturer;
    }


    public Integer getPharmacyNumber() {
        return pharmacyNumber;
    }

    public void setPharmacyNumber(Integer pharmacyNumber) {
        this.pharmacyNumber = pharmacyNumber;
    }


    public BigDecimal getPharmacyPrice() {
        return pharmacyPrice;
    }

    public void setPharmacyPrice(BigDecimal pharmacyPrice) {
        this.pharmacyPrice = pharmacyPrice;
    }


}
