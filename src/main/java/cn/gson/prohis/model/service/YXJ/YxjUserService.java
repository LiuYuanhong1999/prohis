package cn.gson.prohis.model.service.YXJ;

import cn.gson.prohis.model.mapper.YXJ.YxjUserMapper;
import cn.gson.prohis.model.pojos.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YxjUserService {
    @Autowired
    YxjUserMapper yxjUserMapper;

    /**
     * 查询用户
     * @param users
     * @return
     */
    public List<Users> allUser(Users users){return yxjUserMapper.allUser(users);}
}
