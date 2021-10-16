package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.sql.Timestamp;

public class ZsxOperation {
    private int operationId;
    private Timestamp operationTime;
    private Timestamp operationEndTime;
    private String operationName;
    private Integer surgeryArrangeId;
    private String operationDoctor;
    private String operationAnestheaia;
    private String operationNurse;

//    连接手术安排表
    private ZsxSurgeryArrange surgeryArrange;

    public ZsxSurgeryArrange getSurgeryArrange() {
        return surgeryArrange;
    }

    public void setSurgeryArrange(ZsxSurgeryArrange surgeryArrange) {
        this.surgeryArrange = surgeryArrange;
    }

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

    public Timestamp getOperationEndTime() {
        return operationEndTime;
    }

    public void setOperationEndTime(Timestamp operationEndTime) {
        this.operationEndTime = operationEndTime;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Integer getSurgeryArrangeId() {
        return surgeryArrangeId;
    }

    public void setSurgeryArrangeId(Integer surgeryArrangeId) {
        this.surgeryArrangeId = surgeryArrangeId;
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
