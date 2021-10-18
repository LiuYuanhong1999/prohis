package cn.gson.prohis.model.mapper.ZSX;

import cn.gson.prohis.model.pojos.TyhJie;
import cn.gson.prohis.model.pojos.TyhJiex;
import cn.gson.prohis.model.pojos.ZsxOperationNote;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface opernoteMapper {
    List<ZsxOperationNote> findOper(Integer id);

    void addJie(TyhJie jie);

    void addJiex(TyhJiex tyhJiex);

    void updataJie(Integer patientId);

    void updateJie2(Integer patientId);

    void updateJie3(Integer patientId);

    void updateYj(double jiePrice, Integer patientId);

    void addYj(String a, String hosregNum, double b);
}
