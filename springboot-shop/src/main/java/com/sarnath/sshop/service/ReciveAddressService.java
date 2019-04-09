package com.sarnath.sshop.service;

import com.sarnath.sshop.entity.vo.ResultVO;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;

public interface ReciveAddressService {

	ResultVO getUserReciveAddress(int addressId);
	ResultVO getAddressByUserId(HttpServletRequest userId);

    ResultVO insertAddresses(HttpServletRequest request, String json);
}
