package cn.gson.prohis.controller.LYH;


import cn.gson.prohis.model.pojos.LyhProcurementEntity;
import cn.gson.prohis.model.service.LYH.LyhProcurementService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@RestController
public class LyhProcurementController {
    @Resource
    LyhProcurementService bs;



    @PostMapping("add-procurement")
    public void addProcurement(@RequestBody LyhProcurementEntity lyhProcurementEntity){
        System.out.println(lyhProcurementEntity);
        bs.addProcurement(lyhProcurementEntity);
    }


    @RequestMapping("find-procurement")
    public List<LyhProcurementEntity> findAll(@RequestBody LyhProcurementEntity procurementEntity){
        return bs.findAll(procurementEntity);
    }

    @RequestMapping("find-procurement2")
    public List<LyhProcurementEntity> findAll2(String procurementId){
        return bs.findAll2();
    }

    @RequestMapping("/update-procurement")
    public AjaxResult   updateState(String procurementState,String procurementId){

        Map<String,Object> map=new HashMap<>();
        List<String> idList=Arrays.asList(procurementId.split(","));
        map.put("procurementState",procurementState);
        map.put("procurementId",idList);
        bs.updateById(map);


        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("sucess");
    }


    @RequestMapping("/delete-procurement")
        public void deleteById(@RequestParam("procurementId") String procurementId){

        String[] userIds =procurementId.split(",");
        List<String> list =new ArrayList<>();
        for (String str:userIds){
            list.add(str);
        }
        bs.deleteById(list);


    }


//
//    /**
//     * 批量修改
//     */
//    @RequestMapping( "/updateState")
//    public AjaxResult updateState(String userName, String userPass, String userId)
//    {
//        Map<String, Object> map = new HashMap<>();
//        List<String> idList= Arrays.asList(userId.split(","));
//        map.put("userName",userName);
//        map.put("userPass",userPass);
//        map.put("userId",idList);
//        bs.update(map);
//        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("succes");
//    }
//
//
//    //批量删除
//    @RequestMapping("/deleteById")
//    public void deleteById(@RequestParam("userId")String userId){
//        String[] userIds =userId.split(",");
//        List<Integer> list =new ArrayList<>();
//        for (String str:userIds){
//            list.add(Integer.parseInt(str));
//        }
//        bs.deleteById(list);
//    }
}
