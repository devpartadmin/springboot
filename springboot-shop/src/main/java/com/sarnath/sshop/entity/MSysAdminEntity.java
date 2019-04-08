package com.sarnath.sshop.entity;

import java.util.Date;

public class MSysAdminEntity {

    private Integer sysAdminID;
    private String sysAdminAccNo;
    private String sysAdminName;
    private String mobile;
    private String email;
    private String status;
    private String remarks;
    private String password;
    private Integer faceImage;
    private Integer createUser;
    private Integer updateUser;
    private Integer valid;
    private Integer version;
    private String createTime;
    private String updateTime;

    public Integer getSysAdminID() {
        return sysAdminID;
    }

    public void setSysAdminID(Integer sysAdminID) {
        this.sysAdminID = sysAdminID;
    }

    public String getSysAdminAccNo() {
        return sysAdminAccNo;
    }

    public void setSysAdminAccNo(String sysAdminAccNo) {
        this.sysAdminAccNo = sysAdminAccNo;
    }

    public String getSysAdminName() {
        return sysAdminName;
    }

    public void setSysAdminName(String sysAdminName) {
        this.sysAdminName = sysAdminName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(Integer faceImage) {
        this.faceImage = faceImage;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
