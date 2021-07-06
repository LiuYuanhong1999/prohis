package cn.gson.prohis.controller.YXJ;


import cn.gson.prohis.controller.LYH.AjaxResult;
import cn.gson.prohis.model.pojos.Users;
import cn.gson.prohis.model.service.YXJ.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

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


        @RequestMapping("/logins")
            public List<Users> findAll(){
                return  bs.findAll();
        }
    /**
     * 批量修改
     */
    @RequestMapping( "/updateState2")
    public AjaxResult updateState2(String numbers, String userId)
    {
        Map<String, Object> map = new HashMap<>();
        List<String> idList= Arrays.asList(userId.split(","));
        map.put("numbers",numbers);
        map.put("userId",idList);
        bs.update2(map);
        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("succes");
    }


    /**
     * 批量修改
     */
    @RequestMapping( "/updateState")
    public AjaxResult updateState(String userName, String userPass, String userId)
    {
        Map<String, Object> map = new HashMap<>();
        List<String> idList= Arrays.asList(userId.split(","));
        map.put("userName",userName);
        map.put("userPass",userPass);
        map.put("userId",idList);
            bs.update(map);
        return AjaxResult.me().setSuccess(false).setMsg("修改成功").setObject("succes");
    }


    //批量删除
    @RequestMapping("/deleteById")
    public void deleteById(@RequestParam("userId")String userId){
            String[] userIds =userId.split(",");
            List<Integer> list =new ArrayList<>();
            for (String str:userIds){
                list.add(Integer.parseInt(str));
            }
            bs.deleteById(list);
    }


//    /**
//     *@Author qinwei
//     * 批量添加数据元素
//     *@Date:14:51 2017/11/21
//     *@param: * @param null
//     */
//    @RequestMapping(value = "/update", produces = "application/json;charset=UTF-8")
//    public String update(){
////        Users users=this.getUsers();
//        Users users=this.getUsers();
//        List<Integer>list=new ArrayList<>();
//        try {
//            list.add(1);
//            list.add(64);
//            pd.put("dataname","46546464645");
//            pd.put("dataexplain","12");
//            pd.put("type","1");
//            pd.put("name","1");
//            pd.put("id",list);
//
//            descriptionService.updateByPrimaryKey(pd);
//            return JSONUtil.JsonString(new JsonResult(1, "修改成功!", null));
//        } catch (Exception e) {
//            e.printStackTrace();
//            logger.error("错误:"+e.toString());
//            return JSONUtil.JsonString(new JsonResult(1, "修改失败!", null));
//        }
//    }
//
//    private Users getUsers() {
//    }

}
