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
		System.out.println("===== ���� ���α׷� =====");
		System.out.println("3. �ﰢ��");
		System.out.println("4. �簢��");
		System.out.println("9. ���α׷� ����");
		System.out.print("�޴� ��ȣ : ");
		type = sc.nextInt();
		if (type == 3) {
			traingleMenu();
		} else if (type == 4) {
			squareMenu();
		} else if (type == 9) {
			System.out.println("���α׷� ����");
		} else {
			System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			inputMenu();
		}
	}

	public void traingleMenu() {
		System.out.println("===== ����� =====");
		System.out.println("1. �ﰢ�� ����");
		System.out.println("2. �ﰢ�� ��ĥ");
		System.out.println("3. �ﰢ�� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		if (menuNum == 1 || menuNum == 2) {
			inputSize(type, menuNum);
			traingleMenu();
		} else if (menuNum == 3) {
			printInformation(type);
			traingleMenu();
		} else if (menuNum == 9) {
			System.out.println("�������� ���ư��ϴ�.");
			inputMenu();
		} else {
			System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			traingleMenu();
		}
	}

	public void squareMenu() {
		System.out.println("===== �簢�� =====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. �簢�� ����");
		System.out.println("3. �簢�� ��ĥ");
		System.out.println("4. �簢�� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		if (menuNum == 1 || menuNum == 2 || menuNum == 3) {
			inputSize(type, menuNum);
			squareMenu();
		} else if (menuNum == 4) {
			printInformation(type);
			squareMenu();
		} else if (menuNum == 9) {
			System.out.println("�������� ���ư��ϴ�.");
			inputMenu();
		} else {
			System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���");
			squareMenu();
		}
	}

	private void inputSize(int type, int menuNum) {
		if (type == 3) {
			if (menuNum == 1) {
				System.out.print("���� : ");
				double height = sc.nextDouble();
				System.out.print("�ʺ� : ");
				double width = sc.nextDouble();
				System.out.println("�ﰢ�� ���� : " + tc.calcArea(height, width));
			} else if (menuNum == 2) {
				System.out.print("������ �Է��ϼ��� : ");
				String color = sc.next();
				tc.paintColor(color);
				System.out.println("���� �����Ǿ����ϴ�.");
			} else if (menuNum == 3) {
				printInformation(type);
			}
		} else if (type == 4) {
			if (menuNum == 1) {
				System.out.print("���� : ");
				double height = sc.nextDouble();
				System.out.print("�ʺ� : ");
				double width = sc.nextDouble();
				System.out.println("�簢���� �ѷ� : " + scr.calcPerimeter(height, width));
			} else if (menuNum == 2) {
				System.out.print("���� : ");
				double height = sc.nextDouble();
				System.out.print("�ʺ� : ");
				double width = sc.nextDouble();
				System.out.println("�簢���� ���� : " + scr.calcArea(height, width));
			} else if (menuNum == 3) {
				System.out.print("������ �Է��ϼ��� : ");
				String color = sc.next();
				scr.paintColor(color);
				System.out.println("���� �����Ǿ����ϴ�.");
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
