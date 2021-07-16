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
    YxjPhysicalService yxjPhysicalService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/findPhysical")
    public List<YxjPhysical> findByPhysical(){
       return yxjPhysicalService.findByPhysical();
    };

    /**
     * 新增体检类别
     * @param physical
     */
    @RequestMapping("/addPhysical")
    public void addPhysical(@RequestBody YxjPhysical physical){
        yxjPhysicalService.addPhysical(physical);
    }

    /**
     * 修改体检类别
     * @param physical
     */
    @RequestMapping("/updatePhysical")
    public void updatePhysical(@RequestBody YxjPhysical physical){
        yxjPhysicalService.updatePhysical(physical);
    }

    /**
     * 根据ID删除类别
     * @param phId
     */
    @RequestMapping("/delPhysical")
    public void delPhysical(@RequestBody YxjPhysical phId) {yxjPhysicalService.delPhysical(phId.getPhId());}


    /**
     * 根据类别ID查询
     * @param phId
     * @return
     */
    @RequestMapping("/find-id")
    public YxjPhysical selPhId(Integer phId){
        return yxjPhysicalService.selPhId(phId);
    }
}
