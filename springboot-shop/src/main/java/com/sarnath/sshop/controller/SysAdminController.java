package com.sarnath.sshop.controller;

import com.sarnath.sshop.entity.MSysAdminEntity;
import com.sarnath.sshop.entity.form.MSysAdminForm;
import com.sarnath.sshop.entity.vo.ResultVO;
import com.sarnath.sshop.service.SysAdminService;
import com.sarnath.sshop.utils.AdminForm2Entity;
import com.sarnath.sshop.utils.ResultVOUtil;
import com.sarnath.sshop.utils.TestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class SysAdminController {

    @Autowired
    private SysAdminService sysAdminService;

    @PostMapping("add")
    public ResultVO<Map<String, Integer>> add(@Valid MSysAdminForm mSysAdminForm) {
//        MSysAdmin mSysAdmin = TestUtils.getMSysAdmin();
        MSysAdminEntity mSysAdmin = AdminForm2Entity.convert(mSysAdminForm);
        sysAdminService.insert(mSysAdmin);
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("SysAdminID", mSysAdmin.getSysAdminID());
        return ResultVOUtil.success(map);
    }

}
