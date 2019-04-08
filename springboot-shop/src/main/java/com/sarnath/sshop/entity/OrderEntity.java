package com.sarnath.sshop.entity;

import java.util.Date;
import java.util.List;

import com.sarnath.sshop.enums.ValidEnum;

public class OrderEntity {

	//订单ID
	private int orderId;
	//订单编号
	private long orderIdentifier;
	//订单创建时间
	private Date orderDatetime;
	//订单金额
	private Double orderMoney;
	//发货时间
	private Date orderSendTime;
	//商品列表
	private List<OrderProduct> productEntities;
	//收货地址
	private ReciveAddressEntity reciveAddress;
	//用户
	private UserEntity user;
	// 创建时间
	private String createTime;
	// 创建者
	private String createUser;
	// 更新时间
	private String updateTime;
	// 更新者
	private String updateUser;
	// 状态 1已删除 0未删除
	private ValidEnum validEnum;

	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the orderIdentifier
	 */
	public long getOrderIdentifier() {
		return orderIdentifier;
	}

	/**
	 * @param orderIdentifier the orderIdentifier to set
	 */
	public void setOrderIdentifier(long orderIdentifier) {
		this.orderIdentifier = orderIdentifier;
	}

	/**
	 * @return the orderDatetime
	 */
	public Date getOrderDatetime() {
		return orderDatetime;
	}

	/**
	 * @param orderDatetime the orderDatetime to set
	 */
	public void setOrderDatetime(Date orderDatetime) {
		this.orderDatetime = orderDatetime;
	}

	/**
	 * @return the orderMoney
	 */
	public Double getOrderMoney() {
		return orderMoney;
	}

	/**
	 * @param orderMoney the orderMoney to set
	 */
	public void setOrderMoney(Double orderMoney) {
		this.orderMoney = orderMoney;
	}

	/**
	 * @return the orderSendTime
	 */
	public Date getOrderSendTime() {
		return orderSendTime;
	}

	/**
	 * @param orderSendTime the orderSendTime to set
	 */
	public void setOrderSendTime(Date orderSendTime) {
		this.orderSendTime = orderSendTime;
	}

	/**
	 * @return the productEntities
	 */
	public List<OrderProduct> getProductEntities() {
		return productEntities;
	}

	/**
	 * @param productEntities the productEntities to set
	 */
	public void setProductEntities(List<OrderProduct> productEntities) {
		this.productEntities = productEntities;
	}

	/**
	 * @return the reciveAddress
	 */
	public ReciveAddressEntity getReciveAddress() {
		return reciveAddress;
	}

	/**
	 * @param reciveAddress the reciveAddress to set
	 */
	public void setReciveAddress(ReciveAddressEntity reciveAddress) {
		this.reciveAddress = reciveAddress;
	}

	/**
	 * @return the user
	 */
	public UserEntity getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(UserEntity user) {
		this.user = user;
	}

	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the createUser
	 */
	public String getCreateUser() {
		return createUser;
	}

	/**
	 * @param createUser the createUser to set
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * @return the updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return the updateUser
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * @param updateUser the updateUser to set
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * @return the validEnum
	 */
	public ValidEnum getValidEnum() {
		return validEnum;
	}

	/**
	 * @param validEnum the validEnum to set
	 */
	public void setValidEnum(ValidEnum validEnum) {
		this.validEnum = validEnum;
	}

}
