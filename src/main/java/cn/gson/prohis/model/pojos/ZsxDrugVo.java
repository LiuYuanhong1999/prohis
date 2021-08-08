package cn.gson.prohis.model.pojos;

public class ZsxDrugVo {
    public Integer drugId;
    public Integer numbers;
    public Double drugPrice;
    public String presciptionDatailsExplain;

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

    public String getPresciptionDatailsExplain() {
        return presciptionDatailsExplain;
    }

    public void setPresciptionDatailsExplain(String presciptionDatailsExplain) {
        this.presciptionDatailsExplain = presciptionDatailsExplain;
    }

    @Override
    public String toString() {
        return "ZsxDrugVo{" +
                "drugId=" + drugId +
                ", numbers=" + numbers +
                ", drugPrice=" + drugPrice +
                ", presciptionDatailsExplain='" + presciptionDatailsExplain + '\'' +
                '}';
    }
}
