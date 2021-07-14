package cn.gson.prohis.model.mapper.ZSX;

import cn.gson.prohis.model.pojos.ZsxPatientData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZsxMedicalCardMapper {

//    查询所有的诊疗卡
    public List<ZsxPatientData> findByMedicalCard();
}
