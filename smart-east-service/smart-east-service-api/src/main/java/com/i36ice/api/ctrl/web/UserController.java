package com.i36ice.api.ctrl.web;

import com.i36ice.user.mapper.UserMapper;
import com.i36ice.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user = userMapper.findByUsername(username);
        if (user == null) {
            return "用户名不存在";
        } else if (!user.getPassword().equals(password)) {
            return "密码错误";
        } else {
            return "登录成功";
        }
    }
}
