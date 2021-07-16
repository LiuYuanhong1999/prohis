package cn.gson.prohis.controller.YXJ;

import cn.gson.prohis.model.pojos.YxjDesk;
import cn.gson.prohis.model.service.YXJ.YxjDeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class YxjDeskController {
    @Autowired
    YxjDeskService yxjDeskService;

    /**
     * 查询所有科室
     * @return
     */
    @RequestMapping("/selDesk")
    public List<YxjDesk> selDesk(){return yxjDeskService.selDesk();}

    /**
     * 新增科室
     * @param yxjDesk
     */
    @RequestMapping("/addDesk")
    public void addDesk(@RequestBody YxjDesk yxjDesk){yxjDeskService.addDesk(yxjDesk);}

    /**
     * 修改科室
     * @param yxjDesk
     */
    @RequestMapping("/updateDesk")
    public void updateDesk(@RequestBody YxjDesk yxjDesk){yxjDeskService.updateDesk(yxjDesk);}

    /**
     * 根据id删除科室
     * @param deskId
     */
    @RequestMapping("/delDesk")
    public void delDesk(@RequestBody YxjDesk deskId){yxjDeskService.delDesk(deskId.getDeskId());}

}
