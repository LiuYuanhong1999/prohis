package cn.gson.prohis.controller.LYH;


import cn.gson.prohis.model.pojos.LyhAuditEntity;
import cn.gson.prohis.model.pojos.LyhReportEntity;
import cn.gson.prohis.model.service.LYH.LyhReportService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LyhReportController {

    @Resource
    LyhReportService reportService;




    @PostMapping("/add-report")
    public void insertByAll(@RequestBody LyhAuditEntity report){


        reportService.insertAll(report);
    }


    @RequestMapping("/find-report")
    public List<LyhReportEntity> findAll(Integer reportState){
        return reportService.findAll(reportState);
    }


    @RequestMapping("/find-report2")
    public List<LyhReportEntity> findAll2(Integer reportState){
        return reportService.findAll2();
    }

    @RequestMapping("/find-audit4")
    public List<LyhAuditEntity> findAll4(){
        return reportService.findAll3();
    }

    @RequestMapping("/update-report")
    public void updateById(Integer reportState,Integer reportId){
        reportService.updateById(reportState, reportId);
    }


    @RequestMapping("/update-reportNumber")
    public void updateByReport(String procurementId,Integer drugId,Integer numbers){

        reportService.updateByReport(procurementId, drugId, numbers);


    }
}
