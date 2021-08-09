package cn.gson.prohis.model.pojos;

import java.sql.Timestamp;

public class ZsxRegistrationVo {
    private Integer registrationId;
    private String registrationNumber;
    private Integer patientDataId;
    private String room;
    private int doctot;
    private Timestamp registrationTime;
    private Double registrationFee;
    private Integer registrationState;
    private String registrationType;
    private String registrationName;

    public Integer getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Integer registrationId) {
        this.registrationId = registrationId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Integer getPatientDataId() {
        return patientDataId;
    }

    public void setPatientDataId(Integer patientDataId) {
        this.patientDataId = patientDataId;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getDoctot() {
        return doctot;
    }

    public void setDoctot(int doctot) {
        this.doctot = doctot;
    }

    public Timestamp getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Timestamp registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(Double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public Integer getRegistrationState() {
        return registrationState;
    }

    public void setRegistrationState(Integer registrationState) {
        this.registrationState = registrationState;
    }

    public String getRegistrationType() {
        return registrationType;
    }

    public void setRegistrationType(String registrationType) {
        this.registrationType = registrationType;
    }

    public String getRegistrationName() {
        return registrationName;
    }

    public void setRegistrationName(String registrationName) {
        this.registrationName = registrationName;
    }

    @Override
    public String toString() {
        return "ZsxRegistrationVo{" +
                "registrationId=" + registrationId +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", patientDataId=" + patientDataId +
                ", room='" + room + '\'' +
                ", doctot=" + doctot +
                ", registrationTime=" + registrationTime +
                ", registrationFee=" + registrationFee +
                ", registrationState=" + registrationState +
                ", registrationType='" + registrationType + '\'' +
                ", registrationName='" + registrationName + '\'' +
                '}';
    }
}
