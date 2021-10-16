package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.ZsxSurgeryArrange;
import cn.gson.prohis.model.service.ZSX.ZsxSurgeryArrangeService;
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
}
