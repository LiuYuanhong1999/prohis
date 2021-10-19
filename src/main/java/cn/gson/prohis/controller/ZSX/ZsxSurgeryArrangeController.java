package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.YxjDesk;
import cn.gson.prohis.model.pojos.ZsxOperatingRoom;
import cn.gson.prohis.model.pojos.ZsxSurgeryArrange;
import cn.gson.prohis.model.pojos.ZsxSurgeryFor;
import cn.gson.prohis.model.service.ZSX.ZsxSurgeryArrangeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ZsxSurgeryArrangeController {
    @Resource
    ZsxSurgeryArrangeService surgeryArrangeService;

    @RequestMapping("/find_surgery_arrange")
    public List<ZsxSurgeryArrange> findSurgeryArrange(){
        return surgeryArrangeService.findSurgeryArrange();
    }

    @RequestMapping("/select_operating_room")
    public List<ZsxOperatingRoom> selectOperatingRoom(){
        return surgeryArrangeService.selectOperatingRoom();
    }

    @RequestMapping("/select_surgery_for")
    public List<ZsxSurgeryFor> selectSurgeryFor(){
        return surgeryArrangeService.selectSurgeryFor();
    }

    @RequestMapping("/select_desk")
    public List<YxjDesk> selectDesk(){
        return surgeryArrangeService.selectDesk();
    }

    @PostMapping("/save_surgery_arrange")
    public void saveSurgeryArrange(@RequestBody ZsxSurgeryArrange surgeryArrange){
        surgeryArrangeService.saveSurgeryArrange(surgeryArrange);
    }

    @RequestMapping("/update_surgery_arrange_staff")
    public void updateSurgeryArrangeStaff(String surgeryArrangeNumber){
        surgeryArrangeService.updateSurgeryArrangeStaff(surgeryArrangeNumber);
    }
}
