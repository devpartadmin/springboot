package com.sarnath.sshop.entity.form;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UserForm {
    @NotEmpty(message = "userName不能为空")
    private String userName;
    @NotEmpty(message = "userEmail不能为空")
    private String userEmail;
    private Integer userSex;
    private Integer userPhone;
    @NotEmpty(message = "userImg不能为空")
    private String userImg;
    @NotEmpty(message = "userPassword不能为空")
    private String userPassword;
}
