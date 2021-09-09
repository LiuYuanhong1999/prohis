package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;


public class LyhRecordsEntity {
    private int recordsId;
    private Timestamp recordsDate;
    private Integer recordsState;
    private String allotId;


    public int getRecordsId() {
        return recordsId;
    }

    public void setRecordsId(int recordsId) {
        this.recordsId = recordsId;
    }


    public Timestamp getRecordsDate() {
        return recordsDate;
    }

    public void setRecordsDate(Timestamp recordsDate) {
        this.recordsDate = recordsDate;
    }


    public Integer getRecordsState() {
        return recordsState;
    }

    public void setRecordsState(Integer recordsState) {
        this.recordsState = recordsState;
    }


    public String getAllotId() {
        return allotId;
    }

    public void setAllotId(String allotId) {
        this.allotId = allotId;
    }




    public LyhAllotEntity allotEntity;

    public LyhAllotEntity getAllotEntity() {
        return allotEntity;
    }

    public void setAllotEntity(LyhAllotEntity allotEntity) {
        this.allotEntity = allotEntity;
    }



    public LyhAllotRecordEntity allotRecordEntity;

    public LyhAllotRecordEntity getAllotRecordEntity() {
        return allotRecordEntity;
    }

    public void setAllotRecordEntity(LyhAllotRecordEntity allotRecordEntity) {
        this.allotRecordEntity = allotRecordEntity;
    }
}
