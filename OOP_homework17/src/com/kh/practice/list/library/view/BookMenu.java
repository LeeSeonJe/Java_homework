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
		System.out.println("=====***** ���� �޴� *****=====");
		System.out.println("1. �� ���� �߰�");
		System.out.println("2. ���� ��ü ��ȸ");
		System.out.println("3. ���� �˻� ��ȸ");
		System.out.println("4. ���� ����");
		System.out.println("5. ���� �� �������� ����");
		System.out.println("9. ����");
		System.out.print("�޴� �Է� : ");
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
			System.out.println("���α׷� ����");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			mainMenu();
		}
	}

	public void insertBook() {
		sc.nextLine();
		System.out.println("===== �� ���� �߰� =====");
		System.out.println("å ������ �Է����ּ���.");
		System.out.print("���� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String author = sc.nextLine();
		System.out.print("�帣(1. �ι� / 2. ���� / 3. �ܱ��� / 4. ��Ÿ) : ");
		int sel = sc.nextInt();
		System.out.print("���� : ");
		int price = sc.nextInt();
		String category = "";
		if (sel == 1) {
			category = "�ι�";
		} else if (sel == 2) {
			category = "����";
		} else if (sel == 3) {
			category = "�ܱ���";
		} else if (sel == 4) {
			category = "��Ÿ";
		}

		Book b = new Book(title, author, category, price);
		bc.insertBook(b);
		mainMenu();
	}

	public void selectList() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList = bc.selectList();
		if (bc.selectList().isEmpty()) {
			System.out.println("�����ϴ� ������ �����ϴ�.");
		} else {
			for (int i = 0; i < bc.selectList().size(); i++) {
				System.out.println(bookList.get(i));
			}
		}
		mainMenu();
	}

	public void searchBook() {
		sc.nextLine();
		System.out.print("�˻� Ű���� : ");
		String keyword = sc.nextLine();
		if (bc.searchBook(keyword).isEmpty()) {
			System.out.println("�˻������ �����ϴ�.");
		} else {
			for (Book b : bc.searchBook(keyword)) {
				System.out.println(b);
			}
		}
		mainMenu();
	}

	public void deleteBook() {
		sc.nextLine();
		System.out.print("1. ������ ���� �� : ");
		String title = sc.nextLine();
		System.out.print("2. ������ ���� �� : ");
		String author = sc.nextLine();
		if (bc.deleteBook(title, author)) {
			System.out.println("���������� �����Ͽ����ϴ�.");
		} else {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		}
		mainMenu();
	}

	public void ascBook() {
		if (bc.ascBook() == 1) {
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		} else {
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		}
		mainMenu();
	}
}
