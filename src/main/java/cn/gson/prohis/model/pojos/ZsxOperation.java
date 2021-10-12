package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

public class ZsxOperation {
    private int operationId;
    private Timestamp operationTime;
    private String operationName;
    private Integer patientDataId;
    private String operationDoctor;
    private String operationAnestheaia;
    private String operationNurse;

    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    public Timestamp getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Timestamp operationTime) {
        this.operationTime = operationTime;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Integer getPatientDataId() {
        return patientDataId;
    }

    public void setPatientDataId(Integer patientDataId) {
        this.patientDataId = patientDataId;
    }

    public String getOperationDoctor() {
        return operationDoctor;
    }

    public void setOperationDoctor(String operationDoctor) {
        this.operationDoctor = operationDoctor;
    }

    public String getOperationAnestheaia() {
        return operationAnestheaia;
    }

    public void setOperationAnestheaia(String operationAnestheaia) {
        this.operationAnestheaia = operationAnestheaia;
    }

    public String getOperationNurse() {
        return operationNurse;
    }

    public void setOperationNurse(String operationNurse) {
        this.operationNurse = operationNurse;
    }

}
