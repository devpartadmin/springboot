package com.sarnath.sshop.service;

import com.sarnath.sshop.entity.UserEntity;

public interface UserService {

    //注册
    Boolean register(UserEntity user);

    //登陆
    Boolean login(String userName, String userPassword);

    //校验用户名
    Boolean checkName(String userName);

    //查询用户ID
    Integer getUserId(String userName);

}
