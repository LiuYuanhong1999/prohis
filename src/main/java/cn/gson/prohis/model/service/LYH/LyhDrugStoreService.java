package cn.gson.prohis.model.service.LYH;

import cn.gson.prohis.model.mapper.LYH.*;
import cn.gson.prohis.model.pojos.*;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class LyhDrugStoreService {

    @Resource
    private LyhDrugStoreMapper bs;

    @Resource
    private LyhDrugStoreDetailsMapper ds;


    @Resource
    private LyhAllotRecordMapper allotRecordMapper;

    @Resource
    private LyhDrugRecordMapper recordMapper;

    @Resource
    LyhPharmacyRecordMapper pharmacyRecordMapper;



    public List<LyhDrugstoreEntity> findAll(LyhDrugstoreEntity drugstoreEntity){



        return bs.findAll(drugstoreEntity);
    }





    public List<LyhDrugstoreEntity> findByName(int drugId){
        return bs.findByName(drugId);
    }

//入库时进行药品的数量修改，（如果没有获取到药品表里的药品信息那么就会新增反之修改），新增药库药品详细记录信息并且新增入库记录
public void updateById(String json){
    System.out.println(json);
    List<DrugStoreVo> p = JSONObject.parseArray(json, DrugStoreVo.class);
    for (DrugStoreVo vo : p) {
        List<LyhDrugstoreEntity> s=bs.findByName(vo.getDrugId());
            if (s.isEmpty()){
                LyhDrugstoreEntity lyhDrugstoreEntity=new LyhDrugstoreEntity();
                lyhDrugstoreEntity.setDrugId(vo.getDrugId());
                lyhDrugstoreEntity.setDrugstoreNumber(vo.getNumbers());
                lyhDrugstoreEntity.setProcurementId(vo.getProcurementId());
                lyhDrugstoreEntity.setPiCi(vo.getPiCi());
                bs.insertDrugStore(lyhDrugstoreEntity);

                LyhDrugStoreDetailsEntity detailsEntity=new LyhDrugStoreDetailsEntity();

                detailsEntity.setDrugId(vo.getDrugId());
                detailsEntity.setNumbers(vo.getNumbers());
                detailsEntity.setProcurementId(vo.getProcurementId());
                detailsEntity.setPiCi(vo.getPiCi());
                ds.insertDetails(detailsEntity);


                LyhDrugRecord record=new LyhDrugRecord();
                record.setDrugId(vo.getDrugId());
                record.setNumbers(vo.getNumbers());
                record.setPiCi(vo.getPiCi());
                record.setProcurementId(vo.getProcurementId());
                recordMapper.insertDrugRecord(record);


            }else {

                bs.updateById(vo.getNumbers(),vo.getDrugId());
                LyhDrugStoreDetailsEntity detailsEntity=new LyhDrugStoreDetailsEntity();
                detailsEntity.setDrugId(vo.getDrugId());
                detailsEntity.setNumbers(vo.getNumbers());
                detailsEntity.setProcurementId(vo.getProcurementId());
                detailsEntity.setPiCi(vo.getPiCi());
                ds.insertDetails(detailsEntity);

                LyhDrugRecord record=new LyhDrugRecord();
                record.setDrugId(vo.getDrugId());
                record.setNumbers(vo.getNumbers());
                record.setPiCi(vo.getPiCi());
                record.setProcurementId(vo.getProcurementId());
                recordMapper.insertDrugRecord(record);

            }

    }

}

//同时新增库存调拨记录和修改库存数量
public void update(Integer numbers,Integer drugId,String procurementId,String allotId){

    LyhAllotRecordEntity allotRecordEntity=new LyhAllotRecordEntity();
        allotRecordEntity.setAllotId(allotId);
        allotRecordEntity.setDrugId(drugId);
        allotRecordEntity.setRecordNumbers(numbers);
        allotRecordMapper.insertAllotRecord(allotRecordEntity);


    System.out.println(numbers+"-----------------------"+procurementId+"--------------------"+drugId+"---------------------"+allotId);
        bs.updateById2(numbers, drugId, procurementId);

        List<LyhDrugRecord> drugRecords=recordMapper.findByName(drugId);

        for (LyhDrugRecord record : drugRecords) {
        if (record.getNumbers()>numbers){
            recordMapper.updateByPiCi(drugId, numbers);

            Timestamp d = new Timestamp(System.currentTimeMillis());
            LyhPharmacyRecord records=new LyhPharmacyRecord();
                    records.setDrugId(drugId);
                    records.setRecordDate(d);
                    records.setNumbers(numbers);
                    records.setPiCi(record.getPiCi());

                    pharmacyRecordMapper.insertPharmacyRecord(records);
        }else {
            System.out.println("--------------------------------------------------wwwwww-11111111111111111111111111111111111111");
        }
    }




}



}
