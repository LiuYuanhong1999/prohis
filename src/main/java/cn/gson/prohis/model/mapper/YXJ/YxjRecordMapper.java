package cn.gson.prohis.model.mapper.YXJ;

import cn.gson.prohis.model.pojos.YxjPhysical;
import cn.gson.prohis.model.pojos.YxjRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YxjRecordMapper {

    /**
     * 查询所有记录
     * @return
     */
    List<YxjRecord> allRecord();

    /**
     * 新增体检记录
     * @param yxjRecord
     */
    void addRecord(YxjRecord yxjRecord);

    /**
     * 修改体检记录
     * @param yxjRecord
     */
    void updateRecord(YxjRecord yxjRecord);

    /**
     * 根据ID删除体检记录
     * @param recordId
     */
    void delRecord(Integer recordId);

    /**
     * 查询类别表
     * @return
     */
    List<YxjPhysical> selPhysical();


    /**
     * 根据ID查询 体检类别表数据
     * @return
     */
    YxjPhysical selPhId(Integer phId);
}
