package com.sarnath.sshop.service.impl;/**
 * : ,
 * +7?==?O$~                           :7?,, :~=,
 * +Z~       +Z~,                        :I+IIO+++
 * ,7=,          7:,                       :?:~Z8=
 * :I,            7,                       +?~IZ,
 * ,I:   ?     ?    ?                  ,~+Z+ :~+
 * $,              I,             ,:~77~, ,I7=
 * :Z                ?:   :~~+?Z$7I+: ,,,~7+
 * $,                7Z7I+::         :?$+,
 * ,?+                           ,+7I=
 * ,7:                   ,:,=N?~,
 * :7$,                   IZI$?
 * ?$+: ,                    ++
 * ~$ ,                        ,:I~
 * ,                   7=                              :I$~
 * ,O+               =I7$7, , ,     ,                      ,77:,
 * ,I7,            =$?, ,,O~  ~+O$#4=                        :=7~
 * ~II$:+$= ,,,:++?I7?,     :I:OZ+, :~7I,,,                    ,:??7+ ,
 * +D77$$?+I?~,,,      ,,:+O$ ,        :+I=:,,               =8I~ ,,,Z+
 * =Z7=+++++==+7TMO~                  ~$+,            :?=,,,,,,,,:?,
 * :O?,      :, ?:, ,,,,,,,,,$:
 * ,+I:,    ,?+,, ,,,,,,,,,,7=
 * :I77~ :Z, ,,,,,,,,,,,,,,?=
 * ,,I= I,,,,,,,,,,,,,,,,,?+
 * :~,                 :=
 * 哪错了？             错哪了？              我是谁？
 */

import com.sarnath.sshop.entity.ProductEntity;
import com.sarnath.sshop.entity.vo.ResultVO;
import com.sarnath.sshop.enums.ResultEnum;
import com.sarnath.sshop.exception.SellException;
import com.sarnath.sshop.mapper.ProductMapper;
import com.sarnath.sshop.service.ProductService;
import com.sarnath.sshop.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/** @Author ShaneLau
 * Created by Shane Lau on 2019/4/4.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper mapper;

    @Override
    public ArrayList<ProductEntity> getAllProducts() {
        return mapper.getAllProducts();
    }

    @Override
    public ResultVO getProductById(Integer id) {
        if (id !=null){
            ProductEntity p=mapper.getProductById(id);
            return ResultVOUtil.success(p);
        }
        else {
            throw new SellException(ResultEnum.WRONG_ATTRIBUTE);
        }
    }
}
