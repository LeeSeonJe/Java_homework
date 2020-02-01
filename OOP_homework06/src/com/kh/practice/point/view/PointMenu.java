package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int input = sc.nextInt();
		if (input == 1) {
			circleMenu();
			mainMenu();
		} else if (input == 2) {
			rectangleMenu();
			mainMenu();
		} else if (input == 9) {
			System.out.println("종료합니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
			mainMenu();
		}
	}

	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int input = sc.nextInt();
		if (input == 1) {
			calcCircum();
		} else if (input == 2) {
			calcCircleArea();
		} else if (input == 9) {
			System.out.println("메인으로 돌아갑니다.");
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
	}

	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int input = sc.nextInt();
		if (input == 1) {
			calcPerimeter();
		} else if (input == 2) {
			calcRectArea();
		} else if (input == 9) {
			System.out.println("메인으로 돌아갑니다.");
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
	}

	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcCircum(x, y, radius));
	}

	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcArea(x, y, radius));
	}

	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}

	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		System.out.println(rc.calcArea(x, y, height, width));
	}
}
