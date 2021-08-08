package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxMedicalCardMapper;
import cn.gson.prohis.model.pojos.ZsxMedicalCard;
import cn.gson.prohis.model.pojos.ZsxMedicalCardRecord;
import cn.gson.prohis.model.pojos.ZsxPatientData;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.sql.SQLOutput;
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
            System.out.println(patientData);
            //病人中诊疗卡编号赋值
            patientData.setMedicalCardNumber(patientData.getMedicalCard().getMedicalCardNumber());
            medicalCardMapper.addPatient(patientData);

            medicalCardMapper.addMedicalCard(patientData);
        }else {
            patientData.setMedicalCardNumber(patientData.getMedicalCard().getMedicalCardNumber());
            medicalCardMapper.updatePatient(patientData);
            medicalCardMapper.updateMedicalCard(patientData);
        }
    }

    public void addMedicalCardRecord(ZsxMedicalCardRecord medicalCardRecord){
        //诊疗卡充值记录编号赋值
        Timestamp time = new Timestamp(System.currentTimeMillis());
        medicalCardRecord.setMedicalCardTime(time);
        medicalCardMapper.addMedicalCardRecord(medicalCardRecord);

        medicalCardMapper.updateBalance(medicalCardRecord);
    }
}
