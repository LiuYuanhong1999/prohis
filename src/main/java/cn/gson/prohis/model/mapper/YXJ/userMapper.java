package cn.gson.prohis.model.mapper.YXJ;



import cn.gson.prohis.model.pojos.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userMapper {

    public Users findByUser(String userName);
}
