package cn.gson.prohis.model.service.YXJ;

import cn.gson.prohis.model.mapper.YXJ.YxjRecordMapper;
import cn.gson.prohis.model.pojos.YxjPhysical;
import cn.gson.prohis.model.pojos.YxjRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YxjRecordService {
    @Autowired
    YxjRecordMapper yxjRecordMapper;

    /**
     * 查询所有记录
     * @return
     */
    public List<YxjRecord> allRecord(){return yxjRecordMapper.allRecord();}

    /**
     * 新增体检记录
     * @param yxjRecord
     */
    public void addRecord(YxjRecord yxjRecord){
        if(yxjRecord.getRecordId()!=null){
            yxjRecordMapper.updateRecord(yxjRecord);
        }else {
            yxjRecordMapper.addRecord(yxjRecord);
        }

    }


    /**
     * 修改体检记录
     * @param yxjRecord
     */
    public void updateRecord(YxjRecord yxjRecord){yxjRecordMapper.updateRecord(yxjRecord);}

    /**
     * 根据ID删除
     * @param recordId
     */
    public void delRecord(Integer recordId){yxjRecordMapper.delRecord(recordId);}

    /**
     * 查询体检类别表
     * @return
     */
    public List<YxjPhysical> selPhysical(){return yxjRecordMapper.selPhysical();}

    /**
     * 根据id 查询数据
     * @param phId
     * @return
     */
    public YxjPhysical selPhId(Integer phId){return yxjRecordMapper.selPhId(phId);}
}
