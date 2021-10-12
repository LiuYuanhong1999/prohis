package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

public class ZsxSurgeryArrange {
    private int surgeryArrangeId;
    private Timestamp surgeryArrangeTime;
    private String surgeryArrangeName;
    private Integer patientDataId;
    private String surgeryArrangeDoctor;
    private Integer operatingRoomId;
    private String surgeryArrangeNurse;

    public int getSurgeryArrangeId() {
        return surgeryArrangeId;
    }

    public void setSurgeryArrangeId(int surgeryArrangeId) {
        this.surgeryArrangeId = surgeryArrangeId;
    }

    public Timestamp getSurgeryArrangeTime() {
        return surgeryArrangeTime;
    }

    public void setSurgeryArrangeTime(Timestamp surgeryArrangeTime) {
        this.surgeryArrangeTime = surgeryArrangeTime;
    }

    public String getSurgeryArrangeName() {
        return surgeryArrangeName;
    }

    public void setSurgeryArrangeName(String surgeryArrangeName) {
        this.surgeryArrangeName = surgeryArrangeName;
    }

    public Integer getPatientDataId() {
        return patientDataId;
    }

    public void setPatientDataId(Integer patientDataId) {
        this.patientDataId = patientDataId;
    }

    public String getSurgeryArrangeDoctor() {
        return surgeryArrangeDoctor;
    }

    public void setSurgeryArrangeDoctor(String surgeryArrangeDoctor) {
        this.surgeryArrangeDoctor = surgeryArrangeDoctor;
    }

    public Integer getOperatingRoomId() {
        return operatingRoomId;
    }

    public void setOperatingRoomId(Integer operatingRoomId) {
        this.operatingRoomId = operatingRoomId;
    }

    public String getSurgeryArrangeNurse() {
        return surgeryArrangeNurse;
    }

    public void setSurgeryArrangeNurse(String surgeryArrangeNurse) {
        this.surgeryArrangeNurse = surgeryArrangeNurse;
    }

}
