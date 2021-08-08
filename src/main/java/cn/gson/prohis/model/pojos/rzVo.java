package cn.gson.prohis.model.pojos;

public class rzVo {
    private Integer hospitalId;
    private Integer inpId;
    private String hosnotNum;

    public Integer getInpId() {
        return inpId;
    }

    public void setInpId(Integer inpId) {
        this.inpId = inpId;
    }

    public String getHosnotNum() {
        return hosnotNum;
    }

    public void setHosnotNum(String hosnotNum) {
        this.hosnotNum = hosnotNum;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    @Override
    public String toString() {
        return "rzVo{" +
                "hospitalId=" + hospitalId +
                ", inpId=" + inpId +
                ", hosnotNum='" + hosnotNum + '\'' +
                '}';
    }
}
