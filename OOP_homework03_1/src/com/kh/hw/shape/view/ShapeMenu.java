package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	TriangleController tc = new TriangleController();
	SquareController scr = new SquareController();
	Scanner sc = new Scanner(System.in);
	int type = 0;

	public void inputMenu() {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		type = sc.nextInt();
		if (type == 3) {
			traingleMenu();
		} else if (type == 4) {
			squareMenu();
		} else if (type == 9) {
			System.out.println("프로그램 종료");
		} else {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			inputMenu();
		}
	}

	public void traingleMenu() {
		System.out.println("===== 삼격형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		if (menuNum == 1 || menuNum == 2) {
			inputSize(type, menuNum);
			traingleMenu();
		} else if (menuNum == 3) {
			printInformation(type);
			traingleMenu();
		} else if (menuNum == 9) {
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
		} else {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			traingleMenu();
		}
	}

	public void squareMenu() {
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		if (menuNum == 1 || menuNum == 2 || menuNum == 3) {
			inputSize(type, menuNum);
			squareMenu();
		} else if (menuNum == 4) {
			printInformation(type);
			squareMenu();
		} else if (menuNum == 9) {
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
		} else {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요");
			squareMenu();
		}
	}

	private void inputSize(int type, int menuNum) {
		if (type == 3) {
			if (menuNum == 1) {
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				System.out.println("삼각형 면적 : " + tc.calcArea(height, width));
			} else if (menuNum == 2) {
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			} else if (menuNum == 3) {
				printInformation(type);
			}
		} else if (type == 4) {
			if (menuNum == 1) {
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				System.out.println("사각형의 둘레 : " + scr.calcPerimeter(height, width));
			} else if (menuNum == 2) {
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				System.out.println("사각형의 면적 : " + scr.calcArea(height, width));
			} else if (menuNum == 3) {
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			} else if (menuNum == 4) {
				printInformation(type);
			}
		}
	}

	private void printInformation(int type) {
		if (type == 3) {
			System.out.println(tc.print());
		} else if (type == 4) {
			System.out.println(scr.print());
		}
	}

}
