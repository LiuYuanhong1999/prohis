package cn.gson.prohis.model.pojos;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

public class LyhProcurementDetailsEntity {
    private int proId;
    private Integer drugId;
    private Integer numbers;
    private Integer procurementId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }


    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }


    public Integer getProcurementId() {
        return procurementId;
    }

    public void setProcurementId(Integer procurementId) {
        this.procurementId = procurementId;
    }



    private List<LyhProcurementEntity> lyhProcurementEntities;


    public List<LyhProcurementEntity> getLyhProcurementEntities() {
        return lyhProcurementEntities;
    }

    public void setLyhProcurementEntities(List<LyhProcurementEntity> lyhProcurementEntities) {
        this.lyhProcurementEntities = lyhProcurementEntities;
    }
}
