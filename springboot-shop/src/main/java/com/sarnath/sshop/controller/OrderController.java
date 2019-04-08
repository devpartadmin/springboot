package com.sarnath.sshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarnath.sshop.entity.vo.ResultVO;
import com.sarnath.sshop.service.ReciveAddressService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private ReciveAddressService reciveAddressService;
	
	@GetMapping("/address")
	public ResultVO getAddress(int addressId) {
		return reciveAddressService.getUserReciveAddress(addressId);
	}

}
