package com.sarnath.sshop.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserEntity {

    private Integer userId;
    private String userName;
    private String userEmail;
    private Integer userSex;
    private Integer userPhone;
    private Date lastLoginTime;
    private String userImg;
    private String userCreater;
    private Date createTime;
    private String userUpdater;
    private Date updateTime;
    private Integer userIsDelete;
    private String userPassword;

}
