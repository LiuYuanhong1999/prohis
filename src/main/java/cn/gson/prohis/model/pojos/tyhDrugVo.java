package cn.gson.prohis.model.pojos;

public class tyhDrugVo {
    public Integer drugId;
    public Integer numbers;
    public Double drugPrice;
    public String recipedetailExplain;

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

    public String getRecipedetailExplain() {
        return recipedetailExplain;
    }

    public void setRecipedetailExplain(String recipedetailExplain) {
        this.recipedetailExplain = recipedetailExplain;
    }

    @Override
    public String toString() {
        return "tyhDrugVo{" +
                "drugId=" + drugId +
                ", numbers=" + numbers +
                ", drugPrice=" + drugPrice +
                ", recipedetailExplain='" + recipedetailExplain + '\'' +
                '}';
    }
}
