package cn.gson.prohis.model.mapper.ZSX;

import cn.gson.prohis.model.pojos.ZsxMedicalCard;
import cn.gson.prohis.model.pojos.ZsxMedicalCardRecord;
import cn.gson.prohis.model.pojos.ZsxPatientData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZsxMedicalCardMapper {

//    查询所有的诊疗卡
    public List<ZsxPatientData> findByMedicalCard();

//新增病人
    void addPatient(ZsxPatientData patientData);
//新增诊疗卡
    void addMedicalCard(ZsxPatientData medicalCard);
//新增诊疗卡充值记录
    void addMedicalCardRecord(ZsxMedicalCardRecord medicalCardRecord);
//修改病人
    void updatePatient(ZsxPatientData patientData);
//修改诊疗卡
    void updateMedicalCard(ZsxPatientData medicalCard);
//修改余额
    void updateBalance(ZsxMedicalCardRecord medicalCardRecord);

}
