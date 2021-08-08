package cn.gson.prohis.controller.TYH;

import cn.gson.prohis.model.pojos.TyhHospitalEntity;
import cn.gson.prohis.model.pojos.cwglVo;
import cn.gson.prohis.model.pojos.rzVo;
import cn.gson.prohis.model.service.TYH.hospitalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class hospitalController {
    @Resource
    hospitalService hospitalService;

    @RequestMapping("find-hospital")
    public List<TyhHospitalEntity> findHospital(Integer id){
        return hospitalService.findHospital(id);
    }

    @RequestMapping("find-hospital1")
    public List<TyhHospitalEntity> findHospital1(){
        return hospitalService.findHospital1();
    }

    @PostMapping("add-cw")
    public void addcw(@RequestBody cwglVo cwglVo){
        hospitalService.addcw(cwglVo);
    }

    @PostMapping("add-cwxq")
    public String addcwxq(@RequestBody TyhHospitalEntity tyhHospitalEntity){
        return hospitalService.addcwxq(tyhHospitalEntity);
    }

    @PostMapping("update-rz")
    public void updateRz(@RequestBody rzVo rzVo){
        hospitalService.updateRz(rzVo);
    }
}
