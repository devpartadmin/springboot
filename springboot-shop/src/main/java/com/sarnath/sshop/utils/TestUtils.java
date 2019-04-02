package com.sarnath.sshop.utils;

import com.sarnath.sshop.entity.MSysAdmin;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUtils {
    public static MSysAdmin getMSysAdmin(){
        MSysAdmin mSysAdmin = new MSysAdmin();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        mSysAdmin.setSysAdminID(1);
        mSysAdmin.setSysAdminAccNo("111");
        mSysAdmin.setSysAdminName("tom");
        mSysAdmin.setMobile("222");
        mSysAdmin.setEmail("tom@qq.com");
        mSysAdmin.setStatus("1");
        mSysAdmin.setRemarks("333");
        mSysAdmin.setPassword("tom123");
        mSysAdmin.setFaceImage(111);
        mSysAdmin.setCreateUser(1);
        mSysAdmin.setUpdateUser(1);
        mSysAdmin.setValid(2);
        mSysAdmin.setVersion(3);
        mSysAdmin.setCreateTime(simpleDateFormat.format(new Date()));
        mSysAdmin.setUpdateTime(simpleDateFormat.format(new Date()));
        return mSysAdmin;
    }
}
