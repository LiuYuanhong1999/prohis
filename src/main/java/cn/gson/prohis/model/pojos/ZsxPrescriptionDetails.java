package cn.gson.prohis.model.pojos;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

public class ZsxPrescriptionDetails {

  private long prescriptionDetailsId;
  private long medicineNo;
  private Integer medicineCount;
  private Double medicineSubtotal;
  private String prescriptionDetailsAttention;
  private String prescriptionDetailsExplain;
  private String prescriptionId;

  private ZsxPrescription prescription;


  public ZsxPrescription getPrescription() {
    return prescription;
  }

  public void setPrescription(ZsxPrescription prescription) {
    this.prescription = prescription;
  }

  public String getPrescriptionId() {
    return prescriptionId;
  }

  public void setPrescriptionId(String prescriptionId) {
    this.prescriptionId = prescriptionId;
  }

  private List<YxjProjectEntity> project;

  public List<YxjProjectEntity> getProject() {
    return project;
  }

  public void setProject(List<YxjProjectEntity> project) {
    this.project = project;
  }

  private List<LyhDrugEntity> drugEntity;

  public List<LyhDrugEntity> getDrugEntity() {
    return drugEntity;
  }

  public void setDrugEntity(List<LyhDrugEntity> drugEntity) {
    this.drugEntity = drugEntity;
  }

  @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
