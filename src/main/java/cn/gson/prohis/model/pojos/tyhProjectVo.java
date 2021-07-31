package cn.gson.prohis.model.pojos;

public class tyhProjectVo {
    public Integer projectId;
    public Double projectPrice;
    public String recipedetailExplain;

    @Override
    public String toString() {
        return "tyhProjectVo{" +
                "projectId=" + projectId +
                ", projectPrice=" + projectPrice +
                ", recipedetailExplain='" + recipedetailExplain + '\'' +
                '}';
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Double getProjectPrice() {
        return projectPrice;
    }

    public void setProjectPrice(Double projectPrice) {
        this.projectPrice = projectPrice;
    }

    public String getRecipedetailExplain() {
        return recipedetailExplain;
    }

    public void setRecipedetailExplain(String recipedetailExplain) {
        this.recipedetailExplain = recipedetailExplain;
    }
}
