package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	TokenController tc = new TokenController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("1. ���� ���ڿ�");
		System.out.println("2. �Է� ���ڿ�");
		System.out.println("9. ���α׷� ������");
		System.out.print("�޴� ��ȣ : ");
		int input = sc.nextInt();
		sc.nextLine();
		if (input == 1) {
			tokenMenu();
			mainMenu();
		} else if (input == 2) {
			inputMenu();
			mainMenu();
		} else if (input == 9) {
			System.out.println("���α׷� ����");
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
			mainMenu();
		}

	}

	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("��ū ó�� �� ���� : " + str);
		System.out.println("��ū ó�� �� ���� : " + str.length());
		System.out.println("��ū ó�� �� ���� : " + tc.afterToken(str));
		System.out.println("��ū ó�� �� ���� : " + tc.afterToken(str).length());
	}

	public void inputMenu() {
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String input = sc.nextLine();
		System.out.println("ù ���� �빮�� : " + tc.firstCap(input));
		System.out.print("ã�� ���� �ϳ��� �Է��ϼ��� : ");
		char one = sc.nextLine().charAt(0);
		System.out.println(one + " ���ڰ� �� ���� : " + tc.findChar(input, one));
	}
}