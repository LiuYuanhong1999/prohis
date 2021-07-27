package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

public class YxjProjectEntity {
    private int projectId;
    private String projectName;
    private Integer projectType;
    private Double projectPrice;

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public Double getProjectPrice() {
        return projectPrice;
    }

    public void setProjectPrice(Double projectPrice) {
        this.projectPrice = projectPrice;
    }

    public List<TyhRecipedetailEntity> tyhRecipedetailEntities;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YxjProjectEntity that = (YxjProjectEntity) o;
        return projectId == that.projectId &&
                Objects.equals(projectName, that.projectName) &&
                Objects.equals(projectType, that.projectType) &&
                Objects.equals(projectPrice, that.projectPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, projectName, projectType, projectPrice);
    }
}
