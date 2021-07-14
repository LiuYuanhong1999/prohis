package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.ZsxRegistration;
import cn.gson.prohis.model.service.ZSX.ZsxRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ZsxRegistrationController {
    @Autowired
    ZsxRegistrationService registrationService;

    @RequestMapping("/registration")
    @ResponseBody
    public List<ZsxRegistration> findByRegistration(){
        return registrationService.findByRegistration();
    }
}
