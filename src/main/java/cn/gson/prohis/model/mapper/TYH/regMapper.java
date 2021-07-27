package cn.gson.prohis.model.mapper.TYH;

import cn.gson.prohis.model.pojos.TyhHosnotEntity;
import cn.gson.prohis.model.pojos.TyhHosregEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface regMapper {
    public List<TyhHosregEntity> findAll(String cha,String cha2);

    public List<TyhHosnotEntity> findnot();

    TyhHosnotEntity findreg(String num);

    void addreg(TyhHosregEntity tyhHosregEntity);

    void updatenot(String hosnotNum);

    void suoding(String num);

    void jiesuo(String num);

    public List<TyhHosregEntity> findchureg();

    TyhHosregEntity findchureg2(String num);

    public List<TyhHosregEntity> chufangbr();
}
