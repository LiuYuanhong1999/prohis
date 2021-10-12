package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class ZsxSurgicalItems {
    private int surgicalItemsId;
    private Timestamp surgicalItemsTime;
    private String surgicalItemsName;
    private Integer patientDataId;
    private String surgicalItemsFacility;
    private String surgicalItemsPharmacy;
    private BigDecimal surgicalItmesCost;

    public int getSurgicalItemsId() {
        return surgicalItemsId;
    }

    public void setSurgicalItemsId(int surgicalItemsId) {
        this.surgicalItemsId = surgicalItemsId;
    }

    public Timestamp getSurgicalItemsTime() {
        return surgicalItemsTime;
    }

    public void setSurgicalItemsTime(Timestamp surgicalItemsTime) {
        this.surgicalItemsTime = surgicalItemsTime;
    }

    public String getSurgicalItemsName() {
        return surgicalItemsName;
    }

    public void setSurgicalItemsName(String surgicalItemsName) {
        this.surgicalItemsName = surgicalItemsName;
    }

    public Integer getPatientDataId() {
        return patientDataId;
    }

    public void setPatientDataId(Integer patientDataId) {
        this.patientDataId = patientDataId;
    }

    public String getSurgicalItemsFacility() {
        return surgicalItemsFacility;
    }

    public void setSurgicalItemsFacility(String surgicalItemsFacility) {
        this.surgicalItemsFacility = surgicalItemsFacility;
    }

    public String getSurgicalItemsPharmacy() {
        return surgicalItemsPharmacy;
    }

    public void setSurgicalItemsPharmacy(String surgicalItemsPharmacy) {
        this.surgicalItemsPharmacy = surgicalItemsPharmacy;
    }

    public BigDecimal getSurgicalItmesCost() {
        return surgicalItmesCost;
    }

    public void setSurgicalItmesCost(BigDecimal surgicalItmesCost) {
        this.surgicalItmesCost = surgicalItmesCost;
    }

}
