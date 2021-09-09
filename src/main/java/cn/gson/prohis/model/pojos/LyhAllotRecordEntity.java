package cn.gson.prohis.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.sql.Timestamp;
import java.util.List;

public class LyhAllotRecordEntity {
    private int recordId;
    private String allotId;
    private Integer drugId;
    private Timestamp recordDate;
    private Integer recordNumbers;


    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }


    public String getAllotId() {
        return allotId;
    }

    public void setAllotId(String allotId) {
        this.allotId = allotId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Timestamp getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Timestamp recordDate) {
        this.recordDate = recordDate;
    }


    public Integer getRecordNumbers() {
        return recordNumbers;
    }

    public void setRecordNumbers(Integer recordNumbers) {
        this.recordNumbers = recordNumbers;
    }


    public LyhDrugEntity drugEntity;

    public LyhDrugEntity getDrugEntity() {
        return drugEntity;
    }

    public void setDrugEntity(LyhDrugEntity drugEntity) {
        this.drugEntity = drugEntity;
    }


    private List<LyhRecordsEntity> recordsEntities;

    public List<LyhRecordsEntity> getRecordsEntities() {
        return recordsEntities;
    }

    public void setRecordsEntities(List<LyhRecordsEntity> recordsEntities) {
        this.recordsEntities = recordsEntities;
    }
}
