package com.sarnath.sshop.service.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sarnath.sshop.entity.ReceiveAddressEntity;
import com.sarnath.sshop.entity.UserEntity;
import com.sarnath.sshop.enums.ResultEnum;
import com.sarnath.sshop.enums.ValidEnum;
import com.sarnath.sshop.exception.SellException;
import com.sarnath.sshop.utils.TimeUtil;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarnath.sshop.entity.vo.ResultVO;
import com.sarnath.sshop.mapper.ReceiveAddressMapper;
import com.sarnath.sshop.service.ReciveAddressService;
import com.sarnath.sshop.utils.ResultVOUtil;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@Service
public class ReciveAddressServiceImpl implements ReciveAddressService {

    @Autowired
    private ReceiveAddressMapper reciveAddressEntityMapper;

    @Override
    public ResultVO getUserReciveAddress(int addressId) {
        return ResultVOUtil.success(reciveAddressEntityMapper.getReceiveAddressListByAddressId(1));
    }

    @Override
    public ResultVO insertAddresses(HttpServletRequest request, String json) {
        HttpSession session = request.getSession();
        UserEntity user = (UserEntity) session.getAttribute("user");
        if (user == null) {
            throw new SellException(ResultEnum.LOGIN_PLEASE);
        }
        Integer userId = user.getUserId();
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            JavaType jt=objectMapper.getTypeFactory().constructParametricType(ArrayList.class, ReceiveAddressEntity.class);
            ArrayList<ReceiveAddressEntity> reciveAddressEntity = objectMapper.readValue(json, jt);
            for (ReceiveAddressEntity address:reciveAddressEntity){
                try {
                    synchronized (this){
                        address.setCreateUser(user.getUserName());
                        address.setCreateTime(TimeUtil.getCurrentTime());
                        address.setValidEnum(ValidEnum.NOTDELETED);
//                        int addressId=reciveAddressEntityMapper.insertAddressInfo(address,userId);
//                        reciveAddressEntityMapper.insertAddress_user(addressId,address,userId);
                    }

                }catch (Exception e){
                    throw new SellException(ResultEnum.DATABASE_ERROR);
                }
            }
        } catch (IOException e) {
            throw new SellException(ResultEnum.WRONG_ATTRIBUTE);
        }
        return null;
    }

    @Override
    public ResultVO getAddressByUserId(HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserEntity user = (UserEntity) session.getAttribute("user");
        if (user == null) {
            throw new SellException(ResultEnum.LOGIN_PLEASE);
        }
        try {
            ArrayList<ReceiveAddressEntity> addressEntities = reciveAddressEntityMapper.getAddressByUserId(user.getUserId());
            return ResultVOUtil.success(addressEntities);
        } catch (Exception e) {
            throw new SellException(ResultEnum.DATABASE_ERROR);
        }

    }


}
