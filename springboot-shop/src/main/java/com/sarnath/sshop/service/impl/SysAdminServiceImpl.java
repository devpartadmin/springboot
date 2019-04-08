package com.sarnath.sshop.service.impl;

import com.sarnath.sshop.entity.MSysAdminEntity;
import com.sarnath.sshop.mapper.SysAdminMapper;
import com.sarnath.sshop.service.SysAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysAdminServiceImpl implements SysAdminService {

    @Autowired
    private SysAdminMapper sysAdminMapper;

    @Override
    public Boolean insert(MSysAdminEntity mSysAdmin) {
        sysAdminMapper.insert(mSysAdmin);
        return null;
    }
}
