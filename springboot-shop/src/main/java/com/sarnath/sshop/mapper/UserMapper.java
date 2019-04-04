package com.sarnath.sshop.mapper;

import com.sarnath.sshop.entity.User;

public interface UserMapper {

    //新建用户
    Boolean insert(User user);

    //查询用户
    User findUserByName(String userName);

    //查询用户ID
    Integer findIdByName(String userName);

}
