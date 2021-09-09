package cn.gson.prohis.controller.LYH;


import cn.gson.prohis.model.pojos.LyhAllotRecordEntity;
import cn.gson.prohis.model.service.LYH.LyhAllotRecordService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LyhAllotRecordController {

    @Resource
    LyhAllotRecordService bs;


    @RequestMapping("/find-AllotRecord")
    public List<LyhAllotRecordEntity> findAll(){
        return bs.findAll();
    }


}
