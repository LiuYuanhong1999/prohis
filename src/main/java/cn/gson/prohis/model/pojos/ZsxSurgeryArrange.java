package cn.gson.prohis.model.pojos;

import java.sql.Timestamp;

public class ZsxSurgeryArrange {
    private int surgeryArrangeId;
    private Timestamp surgeryArrangeTime;
    private String surgeryArrangeNumber;
    private String surgeryArrangeName;
    private String surgeryForNumber;
    private String surgeryArrangeDoctor;
    private Integer operatingRoomId;
    private String surgeryArrangeNurse;
    private int surgeryArrangeStaff;
    private String surgeryArrangeType;

    private ZsxSurgeryFor surgeryFor;
    private ZsxOperatingRoom operatingRoom;

    public ZsxSurgeryFor getSurgeryFor() {
        return surgeryFor;
    }

    public void setSurgeryFor(ZsxSurgeryFor surgeryFor) {
        this.surgeryFor = surgeryFor;
    }

    public ZsxOperatingRoom getOperatingRoom() {
        return operatingRoom;
    }

    public void setOperatingRoom(ZsxOperatingRoom operatingRoom) {
        this.operatingRoom = operatingRoom;
    }

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

    public String getSurgeryArrangeNumber() {
        return surgeryArrangeNumber;
    }

    public void setSurgeryArrangeNumber(String surgeryArrangeNumber) {
        this.surgeryArrangeNumber = surgeryArrangeNumber;
    }

    public String getSurgeryArrangeName() {
        return surgeryArrangeName;
    }

    public void setSurgeryArrangeName(String surgeryArrangeName) {
        this.surgeryArrangeName = surgeryArrangeName;
    }

    public String getSurgeryForNumber() {
        return surgeryForNumber;
    }

    public void setSurgeryForNumber(String surgeryForNumber) {
        this.surgeryForNumber = surgeryForNumber;
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

    public int getSurgeryArrangeStaff() {
        return surgeryArrangeStaff;
    }

    public void setSurgeryArrangeStaff(int surgeryArrangeStaff) {
        this.surgeryArrangeStaff = surgeryArrangeStaff;
    }

    public String getSurgeryArrangeType() {
        return surgeryArrangeType;
    }

    public void setSurgeryArrangeType(String surgeryArrangeType) {
        this.surgeryArrangeType = surgeryArrangeType;
    }
}
