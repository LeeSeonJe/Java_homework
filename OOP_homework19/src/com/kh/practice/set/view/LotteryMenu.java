package com.kh.practice.set.view;

import java.util.Scanner;
import java.util.Set;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();

	public void mainMenu() {
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 추첨 대상 추가");
		System.out.println("2. 추첨 대상 삭제");
		System.out.println("3. 당첨 대상 확인");
		System.out.println("4. 정렬된 당첨 대상 확인");
		System.out.println("5. 당첨 대상 검색");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 >> ");
		int input = sc.nextInt();
		if (input == 1) {
			insertObject();
		} else if (input == 2) {
			deleteObject();
		} else if (input == 3) {
			winObject();
		} else if (input == 4) {
			sortedWinObject();
		} else if (input == 5) {
			searchWinner();
		} else if (input == 9) {
			System.out.println("프로그램 종료");
		} else {
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			mainMenu();
		}
	}

	public void insertObject() {
		sc.nextLine();
		System.out.print("추가할 추첨 대상 수 : ");
		int input = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < input; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("핸드폰 번호('-'뺴고) : ");
			String phone = sc.nextLine();
			if (!lc.insertObject(new Lottery(name, phone))) {
				i--;
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				continue;
			} else {
				lc.insertObject(new Lottery(name, phone));
			}
		}
		System.out.println(input + "명 추가 완료");
		mainMenu();
	}

	public void deleteObject() {
		sc.nextLine();
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'뺴고) : ");
		String phone = sc.nextLine();
		if (lc.deleteObject(new Lottery(name, phone))) {
			System.out.println("삭제 완료되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
		mainMenu();
	}

	public void winObject() {
		if (lc.winObject() == null) {
			System.out.println("인원수가 부족합니다.");
		} else {
			System.out.println(lc.winObject());
		}
		mainMenu();
	}

	public void sortedWinObject() {
		if (lc.winObject() == null) {
			System.out.println("인원수가 부족합니다.");
		}
		lc.sortedWinObject();
		mainMenu();
	}

	public void searchWinner() {
		sc.nextLine();
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'뺴고) : ");
		String phone = sc.nextLine();
		if (lc.searchWinner(new Lottery(name, phone))) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
		mainMenu();
	}
}
