package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void myInform() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("������ �Է��ϼ���(��/��) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ��� : ");
		double height = sc.nextDouble();

		System.out.println("Ű " + height + "cm�� " + age + "�� " + gender + "�� " + name + "�� �ݰ����ϴ� ^^");
		System.out.printf("Ű %.1fcm�� %d�� %c�� %s�� �ݰ����ϴ� ^^", height, age, gender, name);
		sc.close();
	}
}
