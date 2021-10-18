package cn.gson.prohis.controller.LYH;


import cn.gson.prohis.model.pojos.LyhAuditEntity;
import cn.gson.prohis.model.service.LYH.LyhAuditService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LyhAuditController {

    @Resource
    LyhAuditService bs;


    @RequestMapping("/find-audit")
    public List<LyhAuditEntity> findAll(@RequestBody LyhAuditEntity auditEntity){
        return bs.findAll(auditEntity);
    }

    @RequestMapping("/find-audit2")
    public List<LyhAuditEntity> findAll2(@RequestBody LyhAuditEntity auditEntity){
        return bs.findAll2(auditEntity);
    }

    @PostMapping("/add-audit")
    public AjaxResult insertAudit(@RequestBody List<LyhAuditEntity> list){

        bs.insertAudit(list);
        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("sucess");
    }


    @RequestMapping("/update-audit")
    public AjaxResult updateById(Integer auditState,Integer auditId){

        bs.updateById(auditState, auditId);
        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("sucess");



    }

}
