package cn.gson.prohis.model.mapper.TYH;

import cn.gson.prohis.model.pojos.TyhHospitalEntity;
import cn.gson.prohis.model.pojos.cwglVo;
import cn.gson.prohis.model.pojos.rzVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface hospitalMapper {
    public List<TyhHospitalEntity> findHospital(Integer id);

    public List<TyhHospitalEntity> findHospital1();

    void addcw(cwglVo cwglVo);

    void addcwx(TyhHospitalEntity tyhHospitalEntity);

    void updatecw(TyhHospitalEntity tyhHospitalEntity);

    void updatecw1(cwglVo cwglVo);

    void updaterz1(Integer hospitalId);

    void updaterz2(Integer inpId);

    void updaterz3(rzVo rzVo);

    void updatacwx(Integer inpId);
}
