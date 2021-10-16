package cn.gson.prohis.controller.LYH;


import cn.gson.prohis.model.pojos.LyhPharmacyRecord;
import cn.gson.prohis.model.service.LYH.LyhPharmacyRecordService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LyhPharmacyRecordController {

    @Resource
    LyhPharmacyRecordService recordService;


    @RequestMapping("/find-pharmacyRecord")
    public List<LyhPharmacyRecord> findAll(@RequestBody LyhPharmacyRecord record){
        return recordService.findAll(record);
    }

}
