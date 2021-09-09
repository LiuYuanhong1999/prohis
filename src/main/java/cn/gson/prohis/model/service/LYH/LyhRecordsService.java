package cn.gson.prohis.model.service.LYH;


import cn.gson.prohis.model.mapper.LYH.LyhRecordsMapper;
import cn.gson.prohis.model.pojos.LyhRecordsEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyhRecordsService {

    @Resource
    LyhRecordsMapper recordsMapper;



    public void insertById(int recordsState,String allotId ){
        recordsMapper.insertById(recordsState, allotId);
    }


    public List<LyhRecordsEntity> findAll(){
        return recordsMapper.findAll();
    }


}
