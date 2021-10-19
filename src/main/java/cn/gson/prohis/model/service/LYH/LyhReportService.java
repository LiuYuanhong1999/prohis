package cn.gson.prohis.model.service.LYH;

import cn.gson.prohis.model.mapper.LYH.*;
import cn.gson.prohis.model.pojos.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Service
public class LyhReportService {

    @Resource
    LyhReportMapper reportMapper;

    @Resource
    LyhReportDetailsMapper lyhReportDetailsMapper;


    @Resource
    LyhDrugRecordMapper drugRecordMapper;

    @Resource
    LyhDrugStoreMapper drugStoreMapper;

    @Resource
    LyhAuditMapper auditMapper;


    public List<LyhReportEntity> findAll(Integer reportState){
        return reportMapper.selectAll(reportState);
    }

    public List<LyhReportEntity> findAll2(){
        return reportMapper.selectAll2();
    }

    public void updateById(Integer reportState,Integer reportId){
        reportMapper.updateById(reportState,reportId);
    }

    public void insertAll(LyhAuditEntity auditEntity){

        LyhReportEntity report=new LyhReportEntity();

        Timestamp d = new Timestamp(System.currentTimeMillis());

            report.setReportId(auditEntity.getMeiYon());
            report.setProcurementId(auditEntity.getProcurementId());
            report.setReportTime(d);

            reportMapper.insertAll(report);

        for (LyhProcurementDetailsEntity entity : auditEntity.getLyhProcurementEntity().getLyhProcurementDetailsEntities()) {

            LyhReportDetailsEntity details=new LyhReportDetailsEntity();

                details.setReportId(auditEntity.getMeiYon());

                details.setNumbers(entity.getNumbers());
                details.setDrugId(entity.getDrugId());
                details.setProcurementId(auditEntity.getProcurementId());

                lyhReportDetailsMapper.insertByReport(details);
        }
    }

    //退货扣除药库药品库存数量
    public void updateByReport(String procurementId,Integer drugId,Integer numbers){



        drugRecordMapper.updateByReport(procurementId, drugId, numbers);


        drugStoreMapper.updateById2(numbers, drugId, procurementId);

        }


    //查询已入库的采购单

    public List<LyhAuditEntity> findAll3(){
        return auditMapper.findAll4();
    }
}
