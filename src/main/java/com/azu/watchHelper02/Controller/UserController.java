package com.azu.watchHelper02.Controller;

import com.azu.watchHelper02.Service.UserService;
import com.azu.watchHelper02.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        int result = userService.registerUser(user);
        if (result > 0) {
            return "注册成功";
        } else {
            return "注册失败";
        }
    }

    @PostMapping("/login")
    public String login(@RequestParam String username) {
        User user = userService.login(username);
        if (user != null) {
            return "登录成功";
        } else {
            return "登录失败，用户不存在";
        }
    }
}