package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

public class YxjStaffEntity {
    private int staffId;
    private String staffName;
    private String staffAge;
    private Date staffTime;
    private Integer deptId;

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(String staffAge) {
        this.staffAge = staffAge;
    }

    public Date getStaffTime() {
        return staffTime;
    }

    public void setStaffTime(Date staffTime) {
        this.staffTime = staffTime;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YxjStaffEntity that = (YxjStaffEntity) o;
        return staffId == that.staffId &&
                Objects.equals(staffName, that.staffName) &&
                Objects.equals(staffAge, that.staffAge) &&
                Objects.equals(staffTime, that.staffTime) &&
                Objects.equals(deptId, that.deptId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, staffName, staffAge, staffTime, deptId);
    }

    public List<TyhRecipeEntity> tyhRecipeEntities;

    public List<TyhRecipeEntity> getTyhRecipeEntities() {
        return tyhRecipeEntities;
    }

    public void setTyhRecipeEntities(List<TyhRecipeEntity> tyhRecipeEntities) {
        this.tyhRecipeEntities = tyhRecipeEntities;
    }
}
