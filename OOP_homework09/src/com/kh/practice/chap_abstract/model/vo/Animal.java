package com.kh.practice.chap_abstract.model.vo;

public abstract class Animal {
	private String name;
	private String kinds;

	protected Animal() {

	}

	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다.";
	}

	public abstract void speak();
}