package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void uniCasting() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);

		int uni = (int) ch;

		System.out.println("a unicode : " + uni);
		sc.close();
	}
}
