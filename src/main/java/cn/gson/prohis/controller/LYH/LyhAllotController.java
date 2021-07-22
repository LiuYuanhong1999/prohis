package cn.gson.prohis.controller.LYH;


import cn.gson.prohis.model.pojos.LyhAllotDetailsEntity;
import cn.gson.prohis.model.pojos.LyhAllotEntity;
import cn.gson.prohis.model.pojos.LyhPharmacyDetailsEntity;
import cn.gson.prohis.model.service.LYH.LyhAllotService;
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





    @PostMapping("add-allot")
    public void addAllot(@RequestBody LyhAllotEntity  allotEntity){


        bs.insertAllot(allotEntity);


    }


    @RequestMapping("find-allot")
    public List<LyhAllotEntity> findAll(){
        return bs.findAllot();
    }



    @RequestMapping("find-pharmacyDetails")
    public List<LyhPharmacyDetailsEntity> findAll2(){
        return bs.findPharmacy();
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


        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("sucess");
    }

}
