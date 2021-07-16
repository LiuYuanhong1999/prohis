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

    public void addRegistration(ZsxRegistration registration){
        registrationMapper.addRegistration(registration);
    }

    public void updateRegistration(ZsxRegistration registration){
        registrationMapper.updateRegistration(registration);
    }
}
