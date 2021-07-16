package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.ZsxRegistration;
import cn.gson.prohis.model.service.ZSX.ZsxRegistrationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ZsxRegistrationController {
    @Resource
    ZsxRegistrationService registrationService;

    @RequestMapping("/registration")
    @ResponseBody
    public List<ZsxRegistration> findByRegistration(){
        return registrationService.findByRegistration();
    }

    @RequestMapping("/addRegistration")
    @ResponseBody
    public void addRegistration(ZsxRegistration registration){
        registrationService.addRegistration(registration);
    }

    @RequestMapping("/updateRegistration")
    @ResponseBody
    public void updateRegistration(ZsxRegistration registration){
        registrationService.updateRegistration(registration);
    }
}
