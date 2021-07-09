package cn.gson.prohis.controller.TYH;

import cn.gson.prohis.model.pojos.TyhCashEntity;
import cn.gson.prohis.model.service.TYH.cashService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class cashcontroller {
    @Resource
    cashService cashService;

    @RequestMapping("/findAll-cash")
    public List<TyhCashEntity> findAll(){
        return cashService.findAll();
    }

    @PostMapping("/add-cash")
    public void addcash(TyhCashEntity tyhCashEntity){
        cashService.addcash(tyhCashEntity);
    }
}
