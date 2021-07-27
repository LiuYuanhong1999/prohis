package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.YxjDesk;
import cn.gson.prohis.model.pojos.ZsxPatientData;
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

    @RequestMapping("/select-desk")
    @ResponseBody
    public List<YxjDesk> selectDesk(){
        return registrationService.selectDesk();
    }

    @RequestMapping("/select-patient")
    @ResponseBody
    public List<ZsxPatientData> selectPatient(){
        return registrationService.selectPatient();
    }

    @RequestMapping("/find-by-patient")
    @ResponseBody
    public List<ZsxPatientData> findByPatientId(String medicalCardNumber){
        return registrationService.findByPatientId(medicalCardNumber);
    }

}
