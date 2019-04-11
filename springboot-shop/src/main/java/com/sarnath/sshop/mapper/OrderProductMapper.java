package com.sarnath.sshop.mapper;

import com.sarnath.sshop.entity.OrderProductEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderProductMapper {

    List<OrderProductEntity> getOrderProductByOrderId(Integer orderId);

}
