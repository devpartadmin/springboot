package com.sarnath.sshop.controller;

import com.sarnath.sshop.entity.UserEntity;
import com.sarnath.sshop.entity.form.UserForm;
import com.sarnath.sshop.entity.vo.ResultVO;
import com.sarnath.sshop.service.UserService;
import com.sarnath.sshop.utils.ResultVOUtil;
import com.sarnath.sshop.utils.UserForm2Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResultVO<Map<String, Integer>> register(@Valid UserForm userForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultVOUtil.error(2000, bindingResult.getFieldError().getDefaultMessage());
        }
        UserEntity user = UserForm2Entity.convert(userForm);
        userService.register(user);
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("userId", user.getUserId());
        return ResultVOUtil.success(map);
    }

    @PostMapping("/login")
    public ResultVO<Map<String, String>> login(String userName, String userPassword, HttpServletRequest request, HttpServletResponse response) {
        if (userName == null || userPassword == null) {
            return ResultVOUtil.error(1003, "用户名密码不能为空！");
        }
        Map<String, String> map = new HashMap<>();
        if (!StringUtils.isEmpty(userName) && !StringUtils.isEmpty(userPassword)){
            if (userService.login(userName, userPassword)) {
                String string = UUID.randomUUID().toString();
                request.getSession().setAttribute("token",string);
                Cookie cookie=new Cookie("token",string);
                cookie.setPath("/");
                cookie.setHttpOnly(false);
                response.addCookie(cookie);
                map.put("userName", userName);
                return ResultVOUtil.success(map);
            }
        }
        return ResultVOUtil.error(2001, "用户名不存在，或密码错误");
    }

    @PostMapping("/registCheck")
    public ResultVO<Map<String, String>> checkName(String userName) {
        if (userName == null) {
            return ResultVOUtil.error(2003, "请输入用户名");
        }
        Map<String, String> map = new HashMap<>();
        if (userService.checkName(userName)) {
            map.put("userName", userName);
            return ResultVOUtil.success(map);
        }
        return ResultVOUtil.error(2002, "用户名已存在");
    }

    @PostMapping("/session")
    public ResultVO<Map<String, Integer>> session(HttpServletRequest request) {
        Integer userId = (Integer) request.getSession().getAttribute("sessionid");
        if (userId == null) {
            return ResultVOUtil.error(2006, "请登录");
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("sessionid", userId);
        return ResultVOUtil.success(map);
    }

}
