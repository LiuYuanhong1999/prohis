package cn.gson.prohis.model.pojos;

public class ZsxProjectVo {
    public Integer projectId;
    public Double projectPrice;
    public String prescriptionDetailsAttention;

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

    public String getPrescriptionDetailsAttention() {
        return prescriptionDetailsAttention;
    }

    public void setPrescriptionDetailsAttention(String prescriptionDetailsAttention) {
        this.prescriptionDetailsAttention = prescriptionDetailsAttention;
    }

    @Override
    public String toString() {
        return "ZsxProjectVo{" +
                "projectId=" + projectId +
                ", projectPrice=" + projectPrice +
                ", prescriptionDetailsAttention='" + prescriptionDetailsAttention + '\'' +
                '}';
    }
}
