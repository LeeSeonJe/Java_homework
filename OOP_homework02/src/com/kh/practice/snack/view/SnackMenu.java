package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();

	public void menu() {
		System.out.println("�������� �Է��ϼ���.");
		System.out.print("���� : ");
		String kind = sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�� : ");
		String flavor = sc.nextLine();
		System.out.print("���� : ");
		int numOf = sc.nextInt();
		System.out.print("���� : ");
		int price = sc.nextInt();
		System.out.println(scr.saveDate(kind, name, flavor, numOf, price));
		System.out.print("������ ������ Ȯ���Ͻðڽ��ϱ�?(y/n) : ");
		String input = sc.next();
		if (input.equalsIgnoreCase("y")) {
			System.out.println(scr.confirmDate());
		}
	}
}
