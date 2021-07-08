package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;


public class LyhDrugEntity {
    private int drugId;
    private String drugName;
    private Timestamp drugDate;
    private BigDecimal drugPrice;
    private Integer supplierId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }


    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Timestamp getDrugDate() {
        return drugDate;
    }

    public void setDrugDate(Timestamp drugDate) {
        this.drugDate = drugDate;
    }


    public BigDecimal getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(BigDecimal drugPrice) {
        this.drugPrice = drugPrice;
    }


    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }


    private List<LyhDrugstoreEntity> lyhDrugstoreEntities;


    public List<LyhDrugstoreEntity> getLyhDrugstoreEntities() {
        return lyhDrugstoreEntities;
    }

    public void setLyhDrugstoreEntities(List<LyhDrugstoreEntity> lyhDrugstoreEntities) {
        this.lyhDrugstoreEntities = lyhDrugstoreEntities;
    }


    private List<LyhProcurementEntity> lyhProcurementEntities;

    public List<LyhProcurementEntity> getLyhProcurementEntities() {
        return lyhProcurementEntities;
    }

    public void setLyhProcurementEntities(List<LyhProcurementEntity> lyhProcurementEntities) {
        this.lyhProcurementEntities = lyhProcurementEntities;
    }


    private LyhSupplierEntity lyhSupplierEntity;

    public LyhSupplierEntity getLyhSupplierEntity() {
        return lyhSupplierEntity;
    }

    public void setLyhSupplierEntity(LyhSupplierEntity lyhSupplierEntity) {
        this.lyhSupplierEntity = lyhSupplierEntity;
    }
}