package cn.gson.prohis.model.service.LYH;

import cn.gson.prohis.model.mapper.LYH.LyhDrugStoreDetailsMapper;
import cn.gson.prohis.model.mapper.LYH.LyhDrugStoreMapper;
import cn.gson.prohis.model.pojos.DrugStoreVo;
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

    public List<LyhDrugstoreEntity> findAll(){
        return bs.findAll();
    }


public void updateById(String json){
    System.out.println(json);
//        List<DrugStoreVo> p= JSONObject.parseArray(json,DrugStoreVo.class);
    List<DrugStoreVo> p = JSONObject.parseArray(json, DrugStoreVo.class);
    System.out.println(p);

    System.out.println(p.toString());
    for (DrugStoreVo vo : p) {
    bs.updateById(vo.getNumbers(),vo.getProcurementId(),vo.getDrugId());

        LyhDrugStoreDetailsEntity detailsEntity=new LyhDrugStoreDetailsEntity();

        detailsEntity.setDrugId(vo.getDrugId());
        detailsEntity.setNumbers(vo.getNumbers());
       detailsEntity.setProcurementId(vo.getProcurementId());
        ds.insertDetails(detailsEntity);
    }



//        bs.updateById(numbers,procurementId,drugId);
}


//    public int updateById(Map<String,Object> map){
//
//        return bs.updateById(map);
//    }

//    public int updateById(List<LyhDrugstoreEntity> list){
//        return bs.updateById(list);
//    }

//    public void updateById(List<LyhDrugstoreEntity> lyhDrugstoreEntities){
//        for (LyhDrugstoreEntity lyhDrugstoreEntity : lyhDrugstoreEntities) {
//            for (LyhDrugstoreEntity drugstoreEntity : lyhDrugstoreEntities) {
//
//                drugstoreEntity.
//            }
//        }
//        bs.updateById();
//    }
}
