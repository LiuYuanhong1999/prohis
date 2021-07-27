package cn.gson.prohis.controller.TYH;

import cn.gson.prohis.model.pojos.TyhHosnotEntity;
import cn.gson.prohis.model.pojos.YxjDeskEntity;
import cn.gson.prohis.model.pojos.ZsxRegistration;
import cn.gson.prohis.model.service.TYH.hosnotService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class hosnotContorller {
    @Resource
    hosnotService hosnotService;

    @RequestMapping("/findAll-not")
    public List<TyhHosnotEntity> findAllnot(){
        return hosnotService.findAllnot();
    }

    @RequestMapping("/find-regei")
    public List<ZsxRegistration> findRegei(){
        return hosnotService.findRegei();
    }

    @RequestMapping("/find-regei2")
    public ZsxRegistration findRegei2(Integer num){
        return hosnotService.findRegei2(num);
    }

    @RequestMapping("/find-tyhdesk")
    public List<YxjDeskEntity> finddesk(){
        return hosnotService.finddesk();
    }

    @PostMapping("/add-hosnot")
    public void addhosnot(@RequestBody TyhHosnotEntity tyhHosnotEntity){
        hosnotService.addhosnot(tyhHosnotEntity);
    }
}
