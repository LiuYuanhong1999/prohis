package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.ZsxPrescription;
import cn.gson.prohis.model.pojos.ZsxPrescriptionVo;
import cn.gson.prohis.model.pojos.ZsxRegistration;
import cn.gson.prohis.model.service.ZSX.ZsxPrescriptionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ZsxPrescriptionController {
    @Resource
    ZsxPrescriptionService prescriptionService;

    @RequestMapping("/find-prescription")
    public List<ZsxPrescription> findPrescription(){
        return prescriptionService.findPrescription();
    }

    @RequestMapping("/find-registration")
    public List<ZsxRegistration> findRegistrationState(){
        return prescriptionService.findRegistrationState();
    }

    @PostMapping("/add-prescription")
    public void addPrescription(@RequestBody ZsxPrescriptionVo prescription){
        prescriptionService.addPrescription(prescription);
    }

}
