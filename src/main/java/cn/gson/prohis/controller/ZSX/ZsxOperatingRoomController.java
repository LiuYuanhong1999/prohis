package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.YxjDesk;
import cn.gson.prohis.model.pojos.ZsxOperatingRoom;
import cn.gson.prohis.model.pojos.ZsxOperatingRoomType;
import cn.gson.prohis.model.service.ZSX.ZsxOperatingRoomService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ZsxOperatingRoomController {
    @Resource
    ZsxOperatingRoomService operatingRoomService;

    @RequestMapping("/find_operating_room")
    public List<ZsxOperatingRoom> findOperating(){
        return operatingRoomService.findOperating();
    }

    @RequestMapping("/find_operating_room_type")
    public List<ZsxOperatingRoomType> findOperatingRoomType(){
        return operatingRoomService.findOperatingRoomType();
    }

    @RequestMapping("/find_desk")
    public List<YxjDesk> findDesk(){
        return operatingRoomService.findDesk();
    }

    @PostMapping("/save_operating_room")
    public void saveOperatingRoom(@RequestBody ZsxOperatingRoom operatingRoom){
        operatingRoomService.saveOperatingRoom(operatingRoom);
    }
}
