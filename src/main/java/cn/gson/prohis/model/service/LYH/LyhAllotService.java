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
import java.sql.Timestamp;
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
            Timestamp d = new Timestamp(System.currentTimeMillis());
        allotEntity1.setAllotTime(d);
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
            allotDetailsEntity.setDrugId(entity.getDrugId());
            allotDetailsMapper.insertAllotDetails(allotDetailsEntity);
        }
    }

        public List<LyhAllotEntity> findAllot(){
        return allotMapper.findAll();
}

        //????????????????????????????????????
        public List<LyhPharmacyDetailsEntity> findPharmacy(LyhPharmacyDetailsEntity pharmacyDetailsEntity){

        return detailsMapper.findAll(pharmacyDetailsEntity);

}

        public List<LyhAllotDetailsEntity> findAll(String allotId){
        return allotDetailsMapper.findAll(allotId);
        }


        public int updateById(Map<String,Object> map){

        return allotMapper.updateById(map);
    }

        public List<LyhAllotEntity> findAll2(LyhAllotEntity allotEntity){
            return allotMapper.findAll2(allotEntity);
        }










}
