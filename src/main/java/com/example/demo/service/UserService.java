package com.example.demo.service;

import com.example.demo.bean.Result;
import com.example.demo.bean.User;

/**
 * projectName: demo
 *
 * @author: 陈爱琦
 * time: 2020/11/2 16:44
 * description:
 */
public interface UserService {
    Result login(User user);

    Result register(User user);
}
