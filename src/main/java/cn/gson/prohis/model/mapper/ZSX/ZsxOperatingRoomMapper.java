package cn.gson.prohis.model.mapper.ZSX;

import cn.gson.prohis.model.pojos.YxjDesk;
import cn.gson.prohis.model.pojos.ZsxOperatingRoom;
import cn.gson.prohis.model.pojos.ZsxOperatingRoomType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZsxOperatingRoomMapper {
    public List<ZsxOperatingRoom> findOperating();

    public List<ZsxOperatingRoomType> findOperatingRoomType();

    public List<YxjDesk> findDesk();

    void updateOperating(ZsxOperatingRoom operatingRoom);

    void insertOperatingRoom(ZsxOperatingRoom operatingRoom);
}
