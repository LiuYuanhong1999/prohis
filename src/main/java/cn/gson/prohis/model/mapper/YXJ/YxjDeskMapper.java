package cn.gson.prohis.model.mapper.YXJ;

import cn.gson.prohis.model.pojos.YxjDesk;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YxjDeskMapper {

    /**
     * 查询所有科室
     * @return
     */
    List<YxjDesk> selDesk();

    /**
     * 新增科室
     * @param yxjDesk
     */
    void addDesk(YxjDesk yxjDesk);

    /**
     * 修改科室
     * @param yxjDesk
     */
    void updateDesk(YxjDesk yxjDesk);

    /**
     * 根据id删除科室
     */
    void delDesk(Integer deskId);

}
