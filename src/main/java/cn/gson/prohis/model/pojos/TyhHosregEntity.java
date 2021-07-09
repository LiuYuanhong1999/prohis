package cn.gson.prohis.model.pojos;

import java.sql.Timestamp;
import java.util.List;

public class TyhHosregEntity {
    private String hosregNum;
    
    private Timestamp hosregDate;
    private String hosnotNum;
    private Integer userId;
    private Integer patientId;
    private Integer hospitalId;

    public String getHosregNum() {
        return hosregNum;
    }

    public void setHosregNum(String hosregNum) {
        this.hosregNum = hosregNum;
    }

    public Timestamp getHosregDate() {
        return hosregDate;
    }

    public void setHosregDate(Timestamp hosregDate) {
        this.hosregDate = hosregDate;
    }

    public String getHosnotNum() {
        return hosnotNum;
    }

    public void setHosnotNum(String hosnotNum) {
        this.hosnotNum = hosnotNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public List<TyhCashEntity> cashEntities;

    public List<TyhCashEntity> getCashEntities() {
        return cashEntities;
    }

    public void setCashEntities(List<TyhCashEntity> cashEntities) {
        this.cashEntities = cashEntities;
    }

    public TyhPatientEntity tyhPatientEntity;

    public TyhPatientEntity getTyhPatientEntity() {
        return tyhPatientEntity;
    }

    public void setTyhPatientEntity(TyhPatientEntity tyhPatientEntity) {
        this.tyhPatientEntity = tyhPatientEntity;
    }
}
