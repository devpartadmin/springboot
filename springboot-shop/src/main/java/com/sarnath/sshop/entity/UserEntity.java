package com.sarnath.sshop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private String createUser;
    @JsonIgnore
    private Date createTime;
    @JsonIgnore
    private String updateUser;
    @JsonIgnore
    private Date updateTime;
    @JsonIgnore
    private String userPassword;

}
