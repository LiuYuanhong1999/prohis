package cn.gson.prohis.model.service.ZSX;

import cn.gson.prohis.model.mapper.ZSX.ZsxPrescriptionMapper;
import cn.gson.prohis.model.pojos.ZsxPrescription;
import cn.gson.prohis.model.pojos.ZsxPrescriptionVo;
import cn.gson.prohis.model.pojos.ZsxRegistration;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ZsxPrescriptionService {
    @Resource
    ZsxPrescriptionMapper prescriptionMapper;

    public List<ZsxPrescription> findPrescription(){
        return prescriptionMapper.findPrescription();
    }

    public List<ZsxRegistration> findRegistrationState(){
        return prescriptionMapper.findRegistrationState();
    }

    public void addPrescription(ZsxPrescriptionVo prescription){
        SimpleDateFormat time = new SimpleDateFormat("yyMMddHHmmssSSS");
        Date date = new Date();
        String a = time.format(date);
        String b = "MZCF";
        prescription.setPrescriptionId(b + a);

        prescription.setDoctor(0);
        prescription.setRegistrationId(prescription.getRegistration().getRegistrationId());

//        prescriptionMapper.addPrescription(prescription);



        prescription.getPrescriptionDetails().forEach(drug->{
            System.out.println(drug);
            //药品新增
                if (drug.drug.size()!=0){
                    drug.getDrug().forEach(v->{
                        v.drugPrice = v.drugPrice * v.numbers;
                        System.err.println(v);
                        prescriptionMapper.addPrescriptionDetails(v,prescription.getPrescriptionId());
                    });
                }
            //项目新增
                if (drug.project.size()!=0){
                    drug.getProject().forEach(v->{
                        System.out.println(v);
                        prescriptionMapper.addPrescriptionDetailsProject(v,prescription.getPrescriptionId());
                    });
                }
        });
    }

}
