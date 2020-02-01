package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();

	public void mainMenu() {
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + "명입니다");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + pc.personCount()[1] + "명입니다");

		System.out.println("1. 학생 메뉴");
		System.out.println("2. 사원 메뉴");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int input = sc.nextInt();
		if (input == 1) {
			studentMenu();
			mainMenu();
		} else if (input == 2) {
			employeeMenu();
			mainMenu();
		} else if (input == 9) {
			System.out.println("종료합니다.");
		} else {
			System.out.println("잘못 입력하였습니다.");
			mainMenu();
		}
	}

	public void studentMenu() {
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");
		if (pc.personCount()[0] == 3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더이상 활성화 되지 않습니다.");
		}
		System.out.print("메뉴 번호 : ");
		int input = sc.nextInt();
		if (input == 1) {
			if (pc.personCount()[0] == 3) {
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
				studentMenu();
			} else {
				insertStudent();
			}
		} else if (input == 2) {
			printStudent();
			studentMenu();
		} else if (input == 9) {
			System.out.println("메인으로 돌아갑니다.");
		} else {
			System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
			studentMenu();
		}
	}

	public void insertStudent() {
		System.out.print("학생 이름 : ");
		String name = sc.next();
		System.out.print("학생 나이 : ");
		int age = sc.nextInt();
		System.out.print("학생 키 : ");
		double height = sc.nextDouble();
		System.out.print("학생 몸무게 : ");
		double weight = sc.nextDouble();
		System.out.print("학생 학년 : ");
		int grade = sc.nextInt();
		System.out.print("학생 전공 : ");
		String major = sc.next();
		pc.insertStudent(name, age, height, weight, grade, major);
		System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
		String sel = sc.next();
		if (sel.equalsIgnoreCase("N")) {
			studentMenu();
		} else {
			if (pc.personCount()[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
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
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");
		if (pc.personCount()[1] == 10) {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더이상 활성화 되지 않습니다.");
		}
		System.out.print("메뉴 번호 : ");
		int input = sc.nextInt();
		if (input == 1) {
			if (pc.personCount()[1] == 10) {
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
				employeeMenu();
			} else {
				insetEmployee();
			}
		} else if (input == 2) {
			printEmployee();
			employeeMenu();
		} else if (input == 9) {
			System.out.println("메인으로 돌아갑니다.");
		} else {
			System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
			employeeMenu();
		}
	}

	public void insetEmployee() {
		System.out.print("사원 이름 : ");
		String name = sc.next();
		System.out.print("사원 나이 : ");
		int age = sc.nextInt();
		System.out.print("사원 키 : ");
		double height = sc.nextDouble();
		System.out.print("사원 몸무게 : ");
		double weight = sc.nextDouble();
		System.out.print("사원 연봉 : ");
		int salary = sc.nextInt();
		System.out.print("사원 부서 : ");
		String dept = sc.next();
		pc.inserEmployee(name, age, height, weight, salary, dept);
		System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
		String sel = sc.next();
		if (sel.equalsIgnoreCase("N")) {
			employeeMenu();
		} else {
			if (pc.personCount()[1] == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생메뉴로 돌아갑니다.");
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
