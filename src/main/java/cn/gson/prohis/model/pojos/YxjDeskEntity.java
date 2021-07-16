package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;


public class YxjDeskEntity {
    private int deskId;
    private String deskName;
    private Date deskTime;

    public int getDeskId() {
        return deskId;
    }

    public void setDeskId(int deskId) {
        this.deskId = deskId;
    }


    public String getDeskName() {
        return deskName;
    }

    public void setDeskName(String deskName) {
        this.deskName = deskName;
    }


    public Date getDeskTime() {
        return deskTime;
    }

    public void setDeskTime(Date deskTime) {
        this.deskTime = deskTime;
    }

    public List<TyhHosnotEntity> tyhHosnotEntities;

    public List<TyhHosnotEntity> getTyhHosnotEntities() {
        return tyhHosnotEntities;
    }

    public void setTyhHosnotEntities(List<TyhHosnotEntity> tyhHosnotEntities) {
        this.tyhHosnotEntities = tyhHosnotEntities;
    }
}
