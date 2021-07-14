package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxRegistrationMapper;
import cn.gson.prohis.model.pojos.ZsxRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZsxRegistrationService {
    @Autowired
    ZsxRegistrationMapper registration;

    public List<ZsxRegistration> findByRegistration(){
        return registration.findByRegistration();
    }
}
