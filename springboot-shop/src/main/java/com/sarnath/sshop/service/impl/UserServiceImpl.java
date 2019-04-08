package com.sarnath.sshop.service.impl;

import com.sarnath.sshop.entity.UserEntity;
import com.sarnath.sshop.mapper.UserMapper;
import com.sarnath.sshop.service.UserService;
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
    public Boolean login(String userName, String userPassword) {
        UserEntity user = userMapper.findUserByName(userName);
        if (user == null || !user.getUserPassword().equals(userPassword)) {
            return false;
        }
        return true;
    }

    @Override
    public Boolean checkName(String userName) {
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
