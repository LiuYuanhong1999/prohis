package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


public class LyhSupplierEntity {
    private int supplierId;
    private String supplierName;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
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
