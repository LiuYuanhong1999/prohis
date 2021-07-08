package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.pojos.LyhProcurementDetailsEntity;
import cn.gson.prohis.model.service.LYH.lyhProcurementDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class lyhProcurementDetailsController {
    @Resource
    lyhProcurementDetailsService bs;

    @RequestMapping("/insert-details")
    public List<LyhProcurementDetailsEntity> add(@RequestBody List<LyhProcurementDetailsEntity> list){
      bs.insertDetails(list);
        System.out.println(list);
      return list;
    }
}
