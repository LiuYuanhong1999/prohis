package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxCallNumberMapper;
import cn.gson.prohis.model.mapper.ZSX.ZsxMedicalCardMapper;
import cn.gson.prohis.model.mapper.ZSX.ZsxRegistrationMapper;
import cn.gson.prohis.model.pojos.YxjDesk;
import cn.gson.prohis.model.pojos.ZsxCallNumber;
import cn.gson.prohis.model.pojos.ZsxPatientData;
import cn.gson.prohis.model.pojos.ZsxRegistration;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Service
public class ZsxRegistrationService {
    @Resource
    ZsxRegistrationMapper registrationMapper;
    @Resource
    ZsxCallNumberMapper callNumberMapper;
    @Resource
    ZsxMedicalCardMapper medicalCardMapper;

    public List<ZsxRegistration> findByRegistration(){
        return registrationMapper.findByRegistration();
    }


    public void saveRegistration(ZsxRegistration registration){
            if(registration.getRegistrationId()==null || registration.getRegistrationId().equals("")){
                registration.setPatientDataId(registration.getPatient().getPatientDataId());
                registration.setDoctot(1);
                registration.setRegistrationState(0);
                registration.setRegistrationFee(5.00);
                registrationMapper.addRegistration(registration);
//                if(registration.getRegistrationType() == "普通"){
//                    registration.setRegistrationFee(5.00);
//                    registrationMapper.addRegistration(registration);
//                }else if(registration.getRegistrationType() == "急诊"){
//                    registration.setRegistrationFee(10.00);
//                    registrationMapper.addRegistration(registration);
//                }else if(registration.getRegistrationType() == "专家门诊"){
//                    registration.setRegistrationFee(15.00);
//                    registrationMapper.addRegistration(registration);
//                }

                ZsxCallNumber callNumber = new ZsxCallNumber();
                Timestamp time = new Timestamp(System.currentTimeMillis());
                callNumber.setRegistrationNumber(registration.getRegistrationNumber());
                callNumber.setCallNumberTime(time);
                callNumberMapper.addCallNumber(callNumber);

                if(registration.getPatient().getMedicalCardNumber() == null){
                    ZsxPatientData patientData = new ZsxPatientData();
                    patientData.setPatientDataCard(registration.getPatient().getPatientDataCard());
                    patientData.setPatientDataName(registration.getPatient().getPatientDataName());
                    patientData.setPatientDataPhone(registration.getPatient().getPatientDataPhone());
                    patientData.setPatientDataSex(registration.getPatient().getPatientDataSex());
                    patientData.setMedicalCardNumber("0");
                    medicalCardMapper.addPatient(patientData);
                }
            }else {
                registrationMapper.updateRegistration(registration);
            }
    }


    public List<YxjDesk> selectDesk(){
        return registrationMapper.selectDesk();
    }

    public List<ZsxPatientData> selectPatient(){
        return registrationMapper.selectPatient();
    }
    public List<ZsxPatientData> findByPatientId(String medicalCardNumber){
        return registrationMapper.findByPatientId(medicalCardNumber);
    }

}
