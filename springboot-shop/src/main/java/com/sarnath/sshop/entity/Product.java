package com.sarnath.sshop.entity;/**
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

import java.util.ArrayList;
import java.util.Date;

/** @Author ShaneLau
 * Created by Shane Lau on 2019/4/4.
 */
public class Product {
    private Integer product_id;
    private Double product_price;
    private String product_img;
    private Integer product_num;
    private  Integer product_sale;
    private  String product_name;
    private Integer product_color;
    private String product_common_detail;
    private String product_info;
    private String creater;
    private Date create_time;
    private String updater;
    private Date update_time;
    private boolean is_delete;
    private ArrayList<Attribute> product_attributes;

    public Product(Integer product_id, Double product_price, String product_img, Integer product_num, Integer product_sale, String product_name, Integer product_color, String product_common_detail, String product_info, String creater, Date create_time, String updater, Date update_time, boolean is_delete, ArrayList<Attribute> product_attributes) {
        this.product_id = product_id;
        this.product_price = product_price;
        this.product_img = product_img;
        this.product_num = product_num;
        this.product_sale = product_sale;
        this.product_name = product_name;
        this.product_color = product_color;
        this.product_common_detail = product_common_detail;
        this.product_info = product_info;
        this.creater = creater;
        this.create_time = create_time;
        this.updater = updater;
        this.update_time = update_time;
        this.is_delete = is_delete;
        this.product_attributes = product_attributes;
    }

    public ArrayList<Attribute> getProduct_attributes() {

        return product_attributes;
    }

    public void setProduct_attributes(ArrayList<Attribute> product_attributes) {
        this.product_attributes = product_attributes;
    }


    public Product() {
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }

    public String getProduct_img() {
        return product_img;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }

    public Integer getProduct_num() {
        return product_num;
    }

    public void setProduct_num(Integer product_num) {
        this.product_num = product_num;
    }

    public Integer getProduct_sale() {
        return product_sale;
    }

    public void setProduct_sale(Integer product_sale) {
        this.product_sale = product_sale;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getProduct_color() {
        return product_color;
    }

    public void setProduct_color(Integer product_color) {
        this.product_color = product_color;
    }

    public String getProduct_common_detail() {
        return product_common_detail;
    }

    public void setProduct_common_detail(String product_common_detail) {
        this.product_common_detail = product_common_detail;
    }

    public String getProduct_info() {
        return product_info;
    }

    public void setProduct_info(String product_info) {
        this.product_info = product_info;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public boolean isIs_delete() {
        return is_delete;
    }

    public void setIs_delete(boolean is_delete) {
        this.is_delete = is_delete;
    }

}
