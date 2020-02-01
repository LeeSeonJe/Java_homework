package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();

	public void mainMenu() {
		System.out.println("=====***** 메인 메뉴 *****=====");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 입력 : ");
		int input = sc.nextInt();
		if (input == 1) {
			insertBook();
		} else if (input == 2) {
			selectList();
		} else if (input == 3) {
			searchBook();
		} else if (input == 4) {
			deleteBook();
		} else if (input == 5) {
			ascBook();
		} else if (input == 9) {
			System.out.println("프로그램 종료");
		} else {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			mainMenu();
		}
	}

	public void insertBook() {
		sc.nextLine();
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int sel = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		String category = "";
		if (sel == 1) {
			category = "인문";
		} else if (sel == 2) {
			category = "과학";
		} else if (sel == 3) {
			category = "외국어";
		} else if (sel == 4) {
			category = "기타";
		}

		Book b = new Book(title, author, category, price);
		bc.insertBook(b);
		mainMenu();
	}

	public void selectList() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList = bc.selectList();
		if (bc.selectList().isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (int i = 0; i < bc.selectList().size(); i++) {
				System.out.println(bookList.get(i));
			}
		}
		mainMenu();
	}

	public void searchBook() {
		sc.nextLine();
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		if (bc.searchBook(keyword).isEmpty()) {
			System.out.println("검색결과가 없습니다.");
		} else {
			for (Book b : bc.searchBook(keyword)) {
				System.out.println(b);
			}
		}
		mainMenu();
	}

	public void deleteBook() {
		sc.nextLine();
		System.out.print("1. 삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.print("2. 삭제할 저자 명 : ");
		String author = sc.nextLine();
		if (bc.deleteBook(title, author)) {
			System.out.println("성공적으로 삭제하였습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		mainMenu();
	}

	public void ascBook() {
		if (bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
		mainMenu();
	}
}
