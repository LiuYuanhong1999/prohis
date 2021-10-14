package cn.gson.prohis.model.mapper.ZSX;

import cn.gson.prohis.model.pojos.YxjDesk;
import cn.gson.prohis.model.pojos.ZsxPatientData;
import cn.gson.prohis.model.pojos.ZsxRegistration;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZsxRegistrationMapper {
//查询全部的挂号单
    public List<ZsxRegistration> findByRegistration();

    public List<ZsxRegistration> findRegei();

    ZsxRegistration findRegei2(Integer num);

    void addRegistration(ZsxRegistration registration);

    void updateRegistration(ZsxRegistration registration);

    List<YxjDesk> selectDesk();

    List<ZsxPatientData> selectPatient();
    List<ZsxPatientData> findByPatientId(String medicalCardNumber);
}
