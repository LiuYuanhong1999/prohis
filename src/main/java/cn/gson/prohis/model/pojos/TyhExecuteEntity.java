package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

public class TyhExecuteEntity {
    private String executeId;
    private String recipeId;
    private String executeExp;
    private Integer executeDay;
    private Double executePrice;
    private Integer patientId;
    private Timestamp executeData;
    private Integer executeZt;

    public String getExecuteId() {
        return executeId;
    }

    public void setExecuteId(String executeId) {
        this.executeId = executeId;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getExecuteExp() {
        return executeExp;
    }

    public void setExecuteExp(String executeExp) {
        this.executeExp = executeExp;
    }

    public Integer getExecuteDay() {
        return executeDay;
    }

    public void setExecuteDay(Integer executeDay) {
        this.executeDay = executeDay;
    }

    public Double getExecutePrice() {
        return executePrice;
    }

    public void setExecutePrice(Double executePrice) {
        this.executePrice = executePrice;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Timestamp getExecuteData() {
        return executeData;
    }

    public void setExecuteData(Timestamp executeData) {
        this.executeData = executeData;
    }

    public Integer getExecuteZt() {
        return executeZt;
    }

    public void setExecuteZt(Integer executeZt) {
        this.executeZt = executeZt;
    }

    public List<TyhExecutedelEntity> tyhExecutedelEntities;

    public List<TyhExecutedelEntity> getTyhExecutedelEntities() {
        return tyhExecutedelEntities;
    }

    public void setTyhExecutedelEntities(List<TyhExecutedelEntity> tyhExecutedelEntities) {
        this.tyhExecutedelEntities = tyhExecutedelEntities;
    }

    public TyhRecipeEntity tyhRecipeEntity;

    public TyhRecipeEntity getTyhRecipeEntity() {
        return tyhRecipeEntity;
    }

    public void setTyhRecipeEntity(TyhRecipeEntity tyhRecipeEntity) {
        this.tyhRecipeEntity = tyhRecipeEntity;
    }

    public TyhPatientEntity tyhPatientEntity;

    public TyhPatientEntity getTyhPatientEntity() {
        return tyhPatientEntity;
    }

    public void setTyhPatientEntity(TyhPatientEntity tyhPatientEntity) {
        this.tyhPatientEntity = tyhPatientEntity;
    }




}
