package com.sarnath.sshop.mapper;

import com.sarnath.sshop.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    OrderEntity getOrderById(Integer orderId);

}
