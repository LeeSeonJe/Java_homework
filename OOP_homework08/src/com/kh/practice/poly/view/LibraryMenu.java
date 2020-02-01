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
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("���� : ");
		char gender = sc.next().charAt(0);
		Member mem = new Member(name, age, gender, 0);
		// MemberŸ���� mem�� ���� ��ü�� �������ְ�
		lc.insertMember(mem);
		// mem�� �ּҰ��� �Ѱ���
		while (true) {
			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println(lc.myInfo());
				// ���ϰ� mem�� �޾� ���
				// �ּҰ��� ��µǾ���ϳ� toString �������̵��� ���ؼ�
				// mem.toString�� ���� �ʾƵ� toString�� ��ǥ������ �Ѿ���� ������ .toString ��������
			} else if (input == 2) {
				selectAll();
			} else if (input == 3) {
				searchBook();
			} else if (input == 4) {
				rentBook();
			} else if (input == 9) {
				System.out.println("���α׷� ����");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	}

	public void selectAll() {
		for (int i = 0; i < lc.selectAll().length; i++) {
			if (lc.selectAll()[i] instanceof CookBook) {
				System.out.println(i + "�� ���� : CookBook " + lc.selectAll()[i]);
			} else if (lc.selectAll()[i] instanceof AniBook) {
				System.out.println(i + "�� ���� : AniBook " + lc.selectAll()[i]);
			}
		}
	}

	public void searchBook() {
		System.out.print("�˻��� ���� Ű���� : ");
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
		System.out.print("�뿩�� ���� ��ȣ �˻� : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		if (result == 0) {
			System.out.println("���������� �뿩�Ͽ����ϴ�.");
		} else if (result == 1) {
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
		} else {
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
		}
	}

}
