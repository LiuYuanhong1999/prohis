package cn.gson.prohis.model.mapper.TYH;

import cn.gson.prohis.model.pojos.TyhExecuteEntity;
import cn.gson.prohis.model.pojos.TyhExecutedelEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface exeMapper {
    public List<TyhExecuteEntity> findExecute();

    List<TyhExecutedelEntity> findExecutedel(String id);

    void updata1(String id);

    void updata2(String id);

    List<TyhExecuteEntity> findExecute2();

    List<TyhExecuteEntity> findJie(Integer id);
}
