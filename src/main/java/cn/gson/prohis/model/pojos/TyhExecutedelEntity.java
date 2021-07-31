package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

public class TyhExecutedelEntity {
    private int executedelId;
    private String executeId;
    private Integer drugId;
    private String executedelExp;
    private Integer executedelNumber;
    private BigDecimal executedelPrice;

    public int getExecutedelId() {
        return executedelId;
    }

    public void setExecutedelId(int executedelId) {
        this.executedelId = executedelId;
    }

    public String getExecuteId() {
        return executeId;
    }

    public void setExecuteId(String executeId) {
        this.executeId = executeId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getExecutedelExp() {
        return executedelExp;
    }

    public void setExecutedelExp(String executedelExp) {
        this.executedelExp = executedelExp;
    }

    public Integer getExecutedelNumber() {
        return executedelNumber;
    }

    public void setExecutedelNumber(Integer executedelNumber) {
        this.executedelNumber = executedelNumber;
    }

    public BigDecimal getExecutedelPrice() {
        return executedelPrice;
    }

    public void setExecutedelPrice(BigDecimal executedelPrice) {
        this.executedelPrice = executedelPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TyhExecutedelEntity that = (TyhExecutedelEntity) o;
        return executedelId == that.executedelId &&
                Objects.equals(executeId, that.executeId) &&
                Objects.equals(drugId, that.drugId) &&
                Objects.equals(executedelExp, that.executedelExp) &&
                Objects.equals(executedelNumber, that.executedelNumber) &&
                Objects.equals(executedelPrice, that.executedelPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executedelId, executeId, drugId, executedelExp, executedelNumber, executedelPrice);
    }

    public TyhExecuteEntity tyhExecuteEntity;

    public TyhExecuteEntity getTyhExecuteEntity() {
        return tyhExecuteEntity;
    }

    public void setTyhExecuteEntity(TyhExecuteEntity tyhExecuteEntity) {
        this.tyhExecuteEntity = tyhExecuteEntity;
    }

    public LyhDrugEntity lyhDrugEntity;

    public LyhDrugEntity getLyhDrugEntity() {
        return lyhDrugEntity;
    }

    public void setLyhDrugEntity(LyhDrugEntity lyhDrugEntity) {
        this.lyhDrugEntity = lyhDrugEntity;
    }
}
