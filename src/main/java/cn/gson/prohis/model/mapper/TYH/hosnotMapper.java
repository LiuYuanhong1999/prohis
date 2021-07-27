package cn.gson.prohis.model.mapper.TYH;

import cn.gson.prohis.model.pojos.TyhHosnotEntity;
import cn.gson.prohis.model.pojos.YxjDeskEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface hosnotMapper {
    public List<TyhHosnotEntity> findAllnot();

    List<YxjDeskEntity> finddesk();

    void addbr(TyhHosnotEntity tyhHosnotEntity);

    void addhosnot(TyhHosnotEntity tyhHosnotEntity);

    void updatemz(Integer registrationId);
}
