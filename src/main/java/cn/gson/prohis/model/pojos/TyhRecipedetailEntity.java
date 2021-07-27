package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.util.Objects;

public class TyhRecipedetailEntity {
    private int recipedetailId;
    private Integer recipeId;
    private Integer recipedetailProject;
    private Integer recipedetailDurg;
    private Integer recipedetailPrice;
    private Integer recipedetailNumber;
    private String recipedetailExplain;

    public int getRecipedetailId() {
        return recipedetailId;
    }

    public void setRecipedetailId(int recipedetailId) {
        this.recipedetailId = recipedetailId;
    }

    public Integer getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    public Integer getRecipedetailProject() {
        return recipedetailProject;
    }

    public void setRecipedetailProject(Integer recipedetailProject) {
        this.recipedetailProject = recipedetailProject;
    }

    public Integer getRecipedetailDurg() {
        return recipedetailDurg;
    }

    public void setRecipedetailDurg(Integer recipedetailDurg) {
        this.recipedetailDurg = recipedetailDurg;
    }

    public Integer getRecipedetailPrice() {
        return recipedetailPrice;
    }

    public void setRecipedetailPrice(Integer recipedetailPrice) {
        this.recipedetailPrice = recipedetailPrice;
    }

    public Integer getRecipedetailNumber() {
        return recipedetailNumber;
    }

    public void setRecipedetailNumber(Integer recipedetailNumber) {
        this.recipedetailNumber = recipedetailNumber;
    }

    public String getRecipedetailExplain() {
        return recipedetailExplain;
    }

    public void setRecipedetailExplain(String recipedetailExplain) {
        this.recipedetailExplain = recipedetailExplain;
    }

    public TyhRecipeEntity tyhRecipeEntity;

    public TyhRecipeEntity getTyhRecipeEntity() {
        return tyhRecipeEntity;
    }

    public void setTyhRecipeEntity(TyhRecipeEntity tyhRecipeEntity) {
        this.tyhRecipeEntity = tyhRecipeEntity;
    }

    public LyhDrugEntity lyhDrugEntity;

    public LyhDrugEntity getLyhDrugEntity() {
        return lyhDrugEntity;
    }

    public void setLyhDrugEntity(LyhDrugEntity lyhDrugEntity) {
        this.lyhDrugEntity = lyhDrugEntity;
    }

    public YxjProjectEntity yxjProjectEntity;

    public YxjProjectEntity getYxjProjectEntity() {
        return yxjProjectEntity;
    }

    public void setYxjProjectEntity(YxjProjectEntity yxjProjectEntity) {
        this.yxjProjectEntity = yxjProjectEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TyhRecipedetailEntity that = (TyhRecipedetailEntity) o;
        return recipedetailId == that.recipedetailId &&
                Objects.equals(recipeId, that.recipeId) &&
                Objects.equals(recipedetailProject, that.recipedetailProject) &&
                Objects.equals(recipedetailDurg, that.recipedetailDurg) &&
                Objects.equals(recipedetailPrice, that.recipedetailPrice) &&
                Objects.equals(recipedetailNumber, that.recipedetailNumber) &&
                Objects.equals(recipedetailExplain, that.recipedetailExplain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipedetailId, recipeId, recipedetailProject, recipedetailDurg, recipedetailPrice, recipedetailNumber, recipedetailExplain);
    }
}
