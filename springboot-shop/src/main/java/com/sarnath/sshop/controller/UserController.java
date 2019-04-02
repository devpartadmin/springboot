package com.sarnath.sshop.controller;

import com.sarnath.sshop.entity.User;
import com.sarnath.sshop.entity.form.UserForm;
import com.sarnath.sshop.entity.vo.ResultVO;
import com.sarnath.sshop.service.UserService;
import com.sarnath.sshop.utils.ResultVOUtil;
import com.sarnath.sshop.utils.UserForm2Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/buyer")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResultVO<Map<String, Integer>> register(@Valid UserForm userForm) {
        User user = UserForm2Entity.convert(userForm);
        userService.register(user);
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("SysAdminID", user.getUserId());
        return ResultVOUtil.success(map);
    }

    @PostMapping("/login")
    public ResultVO<Map<String, String>> login(String userName, String userPassword, HttpServletRequest request) {
        Map<String, String> map = new HashMap<>();
        if (!StringUtils.isEmpty(userName) && !StringUtils.isEmpty(userPassword)){
            if (userService.login(userName, userPassword)) {
//                request.getSession().setAttribute("loginUser", openid);
                map.put("userName", userName);
            }
        }
        return ResultVOUtil.success(map);
    }

    @PostMapping("/registCheck")
    public ResultVO<Map<String, String>> checkName(String userName) {
        Map<String, String> map = new HashMap<>();
        if (userService.checkName(userName)) {
            map.put("userName", userName);
            return ResultVOUtil.success(map);
        }
        return ResultVOUtil.error(map);
    }

}
