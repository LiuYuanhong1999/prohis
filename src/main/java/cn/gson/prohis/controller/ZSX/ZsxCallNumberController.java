package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.ZsxCallNumber;
import cn.gson.prohis.model.service.ZSX.ZsxCallNumberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ZsxCallNumberController {
    @Resource
    ZsxCallNumberService callNumberService;

    @RequestMapping("/find-callNumber")
    public List<ZsxCallNumber> findCallNumber(){
        return callNumberService.findCallNumber();
    }

    @RequestMapping("/update-state")
    public void updateState(String registrationNumber){
        callNumberService.updateState(registrationNumber);
    }
}
