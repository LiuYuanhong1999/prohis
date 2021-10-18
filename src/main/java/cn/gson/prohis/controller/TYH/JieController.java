package cn.gson.prohis.controller.TYH;

import cn.gson.prohis.model.pojos.TyhJie;
import cn.gson.prohis.model.service.TYH.JieService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class JieController {
    @Resource
    JieService jieService;

    @RequestMapping("findall-jie")
    public List<TyhJie> findJie(Integer id){
        return jieService.findJie(id);
    }

    @RequestMapping("findall-jiex")
    public List<TyhJie> findJiex(String id){
        return jieService.findJiex(id);
    }
}
