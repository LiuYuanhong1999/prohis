package cn.gson.prohis.model.service.LYH;


import cn.gson.prohis.model.mapper.LYH.LyhCheckDetailsMapper;
import cn.gson.prohis.model.mapper.LYH.LyhCheckMapper;
import cn.gson.prohis.model.pojos.LyhCheckEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LyhCheckService {
    @Resource
    LyhCheckMapper checkMapper;


    @Resource
    LyhCheckDetailsMapper checkDetailsMapper;


//新增盘点主祥表
    public void insertCheck(LyhCheckEntity checkEntity){




    }



}
