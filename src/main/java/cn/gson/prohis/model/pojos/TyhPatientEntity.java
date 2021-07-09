package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.util.Objects;

public class TyhPatientEntity {
    private int patientId;
    private String patientName;
    private String patientSex;
    private Double patientYue;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

    public Double getPatientYue() {
        return patientYue;
    }

    public void setPatientYue(Double patientYue) {
        this.patientYue = patientYue;
    }

    public TyhHosregEntity tyhHosregEntity;

    public TyhHosregEntity getTyhHosregEntity() {
        return tyhHosregEntity;
    }

    public void setTyhHosregEntity(TyhHosregEntity tyhHosregEntity) {
        this.tyhHosregEntity = tyhHosregEntity;
    }
}
