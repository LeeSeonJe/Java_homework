package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void rectArea() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���θ� �Է��ϼ��� : ");
		double width = sc.nextDouble();
		System.out.print("���θ� �Է��ϼ��� : ");
		double height = sc.nextDouble();

		double area = width * height;
		double circum = (width + height) * 2;

		System.out.println("���� : " + area);
		System.out.println("�ѷ� : " + circum);
		
		sc.close();
	}
}
