package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxMedicalCardMapper;
import cn.gson.prohis.model.pojos.ZsxMedicalCard;
import cn.gson.prohis.model.pojos.ZsxMedicalCardRecord;
import cn.gson.prohis.model.pojos.ZsxPatientData;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Service
public class ZsxMedicalCardService {
    @Resource
    ZsxMedicalCardMapper medicalCardMapper;

    public List<ZsxPatientData> findByMedicalCard(){
        return medicalCardMapper.findByMedicalCard();
    }

    public void saveMedicalCard(ZsxPatientData patientData){
        if (patientData.getPatientDataId()==null || patientData.getPatientDataId().equals("")){
            //病人中诊疗卡编号赋值
            patientData.setMedicalCardNumber(patientData.getMedicalCard().getMedicalCardNumber());
            medicalCardMapper.addPatient(patientData);
            //诊疗卡充值记录编号赋值
            Timestamp time = new Timestamp(System.currentTimeMillis());
            ZsxMedicalCardRecord medicalCardRecord = new ZsxMedicalCardRecord();
            medicalCardRecord.setMedicalCardNumber(patientData.getMedicalCard().getMedicalCardNumber());
            medicalCardRecord.setMedicalCardTime(time);
            medicalCardMapper.addMedicalCardRecords(medicalCardRecord);

            ZsxMedicalCard medicalCard = new ZsxMedicalCard();
            medicalCard.setMedicalCardPassword(patientData.getMedicalCard().getMedicalCardPassword());
            medicalCard.setMedicalCardNumber(patientData.getMedicalCard().getMedicalCardNumber());
            medicalCard.setMedicalCardBalance(patientData.getMedicalCard().getMedicalCardBalance());
            medicalCardMapper.addMedicalCard(medicalCard);
        }else {
            patientData.setMedicalCardNumber(patientData.getMedicalCard().getMedicalCardNumber());
            medicalCardMapper.updatePatient(patientData);

            ZsxMedicalCard medicalCard = new ZsxMedicalCard();
            medicalCard.setMedicalCardPassword(patientData.getMedicalCard().getMedicalCardPassword());
            medicalCard.setMedicalCardNumber(patientData.getMedicalCard().getMedicalCardNumber());
            medicalCard.setMedicalCardBalance(patientData.getMedicalCard().getMedicalCardBalance());
            medicalCardMapper.updateMedicalCard(medicalCard);
        }
    }
}
