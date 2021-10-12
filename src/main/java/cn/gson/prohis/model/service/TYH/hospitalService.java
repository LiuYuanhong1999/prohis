package cn.gson.prohis.model.service.TYH;

import cn.gson.prohis.model.mapper.TYH.hosnotMapper;
import cn.gson.prohis.model.mapper.TYH.hospitalMapper;
import cn.gson.prohis.model.pojos.TyhHosnotEntity;
import cn.gson.prohis.model.pojos.TyhHospitalEntity;
import cn.gson.prohis.model.pojos.cwglVo;
import cn.gson.prohis.model.pojos.rzVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class hospitalService {
    @Resource
    hospitalMapper hospitalMapper;

    @Resource
    hosnotMapper hosnotMapper;

    public List<TyhHospitalEntity> findHospital(Integer id){
        return hospitalMapper.findHospital(id);
    }

    public List<TyhHospitalEntity> findHospital1(){
        return hospitalMapper.findHospital1();
    }

    public void addcw(cwglVo cwglVo) {
        if (cwglVo.getInpId()==0){
            hospitalMapper.addcw(cwglVo);

            int j = 1;
            for(int i = 0;i < cwglVo.getInpNumber();i++){
                String k = j+"号病床";
                TyhHospitalEntity tyhHospitalEntity = new TyhHospitalEntity();
                tyhHospitalEntity.setHospitalName(k);
                tyhHospitalEntity.setHospitalPrice(cwglVo.getInpPrice());
                tyhHospitalEntity.setInpId(cwglVo.getInpId());
                hospitalMapper.addcwx(tyhHospitalEntity);
                j++;
            }
        }else{
            hospitalMapper.updatecw1(cwglVo);
        }

    }

    public String addcwxq(TyhHospitalEntity tyhHospitalEntity) {
        if (tyhHospitalEntity.getHospitalId()==0){
            hospitalMapper.addcwx(tyhHospitalEntity);
            hospitalMapper.updatacwx(tyhHospitalEntity.getInpId());
            return "新增成功";
        }else{
            hospitalMapper.updatecw(tyhHospitalEntity);
            return "修改成功";
        }
    }

    public void updateRz(rzVo rzVo) {
        hospitalMapper.updaterz1(rzVo.getHospitalId());
        hospitalMapper.updaterz2(rzVo.getInpId());
        hospitalMapper.updaterz3(rzVo);
    }

    public List<TyhHosnotEntity> findbrhos() {
        return hosnotMapper.findbrhos();
    }
}
