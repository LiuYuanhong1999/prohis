package cn.gson.prohis.model.mapper.ZSX;

import cn.gson.prohis.model.pojos.ZsxOperatingRoom;
import cn.gson.prohis.model.pojos.ZsxPrescription;
import cn.gson.prohis.model.pojos.ZsxSurgeryFor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZsxSurgeryForMapper {

    List<ZsxSurgeryFor> findPrescription();

    List<ZsxSurgeryFor> findRecipe();

    List<ZsxOperatingRoom> selectOperating();

    List<ZsxPrescription> selectPrescription();

    List<ZsxPrescription> selectPatient(String prescriptionId);

    void addPrescription(ZsxSurgeryFor surgeryFor);

    void addRecipe(ZsxSurgeryFor surgeryFor);
}
