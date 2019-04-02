package com.sarnath.sshop.service;

import com.sarnath.sshop.entity.User;

public interface UserService {

    //注册
    Boolean register(User user);

    //登陆
    Boolean login(String userName, String userPassword);

    Boolean checkName(String userName);

}
