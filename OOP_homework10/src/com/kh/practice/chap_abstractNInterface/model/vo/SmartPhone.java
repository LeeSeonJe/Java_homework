package com.kh.practice.chap_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {
	private String maker; // ������ ����

	public SmartPhone() {

	}

	public abstract String printlnformtion();

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
}