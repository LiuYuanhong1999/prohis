package cn.gson.prohis.controller.TYH;

import cn.gson.prohis.model.pojos.TyhCashEntity;
import cn.gson.prohis.model.pojos.TyhHosregEntity;
import cn.gson.prohis.model.service.TYH.cashService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
public class CashController {
    @Resource
    cashService cashService;

    @RequestMapping("/findAll-cash")
    public List<TyhCashEntity> findAll(String cha){
        return cashService.findAll(cha);
    }

    @RequestMapping("/findAll-cash1")
    public List<TyhCashEntity> findAllcash(String cha){
        return cashService.findAllcash(cha);
    }

    @PostMapping("/add-cash")
    public void addcash(@RequestBody TyhCashEntity tyhCashEntity){
        cashService.addcash(tyhCashEntity);
    }
 
    @RequestMapping("/find-num")
    public List<TyhHosregEntity> findnum(){
        return cashService.findnum();
    }

    @RequestMapping("/find-num2")
    public TyhHosregEntity findnum2(String num){
        return cashService.findnum2(num);
    }


    @PostMapping("/del-cash2")
    public void delcash2(@RequestBody TyhCashEntity tyhCashEntity){
        cashService.delcash(tyhCashEntity);
    }

}
