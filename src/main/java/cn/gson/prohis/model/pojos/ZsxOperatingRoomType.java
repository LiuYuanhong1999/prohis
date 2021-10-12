package cn.gson.prohis.model.pojos;


public class ZsxOperatingRoomType {
    private int operatingRoomTypeId;
    private String operatingRoomTypeName;


    public int getOperatingRoomTypeId() {
        return operatingRoomTypeId;
    }

    public void setOperatingRoomTypeId(int operatingRoomTypeId) {
        this.operatingRoomTypeId = operatingRoomTypeId;
    }

    public String getOperatingRoomTypeName() {
        return operatingRoomTypeName;
    }

    public void setOperatingRoomTypeName(String operatingRoomTypeName) {
        this.operatingRoomTypeName = operatingRoomTypeName;
    }

    @Override
    public String toString() {
        return "ZsxOperatingRoomType{" +
                "operatingRoomTypeId=" + operatingRoomTypeId +
                ", operatingRoomTypeName='" + operatingRoomTypeName + '\'' +
                '}';
    }
}
