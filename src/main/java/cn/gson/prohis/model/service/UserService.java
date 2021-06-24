package cn.gson.prohis.model.service;



import cn.gson.prohis.model.mapper.userMapper;
import cn.gson.prohis.model.pojos.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    userMapper bs;


    public Users findAll(String userName){
        return bs.findByUser(userName);
    }
}
