package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void examResult() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		double kr = sc.nextDouble();
		System.out.print("���� ������ �Է��ϼ��� : ");
		double en = sc.nextDouble();
		System.out.print("���� ������ �Է��ϼ��� : ");
		double math = sc.nextDouble();
		
		int sum = (int)(kr + en + math);
		int ava = (int)((kr+en+math)/3);
		
		System.out.println("���� : " + sum);
		System.out.println("�� : " + ava);
		sc.close();
	}
}
