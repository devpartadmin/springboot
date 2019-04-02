package com.sarnath.sshop.service.impl;

import com.sarnath.sshop.entity.User;
import com.sarnath.sshop.mapper.UserMapper;
import com.sarnath.sshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean register(User user) {
        return userMapper.insert(user);
    }

    @Override
    public Boolean login(String userName, String userPassword) {
        User user = userMapper.findUserByName(userName);
        if (user == null || !user.getUserPassword().equals(userPassword)) {
            return false;
        }
        return true;
    }

    @Override
    public Boolean checkName(String userName) {
        User user = userMapper.findUserByName(userName);
        if (user == null) {
            return true;
        }
        return false;
    }
}
