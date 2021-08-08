package cn.gson.prohis.model.pojos;

import java.sql.Timestamp;
import java.util.List;

public class ZsxPrescriptionVo {
    private String prescriptionId;
    private long doctor;
    private Timestamp prescriptionTime;
    private long registrationId;
    private Double prescriptionMoney;

    public List<ZsxPrescriptionDetailsVo> prescriptionDetails;

    public List<ZsxPrescriptionDetailsVo> getPrescriptionDetails() {
        return prescriptionDetails;
    }

    public ZsxRegistrationVo registration;

    public ZsxRegistrationVo getRegistration() {
        return registration;
    }

    public void setRegistration(ZsxRegistrationVo registration) {
        this.registration = registration;
    }

    public void setPrescriptionDetails(List<ZsxPrescriptionDetailsVo> prescriptionDetails) {
        this.prescriptionDetails = prescriptionDetails;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public long getDoctor() {
        return doctor;
    }

    public void setDoctor(long doctor) {
        this.doctor = doctor;
    }

    public Timestamp getPrescriptionTime() {
        return prescriptionTime;
    }

    public void setPrescriptionTime(Timestamp prescriptionTime) {
        this.prescriptionTime = prescriptionTime;
    }

    public long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(long registrationId) {
        this.registrationId = registrationId;
    }

    public Double getPrescriptionMoney() {
        return prescriptionMoney;
    }

    public void setPrescriptionMoney(Double prescriptionMoney) {
        this.prescriptionMoney = prescriptionMoney;
    }

    @Override
    public String toString() {
        return "ZsxPrescriptionVo{" +
                "prescriptionId='" + prescriptionId + '\'' +
                ", doctor=" + doctor +
                ", prescriptionTime=" + prescriptionTime +
                ", registrationId=" + registrationId +
                ", prescriptionMoney=" + prescriptionMoney +
                ", prescriptionDetails=" + prescriptionDetails +
                ", registration=" + registration +
                '}';
    }
}
