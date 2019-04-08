package com.sarnath.sshop.entity;

import com.sarnath.sshop.enums.ValidEnum;

public class ReciveAddressEntity {

	// 收货地址Id
	private Long addressId;
	// 省
	private String province;
	// 市
	private String city;
	// 县、区
	private String town;
	// 详细地址
	private String addressDetail;
	// 邮编
	private String addressCode;
	// 收货人
	private String addressPerson;
	// 收货人联系方式
	private String addressPhone;
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
	 * @return the addressId
	 */
	public Long getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * @param town the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 * @return the addressDetail
	 */
	public String getAddressDetail() {
		return addressDetail;
	}

	/**
	 * @param addressDetail the addressDetail to set
	 */
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	/**
	 * @return the addressCode
	 */
	public String getAddressCode() {
		return addressCode;
	}

	/**
	 * @param addressCode the addressCode to set
	 */
	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

	/**
	 * @return the addressPerson
	 */
	public String getAddressPerson() {
		return addressPerson;
	}

	/**
	 * @param addressPerson the addressPerson to set
	 */
	public void setAddressPerson(String addressPerson) {
		this.addressPerson = addressPerson;
	}

	/**
	 * @return the addressPhone
	 */
	public String getAddressPhone() {
		return addressPhone;
	}

	/**
	 * @param addressPhone the addressPhone to set
	 */
	public void setAddressPhone(String addressPhone) {
		this.addressPhone = addressPhone;
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
