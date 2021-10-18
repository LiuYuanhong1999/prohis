package cn.gson.prohis.model.pojos;

public class ZsxSurgeryFor {
    private int surgeryForId;
    private String surgeryForName;
    private Integer patientDataId;
    private String surgeryForDoctor;
    private String surgeryForNumber;
    private String surgeryForPrn;
    private String prescriptionId;
    private String recipeId;
    private int surgeryForStaff;
//    连接门诊处方表
    private ZsxPrescription prescription;
//    连接住院处方详表
    private TyhRecipedetailEntity recipe;

    public int getSurgeryForStaff() {
        return surgeryForStaff;
    }

    public void setSurgeryForStaff(int surgeryForStaff) {
        this.surgeryForStaff = surgeryForStaff;
    }

    public ZsxPrescription getPrescription() {
        return prescription;
    }

    public void setPrescription(ZsxPrescription prescription) {
        this.prescription = prescription;
    }

    public TyhRecipedetailEntity getRecipe() {
        return recipe;
    }

    public void setRecipe(TyhRecipedetailEntity recipe) {
        this.recipe = recipe;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public int getSurgeryForId() {
        return surgeryForId;
    }

    public void setSurgeryForId(int surgeryForId) {
        this.surgeryForId = surgeryForId;
    }

    public String getSurgeryForName() {
        return surgeryForName;
    }

    public void setSurgeryForName(String surgeryForName) {
        this.surgeryForName = surgeryForName;
    }

    public Integer getPatientDataId() {
        return patientDataId;
    }

    public void setPatientDataId(Integer patientDataId) {
        this.patientDataId = patientDataId;
    }

    public String getSurgeryForDoctor() {
        return surgeryForDoctor;
    }

    public void setSurgeryForDoctor(String surgeryForDoctor) {
        this.surgeryForDoctor = surgeryForDoctor;
    }

    public String getSurgeryForNumber() {
        return surgeryForNumber;
    }

    public void setSurgeryForNumber(String surgeryForNumber) {
        this.surgeryForNumber = surgeryForNumber;
    }

    public String getSurgeryForPrn() {
        return surgeryForPrn;
    }

    public void setSurgeryForPrn(String surgeryForPrn) {
        this.surgeryForPrn = surgeryForPrn;
    }

}
