package cn.gson.prohis.model.mapper.TYH;

import cn.gson.prohis.model.pojos.TyhCashEntity;
import cn.gson.prohis.model.pojos.TyhHosregEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface cashMapper {
    public List<TyhCashEntity> findAll(String cha);

    public List<TyhCashEntity> findTcash(String cha);

    void addcash(TyhCashEntity tyhCashEntity);

    public List<TyhHosregEntity> findnum();

    TyhHosregEntity findnum2(String num);

    void updateyue(Double cashPrice, int id);

    void delcash(String cid);

    void updateyue2(Double price, Integer pid);

    public List<TyhCashEntity> findAllcash(String cha);

    void delTcash(TyhCashEntity s);

    void xiuYue(TyhCashEntity s);
}
