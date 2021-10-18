package cn.gson.prohis.model.service.TYH;

import cn.gson.prohis.model.mapper.TYH.JieMapper;
import cn.gson.prohis.model.pojos.TyhJie;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JieService {
    @Resource
    JieMapper jieMapper;

    public List<TyhJie> findJie(Integer id){
        return jieMapper.findJie(id);
    }

    public List<TyhJie> findJiex(String id) {
        return jieMapper.findJiex(id);
    }
}
