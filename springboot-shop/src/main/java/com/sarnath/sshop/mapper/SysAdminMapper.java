package com.sarnath.sshop.mapper;

import com.sarnath.sshop.entity.MSysAdminEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

public interface SysAdminMapper {

    MSysAdminEntity findSysAdminById(Integer id);

    Boolean insert(MSysAdminEntity mSysAdmin);

}
