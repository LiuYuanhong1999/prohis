package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

public class TyhPatientEntity {

    private int patientId;
    private String patientName;
    private String patientSex;
    private Double patientYue;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

    public Double getPatientYue() {
        return patientYue;
    }

    public void setPatientYue(Double patientYue) {
        this.patientYue = patientYue;
    }

    public TyhHosregEntity getTyhHosregEntity() {
        return tyhHosregEntity;
    }

    public void setTyhHosregEntity(TyhHosregEntity tyhHosregEntity) {
        this.tyhHosregEntity = tyhHosregEntity;
    }

    public TyhHosnotEntity tyhHosnotEntity;

    public TyhHosnotEntity getTyhHosnotEntity() {
        return tyhHosnotEntity;
    }

    public void setTyhHosnotEntity(TyhHosnotEntity tyhHosnotEntity) {
        this.tyhHosnotEntity = tyhHosnotEntity;
    }

    public List<TyhRecipeEntity> tyhRecipeEntities;

    public List<TyhRecipeEntity> getTyhRecipeEntities() {
        return tyhRecipeEntities;
    }

    public void setTyhRecipeEntities(List<TyhRecipeEntity> tyhRecipeEntities) {
        this.tyhRecipeEntities = tyhRecipeEntities;
    }

    @Override
    public String toString() {
        return "TyhPatientEntity{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", patientSex='" + patientSex + '\'' +
                ", patientYue=" + patientYue +
                ", tyhHosregEntity=" + tyhHosregEntity +
                '}';
    }

    public TyhChunotEntity tyhChunotEntity;

    public TyhChunotEntity getTyhChunotEntity() {
        return tyhChunotEntity;
    }

    public void setTyhChunotEntity(TyhChunotEntity tyhChunotEntity) {
        this.tyhChunotEntity = tyhChunotEntity;
    }

    public TyhHosregEntity tyhHosregEntity;

    public List<TyhExecuteEntity> tyhExecuteEntities;

    public List<TyhExecuteEntity> getTyhExecuteEntities() {
        return tyhExecuteEntities;
    }

    public void setTyhExecuteEntities(List<TyhExecuteEntity> tyhExecuteEntities) {
        this.tyhExecuteEntities = tyhExecuteEntities;
    }


    public List<LyhRecipeEntity> recipeEntities;

    public List<LyhRecipeEntity> getRecipeEntities() {
        return recipeEntities;
    }

    public void setRecipeEntities(List<LyhRecipeEntity> recipeEntities) {
        this.recipeEntities = recipeEntities;
    }
}
