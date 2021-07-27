package cn.gson.prohis.model.mapper.YXJ;

import cn.gson.prohis.model.pojos.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YxjUserMapper {

    /**
     * 查询用户
     * @return
     */
    List<Users> allUser(Users users);

}
