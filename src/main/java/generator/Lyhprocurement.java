package generator;

import java.io.Serializable;
import java.util.Date;

public class Lyhprocurement implements Serializable {
    private Integer procurementId;

    private Integer drugId;

    public Integer getProcurementId() {
        return procurementId;
    }

    public void setProcurementId(Integer procurementId) {
        this.procurementId = procurementId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getProcurementPrice() {
        return procurementPrice;
    }

    public void setProcurementPrice(Integer procurementPrice) {
        this.procurementPrice = procurementPrice;
    }

    public String getProcurementState() {
        return procurementState;
    }

    public void setProcurementState(String procurementState) {
        this.procurementState = procurementState;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProcurementName() {
        return procurementName;
    }

    public void setProcurementName(String procurementName) {
        this.procurementName = procurementName;
    }

    public Date getProcurementDate() {
        return procurementDate;
    }

    public void setProcurementDate(Date procurementDate) {
        this.procurementDate = procurementDate;
    }

    public Date getProcurementFirstdate() {
        return procurementFirstdate;
    }

    public void setProcurementFirstdate(Date procurementFirstdate) {
        this.procurementFirstdate = procurementFirstdate;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private Integer procurementPrice;

    private String procurementState;

    private String userName;

    private String procurementName;

    private Date procurementDate;

    private Date procurementFirstdate;

    private static final long serialVersionUID = 1L;
}