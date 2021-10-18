package cn.gson.prohis.controller.LYH;


import cn.gson.prohis.model.pojos.LyhAllotDetailsEntity;
import cn.gson.prohis.model.pojos.LyhAllotEntity;
import cn.gson.prohis.model.pojos.LyhPharmacyDetailsEntity;
import cn.gson.prohis.model.pojos.LyhRecordsEntity;
import cn.gson.prohis.model.service.LYH.LyhAllotService;
import cn.gson.prohis.model.service.LYH.LyhRecordsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LyhAllotController {
    @Resource
    LyhAllotService bs;


    @Resource
    LyhRecordsService ds;


    @PostMapping("add-allot")
    public void addAllot(@RequestBody LyhAllotEntity  allotEntity){


        bs.insertAllot(allotEntity);


    }


    @RequestMapping("find-allot")
    public List<LyhAllotEntity> findAll(){
        return bs.findAllot();
    }


    @RequestMapping("find-allot2")
    public List<LyhAllotEntity> findAll2(@RequestBody LyhAllotEntity allotEntity){
        return bs.findAll2(allotEntity);
    }

    @RequestMapping("find-pharmacyDetails")
    public List<LyhPharmacyDetailsEntity> findAll2(@RequestBody LyhPharmacyDetailsEntity pharmacyDetailsEntity){
        return bs.findPharmacy(pharmacyDetailsEntity);
    }




    @RequestMapping("/find-allotDetails")
    public List<LyhAllotDetailsEntity> findAll3(String allotId){
        return bs.findAll(allotId);
    }


    @RequestMapping("/update-allot")
    public AjaxResult   updateState(String allotState,String allotId){

        Map<String,Object> map=new HashMap<>();
        List<String> idList= Arrays.asList(allotId.split(","));
        map.put("allotState",allotState);
        map.put("allotId",idList);
        bs.updateById(map);



        //String 强转  int  增加调拨记录单
        int recordsState=Integer.parseInt(allotState);
        ds.insertById(recordsState,allotId);


        return AjaxResult.me().setSuccess(true).setMsg("修改成功").setObject("success");
    }



    @RequestMapping("/find-records")
    public List<LyhRecordsEntity> findAll3(){
        return ds.findAll();
    }
}
