package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.pojos.LyhDrugstoreEntity;
import cn.gson.prohis.model.pojos.LyhProcurementDetailsEntity;
import cn.gson.prohis.model.service.LYH.LyhDrugStoreService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@RestController
public class LyhDrugStoreController {
    @Resource
    LyhDrugStoreService bs;


    @RequestMapping("/find-drugstore")
    public List<LyhDrugstoreEntity> findAll(Integer drugId,String procurementId){
        return bs.findAll(drugId, procurementId);
    }

@PostMapping(value = "/update-drugstore" , produces = "application/json")
    public AjaxResult update(@RequestBody String json){


   bs.updateById(json);

//    System.out.println(numbers);
//    System.out.println(drugId);
//    System.out.println(procurementId);
//    bs.updateById(numbers,drugId,procurementId);

    return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("success");
}


@RequestMapping("/update-drugstore")
    public AjaxResult updateById2(Integer numbers,Integer drugId,String procurementId,String allotId){

   bs.update(numbers, drugId, procurementId,allotId);
    return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("success");
}


}


