package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Timestamp;
import java.util.List;

public class TyhHosregEntity {
    private String hosregNum;
    
    private Timestamp hosregDate;
    private String hosnotNum;
    private Integer userId;
    private Integer patientId;
    private Integer hosregZt;

    public Integer getHosregZt() {
        return hosregZt;
    }

    public void setHosregZt(Integer hosregZt) {
        this.hosregZt = hosregZt;
    }

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

    public TyhHosnotEntity tyhHosnotEntity;

    public TyhHosnotEntity getTyhHosnotEntity() {
        return tyhHosnotEntity;
    }

    public void setTyhHosnotEntity(TyhHosnotEntity tyhHosnotEntity) {
        this.tyhHosnotEntity = tyhHosnotEntity;
    }

    public TyhChunotEntity tyhChunotEntity;

    public TyhChunotEntity getTyhChunotEntity() {
        return tyhChunotEntity;
    }

    public void setTyhChunotEntity(TyhChunotEntity tyhChunotEntity) {
        this.tyhChunotEntity = tyhChunotEntity;
    }

    @Override
    public String toString() {
        return "TyhHosregEntity{" +
                "hosregNum='" + hosregNum + '\'' +
                ", hosregDate=" + hosregDate +
                ", hosnotNum='" + hosnotNum + '\'' +
                ", userId=" + userId +
                ", patientId=" + patientId +
                ", cashEntities=" + cashEntities +
                ", tyhPatientEntity=" + tyhPatientEntity +
                '}';
    }
}
