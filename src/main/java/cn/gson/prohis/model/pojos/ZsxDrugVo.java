package cn.gson.prohis.model.pojos;

public class ZsxDrugVo {
    public Integer drugId;
    public Integer numbers;
    public Double drugPrice;
    public String prescriptionDetailsAttention;
    public Double projectPrice;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public Double getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(Double drugPrice) {
        this.drugPrice = drugPrice;
    }

    public String getPrescriptionDetailsAttention() {
        return prescriptionDetailsAttention;
    }

    public void setPrescriptionDetailsAttention(String prescriptionDetailsAttention) {
        this.prescriptionDetailsAttention = prescriptionDetailsAttention;
    }

    public Double getProjectPrice() {
        return projectPrice;
    }

    public void setProjectPrice(Double projectPrice) {
        this.projectPrice = projectPrice;
    }

    @Override
    public String toString() {
        return "ZsxDrugVo{" +
                "drugId=" + drugId +
                ", numbers=" + numbers +
                ", drugPrice=" + drugPrice +
                ", prescriptionDetailsAttention='" + prescriptionDetailsAttention + '\'' +
                ", projectPrice=" + projectPrice +
                '}';
    }
}
