package cn.gson.prohis.model.mapper.YXJ;



import cn.gson.prohis.model.pojos.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface userMapper {

    public Users findByUser(String userName);

    public List<Users> findAll();


    public int updateById(Map<String,Object> map);


    public void deleteById(List<Integer> list);
}
