package cn.gson.prohis.model.pojos;


import java.sql.Timestamp;
import java.util.List;

public class LyhCheckEntity {
    private String checkId;
    private Timestamp checkDate;
    private String checkUser;
    private Integer numbers;

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }


    public Timestamp getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Timestamp checkDate) {
        this.checkDate = checkDate;
    }


    public String getCheckUser() {
        return checkUser;
    }

    public void setCheckUser(String checkUser) {
        this.checkUser = checkUser;
    }

private List<LyhCheckDetailsEntity> lyhCheckDetailsEntities;

    public List<LyhCheckDetailsEntity> getLyhCheckDetailsEntities() {
        return lyhCheckDetailsEntities;
    }

    public void setLyhCheckDetailsEntities(List<LyhCheckDetailsEntity> lyhCheckDetailsEntities) {
        this.lyhCheckDetailsEntities = lyhCheckDetailsEntities;
    }
}
