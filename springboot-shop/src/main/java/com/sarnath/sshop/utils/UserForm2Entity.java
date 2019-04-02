package com.sarnath.sshop.utils;

import com.sarnath.sshop.entity.MSysAdmin;
import com.sarnath.sshop.entity.User;
import com.sarnath.sshop.entity.form.MSysAdminForm;
import com.sarnath.sshop.entity.form.UserForm;
import org.springframework.beans.BeanUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserForm2Entity {
    public static User convert(UserForm userForm) {
        User user = new User();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        BeanUtils.copyProperties(userForm, user);
        user.setUserCreater(userForm.getUserName());
        user.setUserUpdater(userForm.getUserName());
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        return user;
    }
}
