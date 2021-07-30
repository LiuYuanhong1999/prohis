package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


public class LyhSupplierEntity {
    private Integer supplierId;
    private String supplierName;
    private Integer supplierState;
    private String supplierUser;
    private String supplierPhone;
    private String supplierAdress;


    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierAdress() {
        return supplierAdress;
    }

    public void setSupplierAdress(String supplierAdress) {
        this.supplierAdress = supplierAdress;
    }

    public String getSupplierUser() {
        return supplierUser;
    }

    public void setSupplierUser(String supplierUser) {
        this.supplierUser = supplierUser;
    }

    public Integer getSupplierState() {
        return supplierState;
    }

    public void setSupplierState(Integer supplierState) {
        this.supplierState = supplierState;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }


    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    private List<LyhDrugEntity> lyhDrugEntities;


    public List<LyhDrugEntity> getLyhDrugEntities() {
        return lyhDrugEntities;
    }

    public void setLyhDrugEntities(List<LyhDrugEntity> lyhDrugEntities) {
        this.lyhDrugEntities = lyhDrugEntities;
    }
}
