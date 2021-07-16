package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

public class TyhChunotEntity {
    private String chunotNum;
    private Timestamp chunotDate;
    private Integer chunotType;
    private String hosregNum;
    private Integer patientId;
    private String chunotYizhu;
    private Double chunotPrice;

    public String getChunotNum() {
        return chunotNum;
    }

    public void setChunotNum(String chunotNum) {
        this.chunotNum = chunotNum;
    }

    public Timestamp getChunotDate() {
        return chunotDate;
    }

    public void setChunotDate(Timestamp chunotDate) {
        this.chunotDate = chunotDate;
    }

    public Integer getChunotType() {
        return chunotType;
    }

    public void setChunotType(Integer chunotType) {
        this.chunotType = chunotType;
    }

    public String getHosregNum() {
        return hosregNum;
    }

    public void setHosregNum(String hosregNum) {
        this.hosregNum = hosregNum;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getChunotYizhu() {
        return chunotYizhu;
    }

    public void setChunotYizhu(String chunotYizhu) {
        this.chunotYizhu = chunotYizhu;
    }

    public Double getChunotPrice() {
        return chunotPrice;
    }

    public void setChunotPrice(Double chunotPrice) {
        this.chunotPrice = chunotPrice;
    }

    public TyhHosregEntity tyhHosregEntity;

    public TyhHosregEntity getTyhHosregEntity() {
        return tyhHosregEntity;
    }

    public void setTyhHosregEntity(TyhHosregEntity tyhHosregEntity) {
        this.tyhHosregEntity = tyhHosregEntity;
    }

    public TyhPatientEntity tyhPatientEntity;

    public TyhPatientEntity getTyhPatientEntity() {
        return tyhPatientEntity;
    }

    public void setTyhPatientEntity(TyhPatientEntity tyhPatientEntity) {
        this.tyhPatientEntity = tyhPatientEntity;
    }
}
