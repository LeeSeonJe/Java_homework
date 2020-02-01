package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	Scanner sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();
	int count = 0;

	public EmployeeMenu() {
		while (true) {
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("3. ��� ����");
			System.out.println("4. ��� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ�� �������� : ");
			int input = sc.nextInt(); 
			if (input == 1) {
				count++;
				insertEmp();
			} else if (input == 2) {
				count++;
				updateEmp();
			} else if (input == 3) {
				count++;
				deleteEmp();
			} else if (input == 4) {
				printEmp();
			} else if (input == 9) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("��ȣ�� �߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���");
			}
		}
	}

	public void insertEmp() {
		System.out.print("��� ��ȣ : ");
		int empNo = sc.nextInt();
		System.out.print("��� �̸� : ");
		String name = sc.next();
		System.out.print("��� ���� : ");
		char gender = sc.next().charAt(0);
		System.out.print("��ȭ ��ȣ : ");
		String phone = sc.next();
		System.out.print("�߰� ������ �� �Է��Ͻðڽ��ϱ�? : ");
		String input = sc.next();
		if (input.equalsIgnoreCase("n")) {
			ec.add(empNo, name, gender, phone);
		} else if (input.equalsIgnoreCase("y")) {
			System.out.print("��� �μ� : ");
			String dept = sc.next();
			System.out.print("��� ���� : ");
			int salary = sc.nextInt();
			System.out.print("���ʽ� �� : ");
			double bonus = sc.nextDouble();
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
		}
	}

	public void updateEmp() {
		System.out.println("���� �ֽ��� ��� ������ �����ϰ� �˴ϴ�.");
		System.out.println("����� � ������ �����Ͻðڽ��ϱ�?");
		System.out.println("1. ��ȭ ��ȣ");
		System.out.println("2. ��� ����");
		System.out.println("3. ���ʽ� ��");
		System.out.println("9. ���ư���");
		System.out.print("�޴� ��ȣ�� �������� : ");
		int input = sc.nextInt();
		if (input == 1) {
			System.out.print("������ ��ȭ ��ȣ : ");
			String phone = sc.next();
			ec.modify(phone);
		} else if (input == 2) {
			System.out.print("������ ��� ���� : ");
			int salary = sc.nextInt();
			ec.modify(salary);
		} else if (input == 3) {
			System.out.print("������ ���ʽ� �� : ");
			double bonus = sc.nextDouble();
			ec.modify(bonus);
		} else if (input == 9) {
			System.out.println("���θ޴��� ���ư��ϴ�.");
		}
	}

	public void deleteEmp() {
		System.out.print("���� �����Ͻðڽ��ϱ�? : ");
		String input = sc.next();
		if (input.equalsIgnoreCase("y")) {
			ec.remove();
			System.out.println("������ ������ �����Ͽ����ϴ�.");
		} else if (input.equalsIgnoreCase("n")) {
			System.out.println("������ ������ �����Ͽ����ϴ�.");
		}
	}

	public void printEmp() {
		if (count == 0) {
			System.out.println("��� �����Ͱ� �����ϴ�.");
		} else {
			System.out.println(ec.inform());
		}
	}
}
