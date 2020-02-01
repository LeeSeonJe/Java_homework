package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("===== �޴� =====");
		System.out.println("1. ��");
		System.out.println("2. �簢��");
		System.out.println("9. ������");
		System.out.print("�޴� ��ȣ : ");
		int input = sc.nextInt();
		if (input == 1) {
			circleMenu();
			mainMenu();
		} else if (input == 2) {
			rectangleMenu();
			mainMenu();
		} else if (input == 9) {
			System.out.println("�����մϴ�.");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			mainMenu();
		}
	}

	public void circleMenu() {
		System.out.println("===== �� �޴� =====");
		System.out.println("1. �� �ѷ�");
		System.out.println("2. �� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int input = sc.nextInt();
		if (input == 1) {
			calcCircum();
		} else if (input == 2) {
			calcCircleArea();
		} else if (input == 9) {
			System.out.println("�������� ���ư��ϴ�.");
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
	}

	public void rectangleMenu() {
		System.out.println("===== �簢�� �޴� =====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. �簢�� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		int input = sc.nextInt();
		if (input == 1) {
			calcPerimeter();
		} else if (input == 2) {
			calcRectArea();
		} else if (input == 9) {
			System.out.println("�������� ���ư��ϴ�.");
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
	}

	public void calcCircum() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcCircum(x, y, radius));
	}

	public void calcCircleArea() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcArea(x, y, radius));
	}

	public void calcPerimeter() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.print("�ʺ� : ");
		int width = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}

	public void calcRectArea() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.print("�ʺ� : ");
		int width = sc.nextInt();
		System.out.println(rc.calcArea(x, y, height, width));
	}
}
