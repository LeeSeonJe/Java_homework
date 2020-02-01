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
		System.out.println("******* ���� �޴� *******");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		System.out.println("3. ���� �̸� ȸ�� ã��");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ  >> ");
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
			System.out.println("���α׷� ����");
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
		}
	}

	public void joinMembership() {
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		if (mc.joinMembership(id, new Member(password, name))) {
			System.out.println("���������� ȸ������ �Ϸ��Ͽ����ϴ�.");
			mainMenu();
		} else {
			System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
			joinMembership();
		}
	}

	public void login() {
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		String result = mc.login(id, password);
		if (result != null) {
			System.out.println(result + "��, ȯ���մϴ�.");
			memberMenu();
		} else {
			System.out.println("Ʋ�� ���̵� �Ǵ� ��й�ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			login();
		}
	}

	public void sameName() {
		System.out.print("�˻��� �̸� : ");
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
		System.out.println("******* ȸ�� �޴� *******");
		System.out.println("1. ��й�ȣ �ٲٱ�");
		System.out.println("2. �̸� �ٲٱ�");
		System.out.println("3. �α׾ƿ�");
		System.out.print("�޴� ��ȣ  >> ");
		int input = sc.nextInt();
		if (input == 1) {
			sc.nextLine();
			changePassword();
		} else if (input == 2) {
			sc.nextLine();
			changeName();
		} else if (input == 3) {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			mainMenu();
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			memberMenu();
		}
	}

	public void changePassword() {
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("���� ��й�ȣ : ");
		String oldPw = sc.nextLine();
		System.out.print("���ο� ��й�ȣ : ");
		String newPw = sc.nextLine();
		System.out.println(mc.changhPassword(id, oldPw, newPw));
		memberMenu();
	}

	public void changeName() {
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		System.out.print("���� ������ �̸� : ");
		String name = sc.nextLine();
		System.out.print("������ �̸�  : ");
		String newName = sc.nextLine();
		if (mc.login(id, password).equals(name)) {
			mc.changeName(id, newName);
		} else {
			System.out.println("�̸� ���濡 �����߽��ϴ�. �ٽ� �Է����ּ���");
			changeName();
		}
		memberMenu();
	}
}
