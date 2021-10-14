package cn.gson.prohis.model.mapper.ZSX;

import cn.gson.prohis.model.pojos.ZsxCharge;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZsxChargeMapper {

    public List<ZsxCharge> findByCharge();
//挂号收费新增
    void addChargeRegistration(ZsxCharge charge);
//处方收费新增
    void addChargePrescription(ZsxCharge charge);
}
