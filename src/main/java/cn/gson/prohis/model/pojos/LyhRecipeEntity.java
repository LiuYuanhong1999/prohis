package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;


public class LyhRecipeEntity {
    private int recipesId;
    private String executeId;
    private Integer recipesState;
    private Timestamp recipesDate;
    private String recipesName;
    private int patientId;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getRecipesId() {
        return recipesId;
    }

    public void setRecipesId(int recipesId) {
        this.recipesId = recipesId;
    }


    public String getExecuteId() {
        return executeId;
    }

    public void setExecuteId(String executeId) {
        this.executeId = executeId;
    }


    public Integer getRecipesState() {
        return recipesState;
    }

    public void setRecipesState(Integer recipesState) {
        this.recipesState = recipesState;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Timestamp getRecipesDate() {
        return recipesDate;
    }

    public void setRecipesDate(Timestamp recipesDate) {
        this.recipesDate = recipesDate;
    }


    public String getRecipesName() {
        return recipesName;
    }

    public void setRecipesName(String recipesName) {
        this.recipesName = recipesName;
    }



   public List<TyhExecutedelEntity> executedelEntity;

    public List<TyhExecutedelEntity> getExecutedelEntity() {
        return executedelEntity;
    }

    public void setExecutedelEntity(List<TyhExecutedelEntity> executedelEntity) {
        this.executedelEntity = executedelEntity;
    }


    public TyhPatientEntity patientEntity;

    public TyhPatientEntity getPatientEntity() {
        return patientEntity;
    }

    public void setPatientEntity(TyhPatientEntity patientEntity) {
        this.patientEntity = patientEntity;
    }
}
