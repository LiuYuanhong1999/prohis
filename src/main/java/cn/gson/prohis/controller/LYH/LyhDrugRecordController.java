package cn.gson.prohis.controller.LYH;

import cn.gson.prohis.model.pojos.LyhDrugRecord;
import cn.gson.prohis.model.service.LYH.LyhDrugRecordService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LyhDrugRecordController {
    @Resource
    LyhDrugRecordService drugRecordService;




    @RequestMapping("/find-drugRecord")
    public List<LyhDrugRecord> findAll(){
      return   drugRecordService.findAll();
    }

}
