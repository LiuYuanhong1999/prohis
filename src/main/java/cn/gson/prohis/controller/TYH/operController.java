package cn.gson.prohis.controller.TYH;

import cn.gson.prohis.model.pojos.*;
import cn.gson.prohis.model.service.TYH.operService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class operController {
    @Resource
    operService operService;

    @RequestMapping("find-oper")
    public List<ZsxOperationNote> findOper(Integer id){
        return operService.findOper(id);
    }

    @RequestMapping("find-record")
    public List<YxjRecord> findRecord(Integer id){
        return operService.findRecord(id);
    }

    @PostMapping("add-jie")
    public void addJie(@RequestBody TyhJie jie){
        operService.addJie(jie);
    }
}
