package com.sarnath.sshop.mapper;

import java.util.ArrayList;

import com.sarnath.sshop.entity.ReceiveAddressEntity;

public interface ReceiveAddressMapper {
	
	ReceiveAddressEntity getReceiveAddressListByAddressId(int reciveAddressId);

    ArrayList<ReceiveAddressEntity> getAddressByUserId(int userId);
}
