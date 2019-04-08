package com.sarnath.sshop.mapper;

import com.sarnath.sshop.entity.UserEntity;

public interface UserMapper {

    //新建用户
    Boolean insert(UserEntity user);

    //查询用户
    UserEntity findUserByName(String userName);

    //查询用户ID
    Integer findIdByName(String userName);

}
