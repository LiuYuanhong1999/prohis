package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Objects;

public class TyhInpatientEntity {
    private int inpId;
    private String inpName;
    private Integer deskId;
    private Integer inpYu;
    private Integer inpNumber;

    public Integer getInpYu() {
        return inpYu;
    }

    public void setInpYu(Integer inpYu) {
        this.inpYu = inpYu;
    }

    public Integer getInpNumber() {
        return inpNumber;
    }

    public void setInpNumber(Integer inpNumber) {
        this.inpNumber = inpNumber;
    }

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

    public YxjDesk yxjDesks;

    public YxjDesk getYxjDesks() {
        return yxjDesks;
    }

    public void setYxjDesks(YxjDesk yxjDesks) {
        this.yxjDesks = yxjDesks;
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
