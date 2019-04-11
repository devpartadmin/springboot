package com.sarnath.sshop.service.impl;

import com.sarnath.sshop.entity.OrderEntity;
import com.sarnath.sshop.mapper.OrderMapper;
import com.sarnath.sshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public OrderEntity getOrderById(Integer orderId) {
        return orderMapper.getOrderById(orderId);
    }
}
