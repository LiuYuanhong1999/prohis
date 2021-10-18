package cn.gson.prohis.model.mapper.LYH;

import cn.gson.prohis.model.pojos.LyhAuditEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface LyhAuditMapper {

    public List<LyhAuditEntity> findAll(LyhAuditEntity auditEntity);

    public List<LyhAuditEntity> findAll2();
    public List<LyhAuditEntity> findAll3(LyhAuditEntity auditEntity);

    public int insertAudit(List<LyhAuditEntity> list);



    public void updateById(Integer auditState,Integer auditId);
}
