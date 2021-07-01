package cn.gson.prohis.model.service.YXJ;



import cn.gson.prohis.model.mapper.YXJ.userMapper;
import cn.gson.prohis.model.pojos.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    userMapper bs;


    public Users findAll(String userName){
        return bs.findByUser(userName);
    }


    public List<Users> findAll(){
        return bs.findAll();
    }


   public int update(Map<String,Object> map){
        return bs.updateById(map);
   }

   public  void deleteById(List<Integer> list){
        bs.deleteById(list);
   }
}
