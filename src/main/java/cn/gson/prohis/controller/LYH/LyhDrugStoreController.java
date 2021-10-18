package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.pojos.LyhDrugstoreEntity;
import cn.gson.prohis.model.pojos.LyhProcurementDetailsEntity;
import cn.gson.prohis.model.service.LYH.LyhDrugStoreService;
import cn.gson.prohis.model.service.LYH.LyhPharmacyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@RestController
public class LyhDrugStoreController {
    @Resource
    LyhDrugStoreService bs;

    @Resource
    LyhPharmacyService ds;


    @RequestMapping("/find-drugstore")
    public List<LyhDrugstoreEntity> findAll(@RequestBody LyhDrugstoreEntity drugstoreEntity){
        return bs.findAll(drugstoreEntity);
    }

@PostMapping(value = "/update-drugstore" , produces = "application/json")
    public AjaxResult update(@RequestBody String json){


   bs.updateById(json);


    return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("success");
}


@RequestMapping("/update-drugstore2")
    public AjaxResult updateById2(Integer numbers,Integer drugId,String procurementId,String allotId){

   bs.update(numbers, drugId, procurementId,allotId);
    return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("success");
}


//增加药房库存数量同时增加入房批次数据
    @RequestMapping("/update-pharmacyRecord")
    public AjaxResult updatePharmacyRecord(Integer numbers,Integer drugId,Integer piCi){
       ds.insertPharmacy(drugId,numbers,piCi);


        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("success");
    }
}


