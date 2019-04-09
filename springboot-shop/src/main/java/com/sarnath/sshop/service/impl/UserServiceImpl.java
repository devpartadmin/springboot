package com.sarnath.sshop.service.impl;

import com.sarnath.sshop.entity.UserEntity;
import com.sarnath.sshop.enums.ResultEnum;
import com.sarnath.sshop.exception.SellException;
import com.sarnath.sshop.mapper.UserMapper;
import com.sarnath.sshop.service.UserService;
import com.sarnath.sshop.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean register(UserEntity user) {
        return userMapper.insert(user);
    }

    @Override
    public UserEntity login(String userName, String userPassword) {
        if (userName == null || userPassword == null) {
            return null;
        }
        UserEntity user = userMapper.findUserByName(userName);
        if (user == null || !user.getUserPassword().equals(userPassword)) {
            return null;
        }
        return user;
    }

    @Override
    public Boolean checkName(String userName) {
        if (userName == null) {
            return false;
        }
        Integer userId = userMapper.findIdByName(userName);
        if (userId == null) {
            return true;
        }
        return false;
    }

    @Override
    public Integer getUserId(String userName) {
        return userMapper.findIdByName(userName);
    }
}
