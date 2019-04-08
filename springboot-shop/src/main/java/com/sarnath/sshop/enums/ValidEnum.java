package com.sarnath.sshop.enums;

public enum ValidEnum {


	NOTDELETED(0, "未删除"), DELETED(1, "已删除");

	private int id;
	private String name;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	private ValidEnum(int id, String name) {
		this.id = id;
		this.name = name;
	}

	ValidEnum() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static ValidEnum getValidEnum(int id) {
		for (ValidEnum validEnum : ValidEnum.values()) {
			if (validEnum.getId() == id) {
				return validEnum;
			}
		}
		return null;
	}
}
