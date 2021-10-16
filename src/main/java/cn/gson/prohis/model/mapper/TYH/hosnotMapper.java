package cn.gson.prohis.model.mapper.TYH;

import cn.gson.prohis.model.pojos.TyhHosnotEntity;
import cn.gson.prohis.model.pojos.YxjDeskEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface hosnotMapper {
    public List<TyhHosnotEntity> findAllnot(String cha, String cha2);

    List<YxjDeskEntity> finddesk();

    void addbr(TyhHosnotEntity tyhHosnotEntity);

    void addhosnot(TyhHosnotEntity tyhHosnotEntity);

    void updatemz(Integer registrationId);

    List<TyhHosnotEntity> findbrhos();
}
