package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

public class TyhHosnotEntity {
    private String hosnotNum;
    private Timestamp hosnotDate;
    private Integer hosnotMz;
    private Integer deskId;
    private Integer bingren;
    private Double hosnotPrice;
    private Double hosnotCash;
    private Double hosnotWar;
    private String hosnotSm;
    private Integer hosnotZt;

    public String getHosnotNum() {
        return hosnotNum;
    }

    public void setHosnotNum(String hosnotNum) {
        this.hosnotNum = hosnotNum;
    }

    public Timestamp getHosnotDate() {
        return hosnotDate;
    }

    public void setHosnotDate(Timestamp hosnotDate) {
        this.hosnotDate = hosnotDate;
    }

    public Integer getHosnotMz() {
        return hosnotMz;
    }

    public void setHosnotMz(Integer hosnotMz) {
        this.hosnotMz = hosnotMz;
    }

    public Integer getDeskId() {
        return deskId;
    }

    public void setDeskId(Integer deskId) {
        this.deskId = deskId;
    }

    public Integer getBingren() {
        return bingren;
    }

    public void setBingren(Integer bingren) {
        this.bingren = bingren;
    }

    public Double getHosnotPrice() {
        return hosnotPrice;
    }

    public void setHosnotPrice(Double hosnotPrice) {
        this.hosnotPrice = hosnotPrice;
    }

    public Double getHosnotCash() {
        return hosnotCash;
    }

    public void setHosnotCash(Double hosnotCash) {
        this.hosnotCash = hosnotCash;
    }

    public Double getHosnotWar() {
        return hosnotWar;
    }

    public void setHosnotWar(Double hosnotWar) {
        this.hosnotWar = hosnotWar;
    }

    public String getHosnotSm() {
        return hosnotSm;
    }

    public void setHosnotSm(String hosnotSm) {
        this.hosnotSm = hosnotSm;
    }

    public Integer getHosnotZt() {
        return hosnotZt;
    }

    public void setHosnotZt(Integer hosnotZt) {
        this.hosnotZt = hosnotZt;
    }
}
