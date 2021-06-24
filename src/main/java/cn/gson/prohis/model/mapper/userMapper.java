package cn.gson.prohis.model.mapper;



import cn.gson.prohis.model.pojos.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userMapper {

    public Users findByUser(String userName);
}
