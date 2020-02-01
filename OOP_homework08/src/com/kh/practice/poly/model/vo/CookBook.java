package com.kh.practice.poly.model.vo;

public class CookBook extends Book {
	private boolean coupon;

	public CookBook() {

	}

	public CookBook(String title, String author, String pulbisher, boolean coupon) {
		super(title, author, pulbisher);
		this.coupon = coupon;
	}

	public boolean getCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return super.toString() + ", coupon = " + coupon + "]";
	}
}
