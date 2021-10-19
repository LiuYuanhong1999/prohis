package cn.gson.prohis.model.mapper.ZSX;

import cn.gson.prohis.model.pojos.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZsxSurgeryForMapper {

    List<ZsxSurgeryFor> findPrescription();

    List<ZsxSurgeryFor> findRecipe();

    List<ZsxPrescriptionDetails> selectPrescription();

    List<TyhRecipedetailEntity> selectRecipe();

    void addPrescription(ZsxSurgeryFor surgeryFor);
    void updatePrescription(ZsxSurgeryFor surgeryFor);

    void addRecipe(ZsxSurgeryFor surgeryFor);
    void updateRecipe(ZsxSurgeryFor surgeryFor);

    void updateSurgeryForStaff(String surgeryForNumber);
}
