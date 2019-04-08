package com.sarnath.sshop.service;

import com.sarnath.sshop.entity.ProductEntity;
import com.sarnath.sshop.entity.vo.ResultVO;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Author ShaneLau
 * Created by Shane Lau on 2019/4/4.
 */
public interface ProductService {
    ArrayList<ProductEntity> getAllProducts();

    ResultVO getProductById(Integer id);
}
