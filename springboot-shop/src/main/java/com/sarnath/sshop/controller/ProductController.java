package com.sarnath.sshop.controller;/**
*                                                                      : ,       
*                                  +7?==?O$~                           :7?,, :~=,
*                                +Z~       +Z~,                        :I+IIO+++ 
*                              ,7=,          7:,                       :?:~Z8=   
*                              :I,            7,                       +?~IZ,    
*                             ,I:   ?     ?    ?                  ,~+Z+ :~+      
*                              $,              I,             ,:~77~, ,I7=       
*                             :Z                ?:   :~~+?Z$7I+: ,,,~7+          
*                              $,                7Z7I+::         :?$+,            
*                             ,?+                           ,+7I=                 
*                              ,7:                   ,:,=N?~,                    
*                             :7$,                   IZI$?                       
*                           ?$+: ,                    ++                         
*                         ~$ ,                        ,:I~                       
*    ,                   7=                              :I$~                    
*   ,O+               =I7$7, , ,     ,                      ,77:,                
*   ,I7,            =$?, ,,O~  ~+O$#4=                        :=7~               
*~II$:+$= ,,,:++?I7?,     :I:OZ+, :~7I,,,                    ,:??7+ ,            
*+D77$$?+I?~,,,      ,,:+O$ ,        :+I=:,,               =8I~ ,,,Z+            
*     =Z7=+++++==+7TMO~                  ~$+,            :?=,,,,,,,,:?,          
*                                           :O?,      :, ?:, ,,,,,,,,,$:         
*                                             ,+I:,    ,?+,, ,,,,,,,,,,7=        
*                                                :I77~ :Z, ,,,,,,,,,,,,,,?=       
*                                                  ,,I= I,,,,,,,,,,,,,,,,,?+      
*                                                     :~,                 :=     
*                     哪错了？             错哪了？              我是谁？
*/

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sarnath.sshop.entity.ProductEntity;
import com.sarnath.sshop.entity.vo.ResultVO;
import com.sarnath.sshop.enums.ResultEnum;
import com.sarnath.sshop.exception.SellException;
import com.sarnath.sshop.service.ProductService;
import com.sarnath.sshop.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;

/** @Author ShaneLau
 * Created by Shane Lau on 2019/4/4.
 */
@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("getIndexProducts")
    public PageInfo<ProductEntity> getallProducts(){
        PageHelper.startPage(1,5);
        ArrayList<ProductEntity> allProducts = service.getAllProducts();
        PageInfo<ProductEntity> page=new PageInfo<>(allProducts);
        return page;
    }
    @GetMapping("getProductById")
    public ResultVO getProductById(Integer id){
        if (id==null){
            throw new SellException(ResultEnum.WRONG_ATTRIBUTE);
        }
        ResultVO productById = service.getProductById(id);
        return productById;
    }

}
