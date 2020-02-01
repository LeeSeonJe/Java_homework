package com.kh.practice.map.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();

	public void mainMenu() {
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 같은 이름 회원 찾기");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호  >> ");
		int input = sc.nextInt();
		if (input == 1) {
			sc.nextLine();
			joinMembership();
		} else if (input == 2) {
			sc.nextLine();
			login();
		} else if (input == 3) {
			sc.nextLine();
			sameName();
		} else if (input == 9) {
			System.out.println("프로그램 종료");
		} else {
			System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
		}
	}

	public void joinMembership() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		if (mc.joinMembership(id, new Member(password, name))) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
			mainMenu();
		} else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			joinMembership();
		}
	}

	public void login() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		String result = mc.login(id, password);
		if (result != null) {
			System.out.println(result + "님, 환영합니다.");
			memberMenu();
		} else {
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			login();
		}
	}

	public void sameName() {
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		TreeMap<String, Member> result = mc.sameName(name);
		Set<String> set = result.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(result.get(key).getName() + " - " + key);
		}
		mainMenu();
	}

	public void memberMenu() {
		System.out.println("******* 회원 메뉴 *******");
		System.out.println("1. 비밀번호 바꾸기");
		System.out.println("2. 이름 바꾸기");
		System.out.println("3. 로그아웃");
		System.out.print("메뉴 번호  >> ");
		int input = sc.nextInt();
		if (input == 1) {
			sc.nextLine();
			changePassword();
		} else if (input == 2) {
			sc.nextLine();
			changeName();
		} else if (input == 3) {
			System.out.println("로그아웃 되었습니다.");
			mainMenu();
		} else {
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			memberMenu();
		}
	}

	public void changePassword() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("현재 비밀번호 : ");
		String oldPw = sc.nextLine();
		System.out.print("새로운 비밀번호 : ");
		String newPw = sc.nextLine();
		System.out.println(mc.changhPassword(id, oldPw, newPw));
		memberMenu();
	}

	public void changeName() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("현재 설정된 이름 : ");
		String name = sc.nextLine();
		System.out.print("변경할 이름  : ");
		String newName = sc.nextLine();
		if (mc.login(id, password).equals(name)) {
			mc.changeName(id, newName);
		} else {
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
			changeName();
		}
		memberMenu();
	}
}
