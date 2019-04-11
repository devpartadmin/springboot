package com.sarnath.sshop.entity;

public class OrderProductEntity {

    private int orderId;
    private int buyNum;
    private ProductEntity productEntity;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    /**
     * @return the buyNum
     */
    public int getBuyNum() {
        return buyNum;
    }

    /**
     * @param buyNum the buyNum to set
     */
    public void setBuyNum(int buyNum) {
        this.buyNum = buyNum;
    }

}
