package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void uniCasting() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		char ch = sc.nextLine().charAt(0);

		int uni = (int) ch;

		System.out.println("a unicode : " + uni);
		sc.close();
	}
}
