package cn.gson.prohis.model.mapper.LYH;

import generator.Lyhprocurement;

public interface LyhprocurementDao {
    int deleteByPrimaryKey(Integer procurementId);

    int insert(Lyhprocurement record);

    int insertSelective(Lyhprocurement record);

    Lyhprocurement selectByPrimaryKey(Integer procurementId);

    int updateByPrimaryKeySelective(Lyhprocurement record);

    int updateByPrimaryKey(Lyhprocurement record);
}