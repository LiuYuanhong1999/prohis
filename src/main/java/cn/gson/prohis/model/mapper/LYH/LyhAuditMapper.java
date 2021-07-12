package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhAuditEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LyhAuditMapper {

    public List<LyhAuditEntity> findAll();


    public int insertAudit(List<LyhAuditEntity> list);



    public int updateById(Map<String,Object> map);
}
