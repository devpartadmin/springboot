package com.sarnath.sshop.controller;/**
 * : ,
 * +7?==?O$~                           :7?,, :~=,
 * +Z~       +Z~,                        :I+IIO+++
 * ,7=,          7:,                       :?:~Z8=
 * :I,            7,                       +?~IZ,
 * ,I:   ?     ?    ?                  ,~+Z+ :~+
 * $,              I,             ,:~77~, ,I7=
 * :Z                ?:   :~~+?Z$7I+: ,,,~7+
 * $,                7Z7I+::         :?$+,
 * ,?+                           ,+7I=
 * ,7:                   ,:,=N?~,
 * :7$,                   IZI$?
 * ?$+: ,                    ++
 * ~$ ,                        ,:I~
 * ,                   7=                              :I$~
 * ,O+               =I7$7, , ,     ,                      ,77:,
 * ,I7,            =$?, ,,O~  ~+O$#4=                        :=7~
 * ~II$:+$= ,,,:++?I7?,     :I:OZ+, :~7I,,,                    ,:??7+ ,
 * +D77$$?+I?~,,,      ,,:+O$ ,        :+I=:,,               =8I~ ,,,Z+
 * =Z7=+++++==+7TMO~                  ~$+,            :?=,,,,,,,,:?,
 * :O?,      :, ?:, ,,,,,,,,,$:
 * ,+I:,    ,?+,, ,,,,,,,,,,7=
 * :I77~ :Z, ,,,,,,,,,,,,,,?=
 * ,,I= I,,,,,,,,,,,,,,,,,?+
 * :~,                 :=
 * 哪错了？             错哪了？              我是谁？
 */

import com.sarnath.sshop.entity.vo.ResultVO;
import com.sarnath.sshop.exception.SellException;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/** @Author ShaneLau
 * Created by Shane Lau on 2019/4/8.
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultVO handleExecption(HttpServletResponse rsp, Exception e) {
        rsp.setCharacterEncoding("UTF-8");
        if (e instanceof SellException){
            ResultVO resultVO=new ResultVO();
            SellException se=(SellException)e;
            resultVO.setCode(se.getCode());
            resultVO.setMsg(e.getMessage());
            return resultVO;
        }
        else {
            ResultVO resultVO=new ResultVO();
            resultVO.setCode(500);
            resultVO.setMsg(e.getMessage());
            return resultVO;
        }

    }
}
