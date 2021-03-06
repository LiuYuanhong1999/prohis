package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.sql.Date;
import java.util.List;
import java.util.Objects;


public class LyhDrugEntity {
    private int drugId;
    private String drugName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date drugDate;

    private BigDecimal drugPrice;
    private Integer supplierId;
    private Integer drugState;
    private String drugJixin;
    private String drugGuige;

    @Override
    public String toString() {
        return "LyhDrugEntity{" +
                "drugId=" + drugId +
                ", drugName='" + drugName + '\'' +
                ", drugDate=" + drugDate +
                ", drugPrice=" + drugPrice +
                ", supplierId=" + supplierId +
                ", drugState=" + drugState +
                ", drugJixin='" + drugJixin + '\'' +
                ", drugGuige='" + drugGuige + '\'' +
                ", drugJia=" + drugJia +
                ", tyhJiex=" + tyhJiex +
                ", lyhDrugstoreEntities=" + lyhDrugstoreEntities +
                ", lyhProcurementEntities=" + lyhProcurementEntities +
                ", lyhSupplierEntity=" + lyhSupplierEntity +
                ", lyhProcurementDetailsEntities=" + lyhProcurementDetailsEntities +
                ", list=" + list +
                ", lyhPharmacyEntity=" + lyhPharmacyEntity +
                ", lyhPharmacyEntities=" + lyhPharmacyEntities +
                ", tyhRecipedetailEntities=" + tyhRecipedetailEntities +
                ", tyhExecutedelEntities=" + tyhExecutedelEntities +
                ", list2=" + list2 +
                ", allotRecordEntity=" + allotRecordEntity +
                ", lyhPharmacyRecords=" + lyhPharmacyRecords +
                ", drugRecords=" + drugRecords +
                '}';
    }

    private Integer drugJia;


    public Integer getDrugJia() {
        return drugJia;
    }

    public void setDrugJia(Integer drugJia) {
        this.drugJia = drugJia;
    }

    private TyhJiex tyhJiex;

    public TyhJiex getTyhJiex() {
        return tyhJiex;
    }

    public void setTyhJiex(TyhJiex tyhJiex) {
        this.tyhJiex = tyhJiex;
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


    public Date getDrugDate() {
        return drugDate;
    }

    public void setDrugDate(Date drugDate) {
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

    private LyhPharmacyEntity lyhPharmacyEntity;

    public LyhPharmacyEntity getLyhPharmacyEntity() {
        return lyhPharmacyEntity;
    }

    public void setLyhPharmacyEntity(LyhPharmacyEntity lyhPharmacyEntity) {
        this.lyhPharmacyEntity = lyhPharmacyEntity;
    }

    private List<LyhPharmacyEntity> lyhPharmacyEntities;

    public List<LyhPharmacyEntity> getLyhPharmacyEntities() {
        return lyhPharmacyEntities;
    }

    public void setLyhPharmacyEntities(List<LyhPharmacyEntity> lyhPharmacyEntities) {
        this.lyhPharmacyEntities = lyhPharmacyEntities;
    }

    public List<TyhRecipedetailEntity> tyhRecipedetailEntities;

    public List<TyhRecipedetailEntity> getTyhRecipedetailEntities() {
        return tyhRecipedetailEntities;
    }

    public void setTyhRecipedetailEntities(List<TyhRecipedetailEntity> tyhRecipedetailEntities) {
        this.tyhRecipedetailEntities = tyhRecipedetailEntities;
    }

    public List<TyhExecutedelEntity> tyhExecutedelEntities;

    public List<TyhExecutedelEntity> getTyhExecutedelEntities() {
        return tyhExecutedelEntities;
    }

    public void setTyhExecutedelEntities(List<TyhExecutedelEntity> tyhExecutedelEntities) {
        this.tyhExecutedelEntities = tyhExecutedelEntities;
    }



    private List<LyhReportDetailsEntity> list2;

    public List<LyhReportDetailsEntity> getList2() {
        return list2;
    }

    public void setList2(List<LyhReportDetailsEntity> list2) {
        this.list2 = list2;
    }



    public LyhAllotRecordEntity allotRecordEntity;


    public LyhAllotRecordEntity getAllotRecordEntity() {
        return allotRecordEntity;
    }

    public void setAllotRecordEntity(LyhAllotRecordEntity allotRecordEntity) {
        this.allotRecordEntity = allotRecordEntity;
    }



    private List<LyhPharmacyRecord> lyhPharmacyRecords;

    public List<LyhPharmacyRecord> getLyhPharmacyRecords() {
        return lyhPharmacyRecords;
    }

    public void setLyhPharmacyRecords(List<LyhPharmacyRecord> lyhPharmacyRecords) {
        this.lyhPharmacyRecords = lyhPharmacyRecords;
    }

    private List<LyhDrugRecord> drugRecords;

    public List<LyhDrugRecord> getDrugRecords() {
        return drugRecords;
    }

    public void setDrugRecords(List<LyhDrugRecord> drugRecords) {
        this.drugRecords = drugRecords;
    }

    private drug drug;

    public cn.gson.prohis.model.pojos.drug getDrug() {
        return drug;
    }

    public void setDrug(cn.gson.prohis.model.pojos.drug drug) {
        this.drug = drug;
    }
}
