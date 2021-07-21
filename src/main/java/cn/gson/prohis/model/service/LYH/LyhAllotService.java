package cn.gson.prohis.model.service.LYH;

import cn.gson.prohis.model.mapper.LYH.LyhAllotDetailsMapper;
import cn.gson.prohis.model.mapper.LYH.LyhAllotMapper;
import cn.gson.prohis.model.mapper.LYH.LyhPharmacyDetailsMapper;
import cn.gson.prohis.model.mapper.LYH.LyhPharmacyMapper;
import cn.gson.prohis.model.pojos.LyhAllotDetailsEntity;
import cn.gson.prohis.model.pojos.LyhAllotEntity;
import cn.gson.prohis.model.pojos.LyhPharmacyDetailsEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class LyhAllotService {

    @Resource
    LyhAllotMapper allotMapper;


    @Resource
    LyhPharmacyDetailsMapper detailsMapper;

    @Resource
    LyhPharmacyMapper pharmacyMapper;

    @Resource
    LyhAllotDetailsMapper allotDetailsMapper;

    public void insertAllot(LyhAllotEntity allotEntity){
        LyhAllotEntity allotEntity1=new LyhAllotEntity();
        allotEntity1.setAllotId(allotEntity.getAllotId());

            allotMapper.insertAllot(allotEntity1);
        for (LyhPharmacyDetailsEntity entity : allotEntity.getLyhPharmacyDetailsEntities()) {

            LyhPharmacyDetailsEntity detailsEntity=new LyhPharmacyDetailsEntity();
            detailsEntity.setNumbers(entity.getNumbers());
            detailsEntity.setDrugId(entity.getDrugId());
            detailsEntity.setPharmacyId(entity.getPharmacyId());

            detailsMapper.insertDetails(detailsEntity);


            LyhAllotDetailsEntity allotDetailsEntity=new LyhAllotDetailsEntity();
            allotDetailsEntity.setAllotId(allotEntity.getAllotId());
            allotDetailsEntity.setPharmacyId(entity.getPharmacyId());
            allotDetailsEntity.setNumbers(entity.getNumbers());

            allotDetailsMapper.insertAllotDetails(allotDetailsEntity);
        }
//        for (LyhPharmacyDetailsEntity entity : list) {
//            System.out.println(entity.getNumbers());
//            LyhAllotEntity allotEntity=new LyhAllotEntity();
//            allotEntity.setPharmacyId(entity.getPharmacyId());
//            allotEntity.setDrugId(entity.getDrugId());
//            allotMapper.insertAllot(allotEntity);
//
//
//            LyhPharmacyDetailsEntity detailsEntity=new LyhPharmacyDetailsEntity();
//            System.out.println(detailsEntity.getNumbers());
//            detailsEntity.setNumbers(detailsEntity.getNumbers());
//            detailsEntity.setDrugId(entity.getDrugId());
//            detailsEntity.setPharmacyId(entity.getPharmacyId());
//            detailsMapper.insertDetails(detailsEntity);
//        }
//


    }

public List<LyhAllotEntity> findAllot(){


        return allotMapper.findAll();

}
public List<LyhPharmacyDetailsEntity> findPharmacy(){

        return detailsMapper.findAll();

}

    public int updateById(Map<String,Object> map){

        return allotMapper.updateById(map);
    }


}
