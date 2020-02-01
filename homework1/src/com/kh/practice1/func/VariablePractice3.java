package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void rectArea() {
		Scanner sc = new Scanner(System.in);

		System.out.print("가로를 입력하세요 : ");
		double width = sc.nextDouble();
		System.out.print("세로를 입력하세요 : ");
		double height = sc.nextDouble();

		double area = width * height;
		double circum = (width + height) * 2;

		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + circum);
		
		sc.close();
	}
}
