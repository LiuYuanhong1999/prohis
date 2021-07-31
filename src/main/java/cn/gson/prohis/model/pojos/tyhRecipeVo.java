package cn.gson.prohis.model.pojos;

import java.sql.Timestamp;
import java.util.List;

public class tyhRecipeVo {
    private String recipeId;
    private String executeId;

    public String getExecuteId() {
        return executeId;
    }

    public void setExecuteId(String executeId) {
        this.executeId = executeId;
    }

    private Double recipePrice;
    private Timestamp recipeDate;
    private Integer recipeDay;
    private Integer patientId;
    private Integer staffId;
    private String recipeExplain;
    private Integer recipeZt;


    public List<tyhDrugVo> durg;
    public List<tyhProjectVo> project;

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public Double getRecipePrice() {
        return recipePrice;
    }

    public void setRecipePrice(Double recipePrice) {
        this.recipePrice = recipePrice;
    }

    public Timestamp getRecipeDate() {
        return recipeDate;
    }

    public void setRecipeDate(Timestamp recipeDate) {
        this.recipeDate = recipeDate;
    }

    public Integer getRecipeDay() {
        return recipeDay;
    }

    public void setRecipeDay(Integer recipeDay) {
        this.recipeDay = recipeDay;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getRecipeExplain() {
        return recipeExplain;
    }

    public void setRecipeExplain(String recipeExplain) {
        this.recipeExplain = recipeExplain;
    }

    public Integer getRecipeZt() {
        return recipeZt;
    }

    public void setRecipeZt(Integer recipeZt) {
        this.recipeZt = recipeZt;
    }

    @Override
    public String toString() {
        return "tyhRecipeVo{" +
                "recipeId='" + recipeId + '\'' +
                ", recipePrice=" + recipePrice +
                ", recipeDate=" + recipeDate +
                ", recipeDay=" + recipeDay +
                ", patientId=" + patientId +
                ", staffId=" + staffId +
                ", recipeExplain='" + recipeExplain + '\'' +
                ", recipeZt=" + recipeZt +
                ", durg=" + durg +
                ", project=" + project +
                '}';
    }

    public List<tyhDrugVo> getDurg() {
        return durg;
    }

    public void setDurg(List<tyhDrugVo> durg) {
        this.durg = durg;
    }

    public List<tyhProjectVo> getProject() {
        return project;
    }

    public void setProject(List<tyhProjectVo> project) {
        this.project = project;
    }
}
