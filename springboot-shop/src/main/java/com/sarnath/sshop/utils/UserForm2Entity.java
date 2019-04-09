package com.sarnath.sshop.utils;

import com.sarnath.sshop.entity.MSysAdminEntity;
import com.sarnath.sshop.entity.UserEntity;
import com.sarnath.sshop.entity.form.MSysAdminForm;
import com.sarnath.sshop.entity.form.UserForm;
import org.springframework.beans.BeanUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserForm2Entity {
    public static UserEntity convert(UserForm userForm) {
        UserEntity user = new UserEntity();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        BeanUtils.copyProperties(userForm, user);
        user.setCreateUser(userForm.getUserName());
        user.setUpdateUser(userForm.getUserName());
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        return user;
    }
}
