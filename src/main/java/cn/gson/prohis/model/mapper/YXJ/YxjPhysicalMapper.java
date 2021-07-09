package cn.gson.prohis.model.mapper.YXJ;

import cn.gson.prohis.model.pojos.YxjPhysical;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 体检类别接口
 */
@Mapper
public interface YxjPhysicalMapper {

    /**
     * / 查询所有类别
     * @return
     */
    List<YxjPhysical> findByPhysical();

    /**
     * / 新增体检类别
     * @param physical
     */
    void addPhysical(YxjPhysical physical);

    /**
     * / 修改体检类别
     * @param physical
     */
    void updatePhysical(YxjPhysical physical);

    /**
     * 根据ID删除类别
     * @param phId
     */
    void delPhysical(Integer phId);


}
