package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu {
	StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.println("========== �л� ���� ��� ==========");
		for (int i = 0; i < ssm.printStudent().length; i++) {
			System.out.println(ssm.printStudent()[i].inform());
		}
		System.out.println();
		System.out.println("========== �л� ���� ��� ==========");
		System.out.println("�л� ���� �հ� : " + ssm.avgScore()[0]);
		System.out.println("�л� ���� ��� : " + ssm.avgScore()[1]);
		System.out.println();
		System.out.println("========== �л� ��� ��� ==========");
		for (int i = 0; i < ssm.printStudent().length; i++) {
			if (ssm.printStudent()[i].getScore() > StudentController.CUT_LINE) {
				System.out.println(ssm.printStudent()[i].getName() + "�л��� ����Դϴ�.");
			} else {
				System.out.println(ssm.printStudent()[i].getName() + "�л��� ����� ����Դϴ�.");
			}
		}
	}
}
