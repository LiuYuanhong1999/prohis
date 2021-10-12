package cn.gson.prohis.model.pojos;

public class ZsxOperatingRoom {
    private Integer operatingRoomId;
    private String operatingRoomName;
    private String operatingRoomType;
    private Integer operatingRoomTypeId;
    private Integer deskId;
    private String operatingRoomPlace;
    private String operatingRoomCharge;
    private String operatingRoomMaintain;
    private String operatingRoomEmploy;
//手术室类别
    private ZsxOperatingRoomType operatingRoom;

    public ZsxOperatingRoomType getOperatingRoom() {
        return operatingRoom;
    }

    public void setOperatingRoom(ZsxOperatingRoomType operatingRoom) {
        this.operatingRoom = operatingRoom;
    }
//科室
    private YxjDesk desk;

    public YxjDesk getDesk() {
        return desk;
    }

    public void setDesk(YxjDesk desk) {
        this.desk = desk;
    }

    public Integer getOperatingRoomId() {
        return operatingRoomId;
    }

    public void setOperatingRoomId(Integer operatingRoomId) {
        this.operatingRoomId = operatingRoomId;
    }

    public String getOperatingRoomName() {
        return operatingRoomName;
    }

    public void setOperatingRoomName(String operatingRoomName) {
        this.operatingRoomName = operatingRoomName;
    }

    public String getOperatingRoomType() {
        return operatingRoomType;
    }

    public void setOperatingRoomType(String operatingRoomType) {
        this.operatingRoomType = operatingRoomType;
    }

    public Integer getOperatingRoomTypeId() {
        return operatingRoomTypeId;
    }

    public void setOperatingRoomTypeId(Integer operatingRoomTypeId) {
        this.operatingRoomTypeId = operatingRoomTypeId;
    }

    public Integer getDeskId() {
        return deskId;
    }

    public void setDeskId(Integer deskId) {
        this.deskId = deskId;
    }

    public String getOperatingRoomPlace() {
        return operatingRoomPlace;
    }

    public void setOperatingRoomPlace(String operatingRoomPlace) {
        this.operatingRoomPlace = operatingRoomPlace;
    }

    public String getOperatingRoomCharge() {
        return operatingRoomCharge;
    }

    public void setOperatingRoomCharge(String operatingRoomCharge) {
        this.operatingRoomCharge = operatingRoomCharge;
    }

    public String getOperatingRoomMaintain() {
        return operatingRoomMaintain;
    }

    public void setOperatingRoomMaintain(String operatingRoomMaintain) {
        this.operatingRoomMaintain = operatingRoomMaintain;
    }

    public String getOperatingRoomEmploy() {
        return operatingRoomEmploy;
    }

    public void setOperatingRoomEmploy(String operatingRoomEmploy) {
        this.operatingRoomEmploy = operatingRoomEmploy;
    }

    @Override
    public String toString() {
        return "ZsxOperatingRoom{" +
                "operatingRoomId=" + operatingRoomId +
                ", operatingRoomName='" + operatingRoomName + '\'' +
                ", operatingRoomType='" + operatingRoomType + '\'' +
                ", operatingRoomTypeId=" + operatingRoomTypeId +
                ", deskId=" + deskId +
                ", operatingRoomPlace='" + operatingRoomPlace + '\'' +
                ", operatingRoomCharge='" + operatingRoomCharge + '\'' +
                ", operatingRoomMaintain='" + operatingRoomMaintain + '\'' +
                ", operatingRoomEmploy='" + operatingRoomEmploy + '\'' +
                ", operatingRoom=" + operatingRoom +
                ", desk=" + desk +
                '}';
    }
}
