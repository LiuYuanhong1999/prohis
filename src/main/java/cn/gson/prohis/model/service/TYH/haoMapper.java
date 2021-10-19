package cn.gson.prohis.model.service.TYH;


import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class haoMapper {
    public String hao(String num){
        SimpleDateFormat myFmt = new SimpleDateFormat("yyMMddHHmmssSSS");
        Date date = new Date();
        String a=myFmt.format(date);
        String b=num+a;
        return b;

    }
}
