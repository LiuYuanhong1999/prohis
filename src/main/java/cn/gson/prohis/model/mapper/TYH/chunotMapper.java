package cn.gson.prohis.model.mapper.TYH;

import cn.gson.prohis.model.pojos.TyhChunotEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface chunotMapper {
    public List<TyhChunotEntity> findchunot(String cha);

    void addchunot(TyhChunotEntity tyhChunotEntity);

    void updatereg(String hosregNum);

    void delchunot(String chuId);

    void updatereg2(String zhuId);
}
