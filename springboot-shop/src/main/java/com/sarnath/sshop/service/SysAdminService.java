package com.sarnath.sshop.service;

import com.sarnath.sshop.entity.MSysAdminEntity;
import org.springframework.stereotype.Service;

@Service
public interface SysAdminService {

    Boolean insert(MSysAdminEntity mSysAdmin);

}
