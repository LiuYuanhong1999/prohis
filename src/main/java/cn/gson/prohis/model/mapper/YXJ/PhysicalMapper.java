package cn.gson.prohis.model.mapper.YXJ;

import cn.gson.prohis.model.pojos.Physical;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 体检类别接口
 */
@Mapper
public interface PhysicalMapper {

    /**
     * / 查询所有类别
     * @return
     */
    List<Physical> findByPhysical();

    /**
     * / 新增体检类别
     * @param physical
     */
    void addPhysical(Physical physical);

    /**
     * / 修改体检类别
     * @param physical
     */
    void updatePhysical(Physical physical);
}
