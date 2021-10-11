package cn.gson.prohis.model.service.LYH;

import cn.gson.prohis.model.mapper.LYH.LyhDrugMapper;
import cn.gson.prohis.model.mapper.LYH.LyhPharmacyDetailsMapper;
import cn.gson.prohis.model.mapper.LYH.LyhPharmacyMapper;
import cn.gson.prohis.model.mapper.LYH.LyhPharmacyRecordMapper;
import cn.gson.prohis.model.pojos.LyhPharmacyEntity;
import cn.gson.prohis.model.pojos.LyhPharmacyRecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class LyhPharmacyService {
    @Resource
    LyhPharmacyMapper bs;

    @Resource
    LyhDrugMapper ds;

    @Resource
    LyhPharmacyRecordMapper recordMapper;




    public List<LyhPharmacyEntity> findAll(String drugName,Integer drugState,String drugJixin,String supplierName){
        return bs.findAll(drugName, drugState, drugJixin, supplierName);
    }

    public List<LyhPharmacyEntity> findByName(String pharmacyName){
        return bs.findByName(pharmacyName);
    }


    public void update(Integer number,Integer drugId){
        bs.updateById(number, drugId);
    }

    public void update2(Integer number,Integer drugId){
        bs.updateById2(number, drugId);
    }



    public void insertPharmacy(Integer drugId,Integer numbers,Integer piCi){

        bs.updateById3(numbers, drugId);

        System.out.println("药房+---------------------------------------------------------");
        bs.updateById4(numbers, drugId);


    }


    public void insertDrug(LyhPharmacyEntity lyhPharmacy){

        List<LyhPharmacyEntity> drugId= bs.findByName2(lyhPharmacy.getDrugId());
        if (drugId.isEmpty()){
            bs.insertDrug(lyhPharmacy.getDrugId());
        }else {
            throw new RuntimeException("药品重复");
        }

    }

}
