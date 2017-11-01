package llq.controller;

import com.alibaba.fastjson.JSONObject;
import llq.model.Company;
import llq.model.User;
import llq.service.CompanyService;
import llq.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zl on 2015/8/27.
 */
@Controller
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private CompanyService companyService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public JSONObject getUserInfo(HttpServletRequest request) throws Exception{
        String  s_uid = request.getParameter("uid");
        try {
            if (s_uid == null) {
                throw new Exception("参数uid为空!");
            }
            User user = userService.getUserInfo(s_uid);
            if (user != null) {
                System.out.println("user.getName():" + user.getName());
                logger.info("user.getAge():" + user.getAge());
            }else{
                return null;
            }
            return user.toJson();
        }catch (Exception e){
            e.printStackTrace();
            JSONObject json = new JSONObject();
            json.put("error",e.getMessage());
            return json;
        }
    }

    @RequestMapping(value="/addUser", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject addUser(HttpServletRequest request) throws Exception{
        JSONObject json = new JSONObject();
        String  s_uid = request.getParameter("uid");
        String  name = request.getParameter("name");
        String  age = request.getParameter("age");
        String  company = request.getParameter("company");
        String  profession = request.getParameter("profession");
        try {
            if (s_uid == null) {
                throw new Exception("uid为空");
            }

            if (name == null) {
                throw new Exception("name为空");
            }

            if (company == null) {
                throw new Exception("company为空");
            }
            User user = new User();
            user.setName(name);
            user.setUid(s_uid);
            if(age != "" && age != null){
                user.setAge(Integer.parseInt(age));
            }

            if(company != "" && company != null){
                System.out.println(company);
                Company com = companyService.getCompanyInfoById(Integer.parseInt(company));
                user.setCompany(com);
            }
            int rt=userService.addUser(user);
            if(rt == 1){
                json.put("code",1);
            }
            return json;
        }catch (Exception e){
            e.printStackTrace();
            json.put("code",0);
            json.put("error",e.getMessage());
            return json;
        }
    }
}
