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
    public List<LyhDrugstoreEntity> findAll(){
        return bs.findAll();
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

//    @PostMapping("/update-drugstore")
//    public int updateById(@RequestBody List<LyhDrugstoreEntity> lyhDrugstoreEntities){
//
//        bs.updateById(lyhDrugstoreEntities);
////        System.out.println(lyhDrugstoreEntities+"--------------");
////        //int numbers = 0;
////        List<Integer> numbers = new ArrayList<>();
////        //int drugId=0;
////        List<Integer> drugId = new ArrayList<>();
////        for (LyhDrugstoreEntity entity : lyhDrugstoreEntities) {
////
////
////            for (LyhProcurementDetailsEntity detailsEntity : entity.getLyhProcurementEntity().getLyhProcurementDetailsEntities()) {
//////                System.out.println(detailsEntity.getNumbers());
////                detailsEntity.getNumbers();
////
////               numbers.add(Integer.valueOf(detailsEntity.getNumbers()));
////
////               drugId.add(Integer.valueOf(detailsEntity.getDrugId()));
////
////
////
////            }
//////            System.out.println(numbers.get(0)+"---qqqqwww");
//////            System.out.println(drugId+"---qwwqqwq");
////            //采购详表
////            for (Integer integer : drugId) {
////
////            }
////
//////            bs.updateById(numbers,entity.getProcurementId(),drugId);
////        }
//
//return 0;
////
////        bs.updateById(list);
//
////        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("sucess");
//
//    }
}

//    @RequestMapping("/update-drugstore")
//    public AjaxResult updateById(String numbers,String procurementId,String drugId){
//        String str[] = numbers.split(",");
//        for (String s : str) {
//            System.out.println(s);
//        }
//
//        System.out.println("编号"+procurementId);
//        System.out.println("药品Id"+drugId);
//        Map<String,Object> map=new HashMap<>();
//        List<String> numbers1=Arrays.asList(numbers.split(","));
//        System.out.println(numbers1+"--------------------------------------数量");
//        List<String> idList= Arrays.asList(procurementId.split(","));
//        List<String> idList2=Arrays.asList(drugId.split(","));
//        map.put("numbers",numbers1);
//        map.put("procurementId",idList);
//        map.put("drugId",idList2);
//        bs.updateById(map);
//
//
//        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("sucess");
//
//    }
//}
