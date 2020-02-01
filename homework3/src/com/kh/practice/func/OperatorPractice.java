package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in); // 전역

	public void practice1() {
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
//		String result = num > 0 ? "양수다" : "양수가 아니다";
//		System.out.println(result);
		if (num > 0) {
			System.out.println("양수다");
		} else {
			System.out.println("양수가 아니다");
		}
	}

	public void practice2() {
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
//		String result = num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다");
//		System.out.println(result);

		if (num > 0) {
			System.out.println("양수다");
		} else if (num == 0) {
			System.out.println("0이다");
		} else {
			System.out.println("음수다");
		}
	}

	public void practice3() {
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
//		String result = num % 2 == 0 ? "짝수다" : "홀수다";
//		System.out.println(result);

		if (num % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}
	}

	public void practice4() {
		System.out.print("인원 수 : ");
		int num = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + candy / num);
		System.out.println("남은 사탕 개수 : " + candy % num);
	}

	public void practice5() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int classroom = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();

		String result = gender == 'M' ? "남학생" : "여학생";
		System.out.println(
				grade + "학년 " + classroom + "반 " + num + "번 " + name + " " + result + "의 성적은 " + score + "이다.");
	}

	public void practice6() {
		System.out.print("나이 : ");
		int age = sc.nextInt();
//		String result = age <= 13 ? "어린이" : (age > 19 ? "성인" : "청소년");
//		System.out.println(result);

		if (age > 0 && age <= 13) {
			System.out.println("어린이");
		} else if (age > 19) {
			System.out.println("성인");
		} else {
			System.out.println("청소년");
		}
	}

	public void practice7() {
		System.out.print("국어 : ");
		int kr = sc.nextInt();
		System.out.print("영어 : ");
		int en = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();

		boolean result = (kr >= 40 && en >= 40 && math >= 40);
		double avg = (kr + en + math) / 3.0;

//		System.out.println("합계 : " + (kr + en + math));
//		System.out.println("평균 : " + avg);
//		System.out.println(result && avg >= 60.0 ? "시험 합격" : "시험 불합격");
		if (result && avg >= 60) {
			System.out.println("시험 합격");
		} else {
			System.out.println("시험 불합격");
		}
	}

	public void practice8() {
		System.out.print("주민등록번호를 입력하세요(-포함) : ");
		String myNum = sc.nextLine();
		char ch = myNum.charAt(7);
//		System.out.println(ch == '1' || ch == '3' ? "남자" : "여자");
		if (ch == '1' || ch == '3') {
			System.out.println("남자");
		} else if (ch == '2' || ch == '4') {
			System.out.println("여자");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
	}

	public void practice9() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int input = sc.nextInt();
//		System.out.println(input <= num1 || input > num2 ? true : false);

		int min = 0;
		int max = 0;

		if (num1 < num2) {
			min = num1;
			max = num2;
		} else {
			min = num2;
			max = num1;
		}

		if (input < min || input > max) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public void practice10() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("정수3 : ");
		int num3 = sc.nextInt();
//		System.out.println(num1 == num2 && num2 == num3 && num1 == num3 ? true : false);
		boolean result = num1 == num2 && num2 == num3 && num1 == num3;
		if (result) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public void practice11() {
		System.out.print("A사원의 연봉 : ");
		int aSalary = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int bSalary = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int cSalary = sc.nextInt();

//		System.out.println("A사원의 연봉/연봉+a : " + aSalary + "/" + (aSalary * 1.4));
//		System.out.println(aSalary * 1.4 >= 3000 ? "3000 이상" : "3000 미만");
//		System.out.println("B사원의 연봉/연봉+a : " + bSalary + "/" + (bSalary * 1.0));
//		System.out.println(bSalary >= 3000 ? "3000 이상" : "3000 미만");
//		System.out.println("C사원의 연봉/연봉+a : " + cSalary + "/" + (cSalary * 1.15));
//		System.out.println(cSalary >= 3000 ? "3000 이상" : "3000 미만");

		System.out.println("A사원의 연봉/연봉+a : " + aSalary + "/" + (aSalary * 1.4));
		if (aSalary * 1.4 >= 3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		System.out.println("B사원의 연봉/연봉+a : " + bSalary + "/" + (bSalary * 1.0));
		if (bSalary * 1.0 >= 3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		System.out.println("C사원의 연봉/연봉+a : " + cSalary + "/" + (cSalary * 1.15));
		if (cSalary * 1.15 >= 3000) { // 소수를 2진수로 계산하기 때문에
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
	}
}
