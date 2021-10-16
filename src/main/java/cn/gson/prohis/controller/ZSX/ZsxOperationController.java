package cn.gson.prohis.controller.ZSX;

import cn.gson.prohis.model.pojos.ZsxOperation;
import cn.gson.prohis.model.service.ZSX.ZsxOperationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ZsxOperationController {
    @Resource
    ZsxOperationService operationService;

    @RequestMapping("/find_operation")
    public List<ZsxOperation> findOperation(){
        return operationService.findOperation();
    }
}
