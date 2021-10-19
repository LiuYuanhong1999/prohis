package cn.gson.prohis.model.mapper.ZSX;

import cn.gson.prohis.model.pojos.YxjDesk;
import cn.gson.prohis.model.pojos.ZsxOperatingRoom;
import cn.gson.prohis.model.pojos.ZsxSurgeryArrange;
import cn.gson.prohis.model.pojos.ZsxSurgeryFor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZsxSurgeryArrangeMapper {
    List<ZsxSurgeryArrange> findSurgeryArrange();

    List<ZsxOperatingRoom> selectOperatingRoom();

    List<ZsxSurgeryFor> selectSurgeryFor();

    List<YxjDesk> selectDesk();

    void addSurgeryArrange(ZsxSurgeryArrange surgeryArrange);

    void updateSurgeryArrange(ZsxSurgeryArrange surgeryArrange);

    void updateSurgeryArrangeStaff(String surgeryArrangeNumber);
}
