package com.sarnath.sshop.service;

import com.sarnath.sshop.entity.MSysAdmin;
import org.springframework.stereotype.Service;

@Service
public interface SysAdminService {

    Boolean insert(MSysAdmin mSysAdmin);

}
