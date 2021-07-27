package cn.gson.prohis.controller.YXJ;

import cn.gson.prohis.model.pojos.Users;
import cn.gson.prohis.model.service.YXJ.YxjUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class YxjUserController {
    @Autowired
    YxjUserService yxjUserService;

    @PostMapping("/login")
    public String login(@RequestBody Users users, HttpSession session){
        if ("admin".equals(users.getUserName()) && "123456".equals(users.getUserPass())){
            session.setAttribute("token",users);
            return "ok";
        }
        return "fail";
    }
}
