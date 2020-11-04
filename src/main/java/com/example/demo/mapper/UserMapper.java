package com.example.demo.mapper;

import com.example.demo.bean.User;

/**
 * projectName: demo
 *
 * @author: 陈爱琦
 * time: 2020/11/2 17:54
 * description:用户模块数据库操作的接口文件
 */
public interface UserMapper {

    /**
     * 查询动作
     * @param user 有账号密码的user
     * @return 全新的user除了账号密码还有其他信息
     */
    User queryUser(User user);

    /**
     * 注册动作
     * @param user 有注册信息的user
     * @return 注册成功
     */
    User registerUser(User user);
}
