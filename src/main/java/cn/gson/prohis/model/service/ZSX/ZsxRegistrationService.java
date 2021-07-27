package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxRegistrationMapper;
import cn.gson.prohis.model.pojos.YxjDesk;
import cn.gson.prohis.model.pojos.ZsxPatientData;
import cn.gson.prohis.model.pojos.ZsxRegistration;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ZsxRegistrationService {
    @Resource
    ZsxRegistrationMapper registrationMapper;

    public List<ZsxRegistration> findByRegistration(){
        return registrationMapper.findByRegistration();
    }


    public void saveRegistration(ZsxRegistration registration){
        if(registration.getRegistrationId()==null || registration.getRegistrationId().equals("")){
            registration.setDoctot(1);
            registration.setRegistrationFee("5");
            registration.setRegistrationState(0);
            registrationMapper.addRegistration(registration);
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
