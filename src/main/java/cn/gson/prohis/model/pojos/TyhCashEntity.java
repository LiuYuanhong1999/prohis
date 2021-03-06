package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

public class TyhCashEntity {
    private String cashNum;
    private Timestamp cashDate;
    private String hosregNum;
    private Double cashPrice;
    private Integer patientId;

    @Override
    public String toString() {
        return "TyhCashEntity{" +
                "cashNum='" + cashNum + '\'' +
                ", cashDate=" + cashDate +
                ", hosregNum='" + hosregNum + '\'' +
                ", cashPrice=" + cashPrice +
                ", patientId=" + patientId +
                ", tyhHosregEntity=" + tyhHosregEntity +
                '}';
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getCashNum() {
        return cashNum;
    }

    public void setCashNum(String cashNum) {
        this.cashNum = cashNum;
    }

    public Timestamp getCashDate() {
        return cashDate;
    }

    public void setCashDate(Timestamp cashDate) {
        this.cashDate = cashDate;
    }

    public String getHosregNum() {
        return hosregNum;
    }

    public void setHosregNum(String hosregNum) {
        this.hosregNum = hosregNum;
    }

    public Double getCashPrice() {
        return cashPrice;
    }

    public void setCashPrice(Double cashPrice) {
        this.cashPrice = cashPrice;
    }

    public TyhHosregEntity tyhHosregEntity;

    public TyhHosregEntity getTyhHosregEntity() {
        return tyhHosregEntity;
    }

    public void setTyhHosregEntity(TyhHosregEntity tyhHosregEntity) {
        this.tyhHosregEntity = tyhHosregEntity;
    }

}
