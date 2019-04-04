package com.sarnath.sshop.service;

import com.sarnath.sshop.entity.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Author ShaneLau
 * Created by Shane Lau on 2019/4/4.
 */
public interface ProductService {
    ArrayList<Product> getAllProducts();
}
