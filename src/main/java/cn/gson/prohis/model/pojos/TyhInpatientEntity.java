package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

public class TyhInpatientEntity {
    private int inpId;
    private String inpName;
    private Integer deskId;

    public int getInpId() {
        return inpId;
    }

    public void setInpId(int inpId) {
        this.inpId = inpId;
    }

    public String getInpName() {
        return inpName;
    }

    public void setInpName(String inpName) {
        this.inpName = inpName;
    }

    public Integer getDeskId() {
        return deskId;
    }

    public void setDeskId(Integer deskId) {
        this.deskId = deskId;
    }

    public List<TyhHospitalEntity> tyhHospitalEntities;

    public List<TyhHospitalEntity> getTyhHospitalEntities() {
        return tyhHospitalEntities;
    }

    public void setTyhHospitalEntities(List<TyhHospitalEntity> tyhHospitalEntities) {
        this.tyhHospitalEntities = tyhHospitalEntities;
    }

    @Override
    public String toString() {
        return "TyhInpatientEntity{" +
                "inpId=" + inpId +
                ", inpName='" + inpName + '\'' +
                ", deskId=" + deskId +
                '}';
    }
}
