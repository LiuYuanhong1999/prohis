package cn.gson.prohis.model.service.TYH;

import cn.gson.prohis.model.mapper.TYH.hosnotMapper;
import cn.gson.prohis.model.mapper.ZSX.ZsxRegistrationMapper;
import cn.gson.prohis.model.pojos.TyhHosnotEntity;
import cn.gson.prohis.model.pojos.YxjDeskEntity;
import cn.gson.prohis.model.pojos.ZsxRegistration;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class hosnotService {
    @Resource
    hosnotMapper hosnotMapper;
    @Resource
    ZsxRegistrationMapper zsxRegistrationMapper;

    public List<TyhHosnotEntity> findAllnot(String cha, String cha2){
        return hosnotMapper.findAllnot(cha,cha2);
    }

    public List<ZsxRegistration> findRegei(){
        return zsxRegistrationMapper.findRegei();
    }

    public ZsxRegistration findRegei2(Integer num) {
        return zsxRegistrationMapper.findRegei2(num);
    }

    public List<YxjDeskEntity> finddesk() {
        return hosnotMapper.finddesk();
    }

    //住院通知新增
    public void addhosnot(TyhHosnotEntity tyhHosnotEntity) {
        //新增病人表
        hosnotMapper.addbr(tyhHosnotEntity);

        //新增住院通知表
        SimpleDateFormat myFmt = new SimpleDateFormat("yyMMddHHmmssSSS");
        Date date = new Date();
        String a=myFmt.format(date);
        String b="tz";
        tyhHosnotEntity.setHosnotNum(b+a);
        hosnotMapper.addhosnot(tyhHosnotEntity);

        //修改门诊状态
        hosnotMapper.updatemz(tyhHosnotEntity.getZsxRegistration().getRegistrationId());
    }
}
