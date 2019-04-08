package com.sarnath.sshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarnath.sshop.entity.vo.ResultVO;
import com.sarnath.sshop.mapper.ReciveAddressMapper;
import com.sarnath.sshop.service.ReciveAddressService;
import com.sarnath.sshop.utils.ResultVOUtil;

@Service
public class ReciveAddressServiceImpl implements ReciveAddressService {

	@Autowired
	private ReciveAddressMapper reciveAddressEntityMapper;
	
	@Override
	public ResultVO getUserReciveAddress(int addressId) {
		return ResultVOUtil.success(reciveAddressEntityMapper.getReciveAddressListById(1));
	}

}
