package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	public BookController bc = new BookController();
	Book[] b = new Book[10];
	public static int count = -1;

	public BookMenu() {

	}

	public void mainMenu() {
		System.out.println("1. 도서 추가 저장");
		System.out.println("2. 저장 도서 출력");
		System.out.println("9. 프로그램 끝내기");
		int input = sc.nextInt();
		if (input == 1) {
			fileSave();
		} else if (input == 2) {
			fileRead();
		} else if (input == 9) {
			System.out.println("프로그램 종료");
		} else {

		}
	}

	public void fileSave() {
		bc.makeFile();
		sc.nextLine();
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		sc.nextLine();
		String date = sc.nextLine();
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		b[++count] = new Book(title, author, price, dateSplit(date), discount);
		bc.fileSave(b);
		mainMenu();
	}

	private Calendar dateSplit(String date) {
		Calendar cal = Calendar.getInstance();
		String[] dateSplit = date.split("-");
		cal.set(Integer.parseInt(dateSplit[0]), Integer.parseInt(dateSplit[1]) - 1, Integer.parseInt(dateSplit[2]));
		return cal;
	}

	public void fileRead() {
		for (int i = 0; i < bc.fileRead().length; i++) {
			if (bc.fileRead()[i] == null) {
				break;
			} else {
				System.out.println(bc.fileRead()[i]);
			}
		}
		mainMenu();
	}
}
