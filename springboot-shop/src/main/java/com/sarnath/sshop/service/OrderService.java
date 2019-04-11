package com.sarnath.sshop.service;

import com.sarnath.sshop.entity.OrderEntity;

public interface OrderService {

    OrderEntity getOrderById(Integer orderId);

}
