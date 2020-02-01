package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void examResult() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		double kr = sc.nextDouble();
		System.out.print("영어 점수를 입력하세요 : ");
		double en = sc.nextDouble();
		System.out.print("수학 점수를 입력하세요 : ");
		double math = sc.nextDouble();
		
		int sum = (int)(kr + en + math);
		int ava = (int)((kr+en+math)/3);
		
		System.out.println("총점 : " + sum);
		System.out.println("평군 : " + ava);
		sc.close();
	}
}
