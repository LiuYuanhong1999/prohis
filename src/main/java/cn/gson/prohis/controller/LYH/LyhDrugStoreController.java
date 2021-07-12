package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.pojos.LyhDrugstoreEntity;
import cn.gson.prohis.model.service.LYH.LyhDrugStoreService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LyhDrugStoreController {
    @Resource
    LyhDrugStoreService bs;


    @RequestMapping("/find-drugstore")
    public List<LyhDrugstoreEntity> findAll(){
        return bs.findAll();
    }


    @RequestMapping("/update-drugstore")
    public AjaxResult updateById(String numbers,String procurementId,String drugId){
        System.out.println(numbers+"--------------------------------------数量");
        System.out.println("编号"+procurementId);
        System.out.println("药品Id"+drugId);
        Map<String,Object> map=new HashMap<>();
        List<String> idList= Arrays.asList(procurementId.split(","));
        List<String> idList2=Arrays.asList(drugId.split(","));
        map.put("numbers",numbers);
        map.put("procurementId",idList);
        map.put("drugId",idList2);
        bs.updateById(map);


        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("sucess");

    }
}
