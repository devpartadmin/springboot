package com.sarnath.sshop.utils;

import com.sarnath.sshop.entity.MSysAdmin;
import com.sarnath.sshop.entity.form.MSysAdminForm;
import org.springframework.beans.BeanUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AdminForm2Entity {
    public static MSysAdmin convert(MSysAdminForm mSysAdminForm) {
        MSysAdmin mSysAdmin = new MSysAdmin();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        BeanUtils.copyProperties(mSysAdminForm, mSysAdmin);
        mSysAdmin.setCreateTime(simpleDateFormat.format(new Date()));
        mSysAdmin.setUpdateTime(simpleDateFormat.format(new Date()));
        return mSysAdmin;
    }
}
