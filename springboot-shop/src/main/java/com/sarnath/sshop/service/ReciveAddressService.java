package com.sarnath.sshop.service;

import com.sarnath.sshop.entity.ReciveAddressEntity;
import com.sarnath.sshop.entity.vo.ResultVO;

public interface ReciveAddressService {

	ResultVO getUserReciveAddress(int addressId);
	
}
