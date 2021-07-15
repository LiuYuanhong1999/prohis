package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class LyhDrugStoreDetailsEntity {
    private int detailsId;
    private String procurementId;
    private String detailsName;
    private Timestamp detailsDate;


    public int getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(int detailsId) {
        this.detailsId = detailsId;
    }


    public String getProcurementId() {
        return procurementId;
    }

    public void setProcurementId(String procurementId) {
        this.procurementId = procurementId;
    }


    public String getDetailsName() {
        return detailsName;
    }

    public void setDetailsName(String detailsName) {
        this.detailsName = detailsName;
    }


    public Timestamp getDetailsDate() {
        return detailsDate;
    }

    public void setDetailsDate(Timestamp detailsDate) {
        this.detailsDate = detailsDate;
    }





}
