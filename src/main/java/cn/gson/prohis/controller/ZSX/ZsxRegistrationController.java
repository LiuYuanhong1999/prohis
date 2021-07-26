package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.ZsxRegistration;
import cn.gson.prohis.model.service.ZSX.ZsxRegistrationService;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping("/save-registration")
    public void saveRegistration(@RequestBody ZsxRegistration registration){
        registrationService.saveRegistration(registration);
    }

}
