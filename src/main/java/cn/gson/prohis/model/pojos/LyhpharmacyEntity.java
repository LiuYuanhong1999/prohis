package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "lyhpharmacy", schema = "myhis", catalog = "")
public class LyhpharmacyEntity {
    private int pharmacyId;
    private String pharmacyName;
    private String pharmacyState;
    private String pharmacySpecifications;
    private String pharmacyDosage;
    private Timestamp pharmacyDate;
    private String pharmacyManufacturer;
    private Integer pharmacyNumber;
    private BigDecimal pharmacyPrice;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pharmacy_id")
    public int getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    @Basic
    @Column(name = "pharmacy_name")
    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    @Basic
    @Column(name = "pharmacy_state")
    public String getPharmacyState() {
        return pharmacyState;
    }

    public void setPharmacyState(String pharmacyState) {
        this.pharmacyState = pharmacyState;
    }

    @Basic
    @Column(name = "pharmacy_specifications")
    public String getPharmacySpecifications() {
        return pharmacySpecifications;
    }

    public void setPharmacySpecifications(String pharmacySpecifications) {
        this.pharmacySpecifications = pharmacySpecifications;
    }

    @Basic
    @Column(name = "pharmacy_Dosage")
    public String getPharmacyDosage() {
        return pharmacyDosage;
    }

    public void setPharmacyDosage(String pharmacyDosage) {
        this.pharmacyDosage = pharmacyDosage;
    }

    @Basic
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Column(name = "pharmacy_date")
    public Timestamp getPharmacyDate() {
        return pharmacyDate;
    }

    public void setPharmacyDate(Timestamp pharmacyDate) {
        this.pharmacyDate = pharmacyDate;
    }

    @Basic
    @Column(name = "pharmacy_manufacturer")
    public String getPharmacyManufacturer() {
        return pharmacyManufacturer;
    }

    public void setPharmacyManufacturer(String pharmacyManufacturer) {
        this.pharmacyManufacturer = pharmacyManufacturer;
    }

    @Basic
    @Column(name = "pharmacy_number")
    public Integer getPharmacyNumber() {
        return pharmacyNumber;
    }

    public void setPharmacyNumber(Integer pharmacyNumber) {
        this.pharmacyNumber = pharmacyNumber;
    }

    @Basic
    @Column(name = "pharmacy_price")
    public BigDecimal getPharmacyPrice() {
        return pharmacyPrice;
    }

    public void setPharmacyPrice(BigDecimal pharmacyPrice) {
        this.pharmacyPrice = pharmacyPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LyhpharmacyEntity that = (LyhpharmacyEntity) o;
        return pharmacyId == that.pharmacyId && Objects.equals(pharmacyName, that.pharmacyName) && Objects.equals(pharmacyState, that.pharmacyState) && Objects.equals(pharmacySpecifications, that.pharmacySpecifications) && Objects.equals(pharmacyDosage, that.pharmacyDosage) && Objects.equals(pharmacyDate, that.pharmacyDate) && Objects.equals(pharmacyManufacturer, that.pharmacyManufacturer) && Objects.equals(pharmacyNumber, that.pharmacyNumber) && Objects.equals(pharmacyPrice, that.pharmacyPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pharmacyId, pharmacyName, pharmacyState, pharmacySpecifications, pharmacyDosage, pharmacyDate, pharmacyManufacturer, pharmacyNumber, pharmacyPrice);
    }
}
