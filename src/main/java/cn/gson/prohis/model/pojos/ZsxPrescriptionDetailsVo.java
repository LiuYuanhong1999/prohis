package cn.gson.prohis.model.pojos;

import java.util.List;

public class ZsxPrescriptionDetailsVo {
    private long prescriptionDetailsId;
    private long medicineNo;
    private Integer medicineCount;
    private Double medicineSubtotal;
    private String prescriptionDetailsAttention;
    private String prescriptionDetailsExplain;
    private String prescriptionId;

    public List<ZsxDrugVo> drug;
    public List<ZsxProjectVo> project;

    public long getPrescriptionDetailsId() {
        return prescriptionDetailsId;
    }

    public void setPrescriptionDetailsId(long prescriptionDetailsId) {
        this.prescriptionDetailsId = prescriptionDetailsId;
    }

    public long getMedicineNo() {
        return medicineNo;
    }

    public void setMedicineNo(long medicineNo) {
        this.medicineNo = medicineNo;
    }

    public Integer getMedicineCount() {
        return medicineCount;
    }

    public void setMedicineCount(Integer medicineCount) {
        this.medicineCount = medicineCount;
    }

    public Double getMedicineSubtotal() {
        return medicineSubtotal;
    }

    public void setMedicineSubtotal(Double medicineSubtotal) {
        this.medicineSubtotal = medicineSubtotal;
    }

    public String getPrescriptionDetailsAttention() {
        return prescriptionDetailsAttention;
    }

    public void setPrescriptionDetailsAttention(String prescriptionDetailsAttention) {
        this.prescriptionDetailsAttention = prescriptionDetailsAttention;
    }

    public String getPrescriptionDetailsExplain() {
        return prescriptionDetailsExplain;
    }

    public void setPrescriptionDetailsExplain(String prescriptionDetailsExplain) {
        this.prescriptionDetailsExplain = prescriptionDetailsExplain;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public List<ZsxDrugVo> getDrug() {
        return drug;
    }

    public void setDrug(List<ZsxDrugVo> drug) {
        this.drug = drug;
    }

    public List<ZsxProjectVo> getProject() {
        return project;
    }

    public void setProject(List<ZsxProjectVo> project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "ZsxPrescriptionDetailsVo{" +
                "prescriptionDetailsId=" + prescriptionDetailsId +
                ", medicineNo=" + medicineNo +
                ", medicineCount=" + medicineCount +
                ", medicineSubtotal=" + medicineSubtotal +
                ", prescriptionDetailsAttention='" + prescriptionDetailsAttention + '\'' +
                ", prescriptionDetailsExplain='" + prescriptionDetailsExplain + '\'' +
                ", prescriptionId='" + prescriptionId + '\'' +
                ", drug=" + drug +
                ", project=" + project +
                '}';
    }
}
