package cn.gson.prohis.controller.YXJ;


import cn.gson.prohis.model.pojos.YxjPhysical;
import cn.gson.prohis.model.mapper.YXJ.YxjPhysicalMapper;
import cn.gson.prohis.model.service.YXJ.YxjPhysicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class YxjPhysicalController {
    @Autowired
    YxjPhysicalMapper yxjPhysicalMapper;

    @Autowired
    YxjPhysicalService yxjPhysicalService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/findPhysical")
    @ResponseBody
    public List<YxjPhysical> findByPhysical(){
       return yxjPhysicalService.findByPhysical();
    };

    /**
     * 新增体检类别
     * @param physical
     */
    @RequestMapping("/addPhysical")
    @ResponseBody
    public void addPhysical(@RequestBody YxjPhysical physical){
        yxjPhysicalService.addPhysical(physical);
    }

    /**
     * 修改体检类别
     * @param physical
     */
    @RequestMapping("/updatePhysical")
    @ResponseBody
    public void updatePhysical(@RequestBody YxjPhysical physical){
        yxjPhysicalService.updatePhysical(physical);
    }

    /**
     * 根据ID删除类别
     * @param phId
     */
    @RequestMapping("/delPhysical")
    @ResponseBody
    public void delPhysical(@RequestBody YxjPhysical phId) {yxjPhysicalService.delPhysical(phId.getPhId());}


}
