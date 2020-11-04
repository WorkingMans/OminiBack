package com.example.demo.controller;

import com.example.demo.bean.Result;
import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: demo
 *
 * @author: 陈爱琦
 * time: 2020/11/2 16:09
 * description:处理用户模块请求的controller
 */

/**
 * 我们controller返回json数据
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("login")
    public Result login(User user){

        //调用用户的登录方法
        Result resultlog = userService.login(user);

        return resultlog;
    }

    @GetMapping("register")
    public Result register(User user){

        //调用用户的注册方法
        Result resultre = userService.register(user);
        return resultre;
    }
}
