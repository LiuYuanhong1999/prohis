package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxOperatingRoomMapper;
import cn.gson.prohis.model.pojos.YxjDesk;
import cn.gson.prohis.model.pojos.ZsxOperatingRoom;
import cn.gson.prohis.model.pojos.ZsxOperatingRoomType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ZsxOperatingRoomService {
    @Resource
    ZsxOperatingRoomMapper operatingRoomMapper;
//手术室主表的查询
    public List<ZsxOperatingRoom> findOperating(){
        return operatingRoomMapper.findOperating();
    }
//手术室类别查询
    public List<ZsxOperatingRoomType> findOperatingRoomType(){
        return operatingRoomMapper.findOperatingRoomType();
    }
//科室的查询
    public List<YxjDesk> findDesk(){
        return operatingRoomMapper.findDesk();
    }
//    手术室的新增和修改
    public void saveOperatingRoom(ZsxOperatingRoom operatingRoom){
        if (operatingRoom.getOperatingRoomId() == null || operatingRoom.getOperatingRoomId().equals("")){
            operatingRoom.setOperatingRoomTypeId(operatingRoom.getOperatingRoom().getOperatingRoomTypeId());
            operatingRoom.setDeskId(operatingRoom.getDesk().getDeskId());
            operatingRoomMapper.insertOperatingRoom(operatingRoom);
        }else{
            operatingRoom.setOperatingRoomTypeId(operatingRoom.getOperatingRoom().getOperatingRoomTypeId());
            operatingRoom.setDeskId(operatingRoom.getDesk().getDeskId());
            operatingRoomMapper.updateOperating(operatingRoom);
        }
    }
}
