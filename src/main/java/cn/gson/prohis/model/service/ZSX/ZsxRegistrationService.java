package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxRegistrationMapper;
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
            registrationMapper.addRegistration(registration);
        }else {
            registrationMapper.updateRegistration(registration);
        }
    }

}
