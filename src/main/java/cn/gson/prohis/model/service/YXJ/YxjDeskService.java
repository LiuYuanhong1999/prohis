package cn.gson.prohis.model.service.YXJ;

import cn.gson.prohis.model.mapper.YXJ.YxjDeskMapper;
import cn.gson.prohis.model.pojos.YxjDesk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YxjDeskService {
    @Autowired
    YxjDeskMapper yxjDeskMapper;

    /**
     * 查询所有科室
     * @return
     */
    public List<YxjDesk> selDesk(){return yxjDeskMapper.selDesk();}

    /**
     * 新增科室
     */
    public void addDesk(YxjDesk yxjDesk){
        if (yxjDesk.getDeskId() != null){
            yxjDeskMapper.updateDesk(yxjDesk);
        }else {
            yxjDeskMapper.addDesk(yxjDesk);}
        }

    /**
     * 修改科室
     */
    public void updateDesk(YxjDesk yxjDesk){yxjDeskMapper.updateDesk(yxjDesk);}

    /**
     * 根据id删除科室
     * @param deskId
     */
    public void delDesk(Integer deskId){yxjDeskMapper.delDesk(deskId);}

}
