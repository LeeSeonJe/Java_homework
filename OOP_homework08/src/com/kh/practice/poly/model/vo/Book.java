package com.kh.practice.poly.model.vo;

public class Book {
	private String title; // 도서명
	private String author; // 저자명
	private String pulbisher; // 출판사명

	public Book() {

	}

	public Book(String title, String author, String pulbisher) {
		super();
		this.title = title;
		this.author = author;
		this.pulbisher = pulbisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPulbisher() {
		return pulbisher;
	}

	public void setPulbisher(String pulbisher) {
		this.pulbisher = pulbisher;
	}

	@Override
	public String toString() {
		return "[Book [title = " + title + ", author = " + author + ", publisher = " + pulbisher + "]";
	}
}
