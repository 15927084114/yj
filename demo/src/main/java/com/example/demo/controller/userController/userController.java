package com.example.demo.controller.userController;

import com.example.demo.entity.filter.Authority;
import com.example.demo.entity.user.User;
import org.jboss.logging.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userController")
public class userController {

    @PostMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password){
        if (username.equals("yangjian") && password.equals("123456")){
            return "登陆成功!";
        }
        return "登陆失败";
    }

}
