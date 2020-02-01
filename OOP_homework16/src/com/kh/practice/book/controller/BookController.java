package com.kh.practice.book.controller;

import java.io.File;
import java.io.IOException;

import com.kh.practice.book.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	BookDAO bd = new BookDAO();

	public void makeFile() {
		File f = new File("book.txt");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileSave(Book[] b) {
		bd.fileSave(b);
	}

	public Book[] fileRead() {
		return bd.fileRead();
	}
}
