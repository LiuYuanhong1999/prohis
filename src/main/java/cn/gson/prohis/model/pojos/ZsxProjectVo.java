package cn.gson.prohis.model.pojos;

public class ZsxProjectVo {
    public Integer projectId;
    public Double projectPrice;
    public String presciptionDatailsExplain;

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

    public String getPresciptionDatailsExplain() {
        return presciptionDatailsExplain;
    }

    public void setPresciptionDatailsExplain(String presciptionDatailsExplain) {
        this.presciptionDatailsExplain = presciptionDatailsExplain;
    }

    @Override
    public String toString() {
        return "ZsxProjectVo{" +
                "projectId=" + projectId +
                ", projectPrice=" + projectPrice +
                ", presciptionDatailsExplain='" + presciptionDatailsExplain + '\'' +
                '}';
    }
}
