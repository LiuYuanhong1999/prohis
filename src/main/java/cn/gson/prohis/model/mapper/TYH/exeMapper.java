package cn.gson.prohis.model.mapper.TYH;

import cn.gson.prohis.model.pojos.TyhExecuteEntity;
import cn.gson.prohis.model.pojos.TyhExecutedelEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface exeMapper {
    public List<TyhExecuteEntity> findExecute();

    List<TyhExecutedelEntity> findExecutedel(String id);

    //查询发药中的医嘱
    List<TyhExecuteEntity> findExecute2();

    void updata1(String id);

    void updata2(String id);

    void update3(String id);
}
