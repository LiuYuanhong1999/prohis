package cn.gson.prohis.controller.YXJ;


import cn.gson.prohis.model.pojos.YXJ.Users;
import cn.gson.prohis.model.service.YXJ.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    UserService bs;


        @RequestMapping("/login")
        public Object login(@RequestBody Users user) {
            Users u = bs.findAll(user.getUserName());
            if (u == null) {
                return "账号不存在！";
            } else {
                if (!u.getUserPass().equals(user.getUserPass())) {
                    return "密码错误！";
                } else {
                    return u;
                }
            }

        }
}
