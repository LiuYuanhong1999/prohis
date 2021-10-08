package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.pojos.LyhPharmacyEntity;
import cn.gson.prohis.model.service.LYH.LyhPharmacyService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LyhPharmacyController {
    @Resource
    LyhPharmacyService bs;


    @RequestMapping("find-pharmacy")
    public List<LyhPharmacyEntity> findAll(String drugName,Integer drugState,String drugJixin,String supplierName){
        return bs.findAll(drugName, drugState, drugJixin, supplierName);
    }


    @RequestMapping("find-pharmacyName")
    public List<LyhPharmacyEntity> findByName(String pharmacyName){
        return bs.findByName(pharmacyName);
    }


    @RequestMapping("update-pharmacy")
    public AjaxResult updateById2(Integer numbers,Integer drugId){
        System.out.println(numbers+"--------------------------------数量");
        System.out.println(drugId+"---------------------------------药品Id");
        bs.update(numbers, drugId);
        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("success");
    }


    @RequestMapping("update-pharmacy2")
    public AjaxResult updateById(Integer numbers,Integer drugId){
        System.out.println(numbers+"--------------------------------数量");
        System.out.println(drugId+"---------------------------------药品Id");
        bs.update2(numbers, drugId);
        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("success");
    }


    @PostMapping("/add-pharmacy")
    public AjaxResult insertById(@RequestBody LyhPharmacyEntity lyhPharmacy){
        System.out.println(lyhPharmacy.getDrugId());
        bs.insertDrug(lyhPharmacy);
        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("success");
    }
}
