package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.util.Objects;

public class TyhHospitalEntity {
    private int hospitalId;
    private Integer inpId;
    private String hospitalName;
    private Double hospitalPrice;
    private Integer hospitalZt;

    public Integer getHospitalZt() {
        return hospitalZt;
    }

    public void setHospitalZt(Integer hospitalZt) {
        this.hospitalZt = hospitalZt;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Integer getInpId() {
        return inpId;
    }

    public void setInpId(Integer inpId) {
        this.inpId = inpId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Double getHospitalPrice() {
        return hospitalPrice;
    }

    public void setHospitalPrice(Double hospitalPrice) {
        this.hospitalPrice = hospitalPrice;
    }

    public TyhInpatientEntity tyhInpatientEntity;

    public TyhInpatientEntity getTyhInpatientEntity() {
        return tyhInpatientEntity;
    }

    public void setTyhInpatientEntity(TyhInpatientEntity tyhInpatientEntity) {
        this.tyhInpatientEntity = tyhInpatientEntity;
    }

    public TyhHosnotEntity tyhHosnotEntity;

    public TyhHosnotEntity getTyhHosnotEntity() {
        return tyhHosnotEntity;
    }

    public void setTyhHosnotEntity(TyhHosnotEntity tyhHosnotEntity) {
        this.tyhHosnotEntity = tyhHosnotEntity;
    }

    @Override
    public String toString() {
        return "TyhHospitalEntity{" +
                "hospitalId=" + hospitalId +
                ", inpId=" + inpId +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalPrice=" + hospitalPrice +
                ", hospitalZt=" + hospitalZt +
                ", tyhInpatientEntity=" + tyhInpatientEntity +
                ", tyhHosnotEntity=" + tyhHosnotEntity +
                '}';
    }
}
