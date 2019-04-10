package com.sarnath.sshop.controller;

import com.sarnath.sshop.entity.OrderEntity;
import com.sarnath.sshop.service.OrderService;
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
	private OrderService orderService;

	@GetMapping("/getOrder")
	public OrderEntity getOrder(){
		return orderService.getOrderById(1);
	}
}
