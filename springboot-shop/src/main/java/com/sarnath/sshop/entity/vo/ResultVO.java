package com.sarnath.sshop.entity.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultVO<T> {

    private Integer code;
    private String msg;
    private T data;

}
