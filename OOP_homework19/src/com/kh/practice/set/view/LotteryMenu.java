package com.kh.practice.set.view;

import java.util.Scanner;
import java.util.Set;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();

	public void mainMenu() {
		System.out.println("******* ���� �޴� *******");
		System.out.println("1. ��÷ ��� �߰�");
		System.out.println("2. ��÷ ��� ����");
		System.out.println("3. ��÷ ��� Ȯ��");
		System.out.println("4. ���ĵ� ��÷ ��� Ȯ��");
		System.out.println("5. ��÷ ��� �˻�");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ >> ");
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
			System.out.println("���α׷� ����");
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			mainMenu();
		}
	}

	public void insertObject() {
		sc.nextLine();
		System.out.print("�߰��� ��÷ ��� �� : ");
		int input = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < input; i++) {
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�ڵ��� ��ȣ('-'����) : ");
			String phone = sc.nextLine();
			if (!lc.insertObject(new Lottery(name, phone))) {
				i--;
				System.out.println("�ߺ��� ����Դϴ�. �ٽ� �Է��ϼ���.");
				continue;
			} else {
				lc.insertObject(new Lottery(name, phone));
			}
		}
		System.out.println(input + "�� �߰� �Ϸ�");
		mainMenu();
	}

	public void deleteObject() {
		sc.nextLine();
		System.out.println("������ ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone = sc.nextLine();
		if (lc.deleteObject(new Lottery(name, phone))) {
			System.out.println("���� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		mainMenu();
	}

	public void winObject() {
		if (lc.winObject() == null) {
			System.out.println("�ο����� �����մϴ�.");
		} else {
			System.out.println(lc.winObject());
		}
		mainMenu();
	}

	public void sortedWinObject() {
		if (lc.winObject() == null) {
			System.out.println("�ο����� �����մϴ�.");
		}
		lc.sortedWinObject();
		mainMenu();
	}

	public void searchWinner() {
		sc.nextLine();
		System.out.println("�˻��� ����� �̸��� �ڵ��� ��ȣ�� �Է��ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�ڵ��� ��ȣ('-'����) : ");
		String phone = sc.nextLine();
		if (lc.searchWinner(new Lottery(name, phone))) {
			System.out.println("�����մϴ�. ��÷ ��Ͽ� �����մϴ�.");
		} else {
			System.out.println("��Ÿ������ ��÷ ��Ͽ� �������� �ʽ��ϴ�.");
		}
		mainMenu();
	}
}
