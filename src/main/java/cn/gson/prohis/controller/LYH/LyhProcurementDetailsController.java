package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.service.LYH.LyhProcurementDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class LyhProcurementDetailsController {
    @Resource
    LyhProcurementDetailsService bs;

//    @RequestMapping("/insert-details")
//    public List<LyhProcurementDetailsEntity> add(@RequestBody List<LyhProcurementDetailsEntity> list){
//      bs.insertDetails(list);
//        System.out.println(list);
//      return list;
//    }
}
