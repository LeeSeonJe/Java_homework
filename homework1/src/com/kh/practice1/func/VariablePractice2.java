package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void calc() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();

		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		System.out.println("���ϱ� ��� : " + sum);
		System.out.println("���� ��� : " + sub);
		System.out.println("���ϱ� ��� : " + mul);
		System.out.println("������ ��� : " + div);
		sc.close();
	}
}
