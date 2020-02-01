package com.kh.practice.poly.view;

import java.util.Scanner;

import com.kh.practice.poly.controller.LibraryController;
import com.kh.practice.poly.model.vo.AniBook;
import com.kh.practice.poly.model.vo.CookBook;
import com.kh.practice.poly.model.vo.Member;

public class LibraryMenu {

	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();

	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		Member mem = new Member(name, age, gender, 0);
		// Member타입의 mem을 통해 객체를 생성해주고
		lc.insertMember(mem);
		// mem의 주소값을 넘겨줌
		while (true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println(lc.myInfo());
				// 리턴값 mem을 받아 출력
				// 주소값이 출력되어야하나 toString 오버라이딩을 통해서
				// mem.toString을 쓰지 않아도 toString이 대표값으로 넘어오기 때문에 .toString 생략가능
			} else if (input == 2) {
				selectAll();
			} else if (input == 3) {
				searchBook();
			} else if (input == 4) {
				rentBook();
			} else if (input == 9) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
	}

	public void selectAll() {
		for (int i = 0; i < lc.selectAll().length; i++) {
			if (lc.selectAll()[i] instanceof CookBook) {
				System.out.println(i + "번 도서 : CookBook " + lc.selectAll()[i]);
			} else if (lc.selectAll()[i] instanceof AniBook) {
				System.out.println(i + "번 도서 : AniBook " + lc.selectAll()[i]);
			}
		}
	}

	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		sc.nextLine();
		String keyword = sc.nextLine();
		for (int i = 0; i < lc.searchBook(keyword).length; i++) {
			if (lc.searchBook(keyword)[i] != null) {
				System.out.println(lc.searchBook(keyword)[i]);
			}
		}
	}

	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 검색 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		if (result == 0) {
			System.out.println("성공적으로 대여하였습니다.");
		} else if (result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
	}

}
