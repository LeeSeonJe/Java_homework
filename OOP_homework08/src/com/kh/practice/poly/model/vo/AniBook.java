package com.kh.practice.poly.model.vo;

public class AniBook extends Book {
	private int accessAge;

	public AniBook() {

	}

	public AniBook(String title, String author, String pulbisher, int accessAge) {
		super(title, author, pulbisher);
		this.accessAge = accessAge;
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return super.toString() + ", accessAge = " + accessAge + "]";
	}

}
