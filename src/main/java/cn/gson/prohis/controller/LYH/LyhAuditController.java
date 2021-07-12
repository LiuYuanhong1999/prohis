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
    public List<LyhAuditEntity> findAll(){
        return bs.findAll();
    }



    @PostMapping("/add-audit")
    public AjaxResult insertAudit(@RequestBody List<LyhAuditEntity> list){
        bs.insertAudit(list);
        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("sucess");
    }


    @RequestMapping("/update-audit")
    public AjaxResult updateById(String auditState,String auditId){
        System.out.println(auditState+"--------------------------------------");
        System.out.println(auditId);
        Map<String,Object> map=new HashMap<>();
        List<String> idList= Arrays.asList(auditId.split(","));
        map.put("auditState",auditState);
        map.put("auditId",idList);
        bs.updateById(map);
        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("sucess");



    }

}
