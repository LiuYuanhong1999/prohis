package cn.gson.prohis.model.mapper.ZSX;

import cn.gson.prohis.model.pojos.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ZsxPrescriptionMapper {
    List<ZsxPrescription> findPrescription();

    List<ZsxPrescriptionDetails> findPrescriptionDetailsDrug(String prescriptionId);

    List<ZsxPrescriptionDetails> findPrescriptionDetailsProject(String prescriptionId);

    List<ZsxRegistration> findRegistrationState();

    void addPrescription(ZsxPrescriptionVo prescription);

    void addPrescriptionDetails(ZsxDrugVo v,@Param("prescriptionId") String prescriptionId);

    void addPrescriptionDetailsProject(ZsxProjectVo v,@Param("prescriptionId") String prescriptionId);
}
