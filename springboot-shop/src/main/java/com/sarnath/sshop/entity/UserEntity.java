package com.sarnath.sshop.entity;

import java.util.Date;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUserCreater() {
        return userCreater;
    }

    public void setUserCreater(String userCreater) {
        this.userCreater = userCreater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserUpdater() {
        return userUpdater;
    }

    public void setUserUpdater(String userUpdater) {
        this.userUpdater = userUpdater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUserIsDelete() {
        return userIsDelete;
    }

    public void setUserIsDelete(Integer userIsDelete) {
        this.userIsDelete = userIsDelete;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}
