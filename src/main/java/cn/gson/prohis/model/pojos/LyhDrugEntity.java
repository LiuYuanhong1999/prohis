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
    private Integer drugState;
    private String drugJixin;
    private String drugGuige;
    private Integer drugJia;


    public Integer getDrugJia() {
        return drugJia;
    }

    public void setDrugJia(Integer drugJia) {
        this.drugJia = drugJia;
    }

    public Integer getDrugState() {
        return drugState;
    }

    public void setDrugState(Integer drugState) {
        this.drugState = drugState;
    }

    public String getDrugJixin() {
        return drugJixin;
    }

    public void setDrugJixin(String drugJixin) {
        this.drugJixin = drugJixin;
    }

    public String getDrugGuige() {
        return drugGuige;
    }

    public void setDrugGuige(String drugGuige) {
        this.drugGuige = drugGuige;
    }

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


    private List<LyhProcurementDetailsEntity> lyhProcurementDetailsEntities;

    public List<LyhProcurementDetailsEntity> getLyhProcurementDetailsEntities() {
        return lyhProcurementDetailsEntities;
    }

    public void setLyhProcurementDetailsEntities(List<LyhProcurementDetailsEntity> lyhProcurementDetailsEntities) {
        this.lyhProcurementDetailsEntities = lyhProcurementDetailsEntities;
    }

    private List<LyhDrugStoreDetailsEntity> list;

    public List<LyhDrugStoreDetailsEntity> getList() {
        return list;
    }

    public void setList(List<LyhDrugStoreDetailsEntity> list) {
        this.list = list;
    }

//    private List<DrugStoreVo> list;
//
//    public List<DrugStoreVo> getList() {
//        return list;
//    }
//
//    public void setList(List<DrugStoreVo> list) {
//        this.list = list;
//    }



    private List<LyhPharmacyEntity> lyhPharmacyEntities;

    public List<LyhPharmacyEntity> getLyhPharmacyEntities() {
        return lyhPharmacyEntities;
    }

    public void setLyhPharmacyEntities(List<LyhPharmacyEntity> lyhPharmacyEntities) {
        this.lyhPharmacyEntities = lyhPharmacyEntities;
    }



    public List<TyhRecipeEntity> tyhRecipeEntity;

    public List<TyhRecipeEntity> getTyhRecipeEntity() {
        return tyhRecipeEntity;
    }

    public void setTyhRecipeEntity(List<TyhRecipeEntity> tyhRecipeEntity) {
        this.tyhRecipeEntity = tyhRecipeEntity;
    }


    private List<LyhCheckDetailsEntity> lyhCheckDetailsEntities;

    public List<LyhCheckDetailsEntity> getLyhCheckDetailsEntities() {
        return lyhCheckDetailsEntities;
    }

    public void setLyhCheckDetailsEntities(List<LyhCheckDetailsEntity> lyhCheckDetailsEntities) {
        this.lyhCheckDetailsEntities = lyhCheckDetailsEntities;
    }
}
