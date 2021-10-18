package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxSurgeryArrangeMapper;
import cn.gson.prohis.model.pojos.YxjDesk;
import cn.gson.prohis.model.pojos.ZsxOperatingRoom;
import cn.gson.prohis.model.pojos.ZsxSurgeryArrange;
import cn.gson.prohis.model.pojos.ZsxSurgeryFor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ZsxSurgeryArrangeService {
    @Resource
    ZsxSurgeryArrangeMapper surgeryArrangeMapper;

    public List<ZsxSurgeryArrange> findSurgeryArrange(){
        return surgeryArrangeMapper.findSurgeryArrange();
    }

    public List<ZsxOperatingRoom> selectOperatingRoom(){
        return surgeryArrangeMapper.selectOperatingRoom();
    }

    public List<ZsxSurgeryFor> selectSurgeryFor(){
        return surgeryArrangeMapper.selectSurgeryFor();
    }

    public List<YxjDesk> selectDesk(){
        return surgeryArrangeMapper.selectDesk();
    }

    public void saveSurgeryArrange(ZsxSurgeryArrange surgeryArrange){
        surgeryArrangeMapper.addSurgeryArrange(surgeryArrange);

        surgeryArrangeMapper.updateSurgeryArrange(surgeryArrange);
    }

    public void updateSurgeryArrangeStaff(String surgeryArrangeNumber){
        surgeryArrangeMapper.updateSurgeryArrangeStaff(surgeryArrangeNumber);
    }
}
