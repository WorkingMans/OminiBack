package com.example.demo.service.impl;

import com.example.demo.bean.Result;
import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: demo
 *
 * @author: 陈爱琦
 * time: 2020/11/2 17:56
 * description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result login(User user) {

        //1.账号密码加密处理
//        String newPwd = DigestUtils.md5DigestAsHex(
//                (user.getuPassword()+ Constants.SALT).getBytes());
//        user.setuPassword(newPwd);
        //2.查询
        User retUser = userMapper.queryUser(user);
        //3.返回结果
        Result result = new Result();
        if (retUser != null) {
            //查询成功 设置返回状态为1
            result.setCode(1);
            result.setData(retUser);
        }else {
            result.setCode(0);
        }
        return result;
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @Override
    public Result register(User user) {

        String uname = user.getuAccount();
        String upwd = user.getuPassword();
        int uage = user.getuAge();
        String usex = user.getuSex();

        user.setuAccount(uname);
        user.setuPassword(upwd);
        user.setuAge(uage);
        user.setuSex(usex);

        //执行注册语句
        userMapper.registerUser(user);

        User retUser = userMapper.queryUser(user);

        Result result = new Result();
        if (retUser != null) {
            //查询成功 设置返回状态为1
            result.setCode(1);
        }else {
            result.setCode(0);
        }

        return result;
    }
}