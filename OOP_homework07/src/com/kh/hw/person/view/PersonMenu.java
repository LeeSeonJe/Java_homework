package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();

	public void mainMenu() {
		System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
		System.out.println("���� ����� �л��� " + pc.personCount()[0] + "���Դϴ�");
		System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
		System.out.println("���� ����� �л��� " + pc.personCount()[1] + "���Դϴ�");

		System.out.println("1. �л� �޴�");
		System.out.println("2. ��� �޴�");
		System.out.println("9. ������");
		System.out.print("�޴� ��ȣ : ");
		int input = sc.nextInt();
		if (input == 1) {
			studentMenu();
			mainMenu();
		} else if (input == 2) {
			employeeMenu();
			mainMenu();
		} else if (input == 9) {
			System.out.println("�����մϴ�.");
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			mainMenu();
		}
	}

	public void studentMenu() {
		System.out.println("1. �л� �߰�");
		System.out.println("2. �л� ����");
		System.out.println("9. ��������");
		if (pc.personCount()[0] == 3) {
			System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� ���̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
		}
		System.out.print("�޴� ��ȣ : ");
		int input = sc.nextInt();
		if (input == 1) {
			if (pc.personCount()[0] == 3) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.");
				studentMenu();
			} else {
				insertStudent();
			}
		} else if (input == 2) {
			printStudent();
			studentMenu();
		} else if (input == 9) {
			System.out.println("�������� ���ư��ϴ�.");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.");
			studentMenu();
		}
	}

	public void insertStudent() {
		System.out.print("�л� �̸� : ");
		String name = sc.next();
		System.out.print("�л� ���� : ");
		int age = sc.nextInt();
		System.out.print("�л� Ű : ");
		double height = sc.nextDouble();
		System.out.print("�л� ������ : ");
		double weight = sc.nextDouble();
		System.out.print("�л� �г� : ");
		int grade = sc.nextInt();
		System.out.print("�л� ���� : ");
		String major = sc.next();
		pc.insertStudent(name, age, height, weight, grade, major);
		System.out.print("�׸� �Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
		String sel = sc.next();
		if (sel.equalsIgnoreCase("N")) {
			studentMenu();
		} else {
			if (pc.personCount()[0] == 3) {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л��޴��� ���ư��ϴ�.");
				studentMenu();
			} else {
				insertStudent();
			}
		}
	}

	public void printStudent() {
		for (int i = 0; i < pc.personCount()[0]; i++) {
			System.out.println(pc.printStudent()[i].toString());
		}
	}

	public void employeeMenu() {
		System.out.println("1. ��� �߰�");
		System.out.println("2. ��� ����");
		System.out.println("9. ��������");
		if (pc.personCount()[1] == 10) {
			System.out.println("����� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� ���̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
		}
		System.out.print("�޴� ��ȣ : ");
		int input = sc.nextInt();
		if (input == 1) {
			if (pc.personCount()[1] == 10) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.");
				employeeMenu();
			} else {
				insetEmployee();
			}
		} else if (input == 2) {
			printEmployee();
			employeeMenu();
		} else if (input == 9) {
			System.out.println("�������� ���ư��ϴ�.");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���.");
			employeeMenu();
		}
	}

	public void insetEmployee() {
		System.out.print("��� �̸� : ");
		String name = sc.next();
		System.out.print("��� ���� : ");
		int age = sc.nextInt();
		System.out.print("��� Ű : ");
		double height = sc.nextDouble();
		System.out.print("��� ������ : ");
		double weight = sc.nextDouble();
		System.out.print("��� ���� : ");
		int salary = sc.nextInt();
		System.out.print("��� �μ� : ");
		String dept = sc.next();
		pc.inserEmployee(name, age, height, weight, salary, dept);
		System.out.print("�׸� �Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
		String sel = sc.next();
		if (sel.equalsIgnoreCase("N")) {
			employeeMenu();
		} else {
			if (pc.personCount()[1] == 10) {
				System.out.println("����� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л��޴��� ���ư��ϴ�.");
				employeeMenu();
			} else {
				insetEmployee();
			}
		}
	}

	public void printEmployee() {
		for (int i = 0; i < pc.personCount()[1]; i++) {
			System.out.println(pc.printEmployee()[i].toString());
		}
	}
}
