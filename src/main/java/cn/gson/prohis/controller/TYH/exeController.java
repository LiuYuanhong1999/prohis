package cn.gson.prohis.controller.TYH;

import cn.gson.prohis.model.pojos.TyhExecuteEntity;
import cn.gson.prohis.model.pojos.TyhExecutedelEntity;
import cn.gson.prohis.model.service.TYH.exeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class exeController {
    @Resource
    exeService exeService;

    @RequestMapping("find-execute")
    public List<TyhExecuteEntity> findExecute(){
        return exeService.findExecute();
    }


    @RequestMapping("find-execute2")
    public List<TyhExecuteEntity> findExecute2(){
        return exeService.findAll();
    }


    @RequestMapping("find-executedel")
    public List<TyhExecutedelEntity> findExecutedel(String id){
        return exeService.findExecutedel(id);
    }

    @RequestMapping("updata1-execute")
    public void updata1(String id){
        exeService.updata1(id);
    }

    @RequestMapping("updata2-execute")
    public void updata2(String id){
        exeService.updata2(id);
    }


    @RequestMapping("update3-execute")
    public void updata3(String id){
        exeService.updata2(id);
    }
}
