package cn.gson.prohis.controller.YXJ;

import cn.gson.prohis.model.mapper.YXJ.YxjRecordMapper;
import cn.gson.prohis.model.pojos.YxjPhysical;
import cn.gson.prohis.model.pojos.YxjRecord;
import cn.gson.prohis.model.service.YXJ.YxjRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class YxjRecordController {
    @Autowired
    YxjRecordService yxjRecordService;

    /**
     * 查询所有体检记录
     * @return
     */
    @RequestMapping("/allRecord")
    public List<YxjRecord> allRecord(){return yxjRecordService.allRecord();}

    /**
     * 新增体检记录
     * @param yxjRecord
     */
//    @RequestMapping("/addRecord")
//    public void addRecord(@RequestBody YxjRecord yxjRecord){yxjRecordService.addRecord(yxjRecord);}

    /**
     * 修改体检记录
     * @param yxjRecord
     */
    @RequestMapping("/updateRecord")
    public void updateRecord(@RequestBody YxjRecord yxjRecord){yxjRecordService.updateRecord(yxjRecord);}

    /**
     * 根据Id删除记录
     * @param recordId
     */
//    @RequestMapping("/delRecord")
//    public void delRecord(@RequestBody YxjRecord recordId){yxjRecordService.delRecord(recordId.getRecordId());}

    /**
     * 查询体检类别表
     * @return
     */
    @RequestMapping("/selPhysical")
    public List<YxjPhysical> selPhysical(){return yxjRecordService.selPhysical();}

    /**
     * 根据类别表id查询数据
     * @param phId
     * @return
     */
    @RequestMapping("/selPhId")
    public YxjPhysical selPhId(Integer phId){return yxjRecordService.selPhId(phId);}

}
