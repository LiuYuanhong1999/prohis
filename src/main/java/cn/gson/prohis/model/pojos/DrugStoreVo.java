package cn.gson.prohis.model.pojos;

public class DrugStoreVo {

    private String procurementId;
    private int numbers;
    private int drugId;


    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public String getProcurementId() {
        return procurementId;
    }

    public void setProcurementId(String procurementId) {
        this.procurementId = procurementId;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }


//    private LyhDrugEntity lyhDrugEntity;
//
//    public LyhDrugEntity getLyhDrugEntity() {
//        return lyhDrugEntity;
//    }
//
//    public void setLyhDrugEntity(LyhDrugEntity lyhDrugEntity) {
//        this.lyhDrugEntity = lyhDrugEntity;
//    }


//    @Override
//    public String toString() {
//        return "DrugStoreVo{" +
//                "procurementId='" + procurementId + '\'' +
//                ", numbers=" + numbers +
//                ", lyhDrugEntity=" + lyhDrugEntity +
//                '}';
//    }
}
