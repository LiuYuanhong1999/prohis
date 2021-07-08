package cn.gson.prohis.controller.YXJ;

import cn.gson.prohis.model.mapper.YXJ.PhysicalMapper;
import cn.gson.prohis.model.pojos.Physical;
import cn.gson.prohis.model.service.YXJ.PhysicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhysicalController {
    @Autowired
    PhysicalMapper physicalMapper;

    @Autowired
    PhysicalService physicalService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/findPhysical")
    @ResponseBody
    public List<Physical> findByPhysical(){
       return physicalService.findByPhysical();
    };

    /**
     * 新增体检类别
     * @param physical
     */
    @RequestMapping("/addPhysical")
    @ResponseBody
    public void addPhysical(@RequestBody Physical physical){
        physicalService.addPhysical(physical);
    }

    /**
     * 修改体检类别
     * @param physical
     */
    @RequestMapping("/updatePhysical")
    @ResponseBody
    public void updatePhysical(@RequestBody Physical physical){
        physicalService.updatePhysical(physical);
    }


}
