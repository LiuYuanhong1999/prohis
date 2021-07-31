package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

public class TyhRecipeEntity {
    private String recipeId;
    private Double recipePrice;
    private Timestamp recipeDate;
    private Integer recipeDay;
    private Integer patientId;
    private Integer staffId;
    private String recipeExplain;
    private Integer recipeZt;

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public Double getRecipePrice() {
        return recipePrice;
    }

    public void setRecipePrice(Double recipePrice) {
        this.recipePrice = recipePrice;
    }

    public Timestamp getRecipeDate() {
        return recipeDate;
    }

    public void setRecipeDate(Timestamp recipeDate) {
        this.recipeDate = recipeDate;
    }

    public Integer getRecipeDay() {
        return recipeDay;
    }

    public void setRecipeDay(Integer recipeDay) {
        this.recipeDay = recipeDay;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getRecipeExplain() {
        return recipeExplain;
    }

    public void setRecipeExplain(String recipeExplain) {
        this.recipeExplain = recipeExplain;
    }

    public Integer getRecipeZt() {
        return recipeZt;
    }

    public void setRecipeZt(Integer recipeZt) {
        this.recipeZt = recipeZt;
    }

    public List<TyhRecipedetailEntity> tyhRecipedetailEntities;

    public List<TyhRecipedetailEntity> getTyhRecipedetailEntities() {
        return tyhRecipedetailEntities;
    }

    public void setTyhRecipedetailEntities(List<TyhRecipedetailEntity> tyhRecipedetailEntities) {
        this.tyhRecipedetailEntities = tyhRecipedetailEntities;
    }

    public TyhPatientEntity tyhPatientEntity;

    public TyhPatientEntity getTyhPatientEntity() {
        return tyhPatientEntity;
    }

    public void setTyhPatientEntity(TyhPatientEntity tyhPatientEntity) {
        this.tyhPatientEntity = tyhPatientEntity;
    }

    public YxjStaffEntity yxjStaffEntity;

    public YxjStaffEntity getYxjStaffEntity() {
        return yxjStaffEntity;
    }

    public void setYxjStaffEntity(YxjStaffEntity yxjStaffEntity) {
        this.yxjStaffEntity = yxjStaffEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TyhRecipeEntity that = (TyhRecipeEntity) o;
        return Objects.equals(recipeId, that.recipeId) &&
                Objects.equals(recipePrice, that.recipePrice) &&
                Objects.equals(recipeDate, that.recipeDate) &&
                Objects.equals(recipeDay, that.recipeDay) &&
                Objects.equals(patientId, that.patientId) &&
                Objects.equals(staffId, that.staffId) &&
                Objects.equals(recipeExplain, that.recipeExplain) &&
                Objects.equals(recipeZt, that.recipeZt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeId, recipePrice, recipeDate, recipeDay, patientId, staffId, recipeExplain, recipeZt);
    }

    @Override
    public String toString() {
        return "TyhRecipeEntity{" +
                "recipeId='" + recipeId + '\'' +
                ", recipePrice=" + recipePrice +
                ", recipeDate=" + recipeDate +
                ", recipeDay=" + recipeDay +
                ", patientId=" + patientId +
                ", staffId=" + staffId +
                ", recipeExplain='" + recipeExplain + '\'' +
                ", recipeZt=" + recipeZt +
                ", tyhRecipedetailEntities=" + tyhRecipedetailEntities +
                ", tyhPatientEntity=" + tyhPatientEntity +
                ", yxjStaffEntity=" + yxjStaffEntity +
                '}';
    }

    public TyhExecuteEntity tyhExecuteEntity;

    public TyhExecuteEntity getTyhExecuteEntity() {
        return tyhExecuteEntity;
    }

    public void setTyhExecuteEntity(TyhExecuteEntity tyhExecuteEntity) {
        this.tyhExecuteEntity = tyhExecuteEntity;
    }
}
