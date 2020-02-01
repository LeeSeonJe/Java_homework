package com.kh.practice.chap_abstractNInterface.model.vo;

public interface CellPhone extends Phone, Camera {
	public String charge(); // 충전 방식
}
