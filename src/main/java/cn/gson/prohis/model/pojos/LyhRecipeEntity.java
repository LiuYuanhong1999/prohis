package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class LyhRecipeEntity {
    private int recipesId;
    private String executeId;
    private Integer recipesState;
    private Timestamp recipesDate;
    private String recipesName;


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



    private TyhExecuteEntity executeEntity;

    public TyhExecuteEntity getExecuteEntity() {
        return executeEntity;
    }

    public void setExecuteEntity(TyhExecuteEntity executeEntity) {
        this.executeEntity = executeEntity;
    }
}
