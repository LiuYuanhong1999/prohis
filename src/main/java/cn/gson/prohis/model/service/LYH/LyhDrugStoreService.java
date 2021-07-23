package cn.gson.prohis.model.service.LYH;

import cn.gson.prohis.model.mapper.LYH.LyhAllotRecordMapper;
import cn.gson.prohis.model.mapper.LYH.LyhDrugStoreDetailsMapper;
import cn.gson.prohis.model.mapper.LYH.LyhDrugStoreMapper;
import cn.gson.prohis.model.pojos.DrugStoreVo;
import cn.gson.prohis.model.pojos.LyhAllotRecordEntity;
import cn.gson.prohis.model.pojos.LyhDrugStoreDetailsEntity;
import cn.gson.prohis.model.pojos.LyhDrugstoreEntity;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    public List<LyhDrugstoreEntity> findAll(Integer drugId,String procurementId){
        return bs.findAll(drugId, procurementId);
    }


    public List<LyhDrugstoreEntity> findByName(int drugId,String procurementId){
        return bs.findByName(drugId,procurementId);
    }


public void updateById(String json){
    System.out.println(json);
    List<DrugStoreVo> p = JSONObject.parseArray(json, DrugStoreVo.class);

    for (DrugStoreVo vo : p) {
        List<LyhDrugstoreEntity> s=bs.findByName(vo.getDrugId(),vo.getProcurementId());
            if (s.isEmpty()){
                System.out.println(vo.getPiCi()+"批次");
                System.out.println(vo.getNumbers()+vo.getDrugId()+"-------qwqwwwwwwwwwwwwwwwwwwwwwwwww");
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

            }else {
                System.out.println("2----------------------------===============================================================");
                bs.updateById(vo.getNumbers(),vo.getProcurementId(),vo.getDrugId());

                LyhDrugStoreDetailsEntity detailsEntity=new LyhDrugStoreDetailsEntity();

                detailsEntity.setDrugId(vo.getDrugId());
                detailsEntity.setNumbers(vo.getNumbers());
                detailsEntity.setProcurementId(vo.getProcurementId());
                detailsEntity.setPiCi(vo.getPiCi());
                ds.insertDetails(detailsEntity);
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
        bs.updateById2(numbers, drugId, procurementId);

}



}
