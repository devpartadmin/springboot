package com.sarnath.sshop.mapper;

import com.sarnath.sshop.entity.MSysAdmin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

public interface SysAdminMapper {

    MSysAdmin findSysAdminById(Integer id);

    Boolean insert(MSysAdmin mSysAdmin);

}
