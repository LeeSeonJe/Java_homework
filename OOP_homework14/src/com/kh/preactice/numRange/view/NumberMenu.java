package com.kh.preactice.numRange.view;

import java.util.Scanner;

import com.kh.preactice.numRange.controller.NumberController;
import com.kh.preactice.numRange.exception.NumRangeException;

public class NumberMenu {
	NumberController nc = new NumberController();
	Scanner sc = new Scanner(System.in);

	public void menu() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		try {
			System.out.println(num1 + "은(는) " + num2 + "의 배수인가 ? " + nc.checkDouble(num1, num2));
		} catch (NumRangeException nre) {
			nre.printStackTrace();
			nre.getMessage();
		}
	}
}
