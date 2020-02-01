package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in); // ����

	public void practice1() {
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
//		String result = num > 0 ? "�����" : "����� �ƴϴ�";
//		System.out.println(result);
		if (num > 0) {
			System.out.println("�����");
		} else {
			System.out.println("����� �ƴϴ�");
		}
	}

	public void practice2() {
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
//		String result = num > 0 ? "�����" : (num == 0 ? "0�̴�" : "������");
//		System.out.println(result);

		if (num > 0) {
			System.out.println("�����");
		} else if (num == 0) {
			System.out.println("0�̴�");
		} else {
			System.out.println("������");
		}
	}

	public void practice3() {
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
//		String result = num % 2 == 0 ? "¦����" : "Ȧ����";
//		System.out.println(result);

		if (num % 2 == 0) {
			System.out.println("¦����");
		} else {
			System.out.println("Ȧ����");
		}
	}

	public void practice4() {
		System.out.print("�ο� �� : ");
		int num = sc.nextInt();
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();

		System.out.println("1�δ� ���� ���� : " + candy / num);
		System.out.println("���� ���� ���� : " + candy % num);
	}

	public void practice5() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int classroom = sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double score = sc.nextDouble();

		String result = gender == 'M' ? "���л�" : "���л�";
		System.out.println(
				grade + "�г� " + classroom + "�� " + num + "�� " + name + " " + result + "�� ������ " + score + "�̴�.");
	}

	public void practice6() {
		System.out.print("���� : ");
		int age = sc.nextInt();
//		String result = age <= 13 ? "���" : (age > 19 ? "����" : "û�ҳ�");
//		System.out.println(result);

		if (age > 0 && age <= 13) {
			System.out.println("���");
		} else if (age > 19) {
			System.out.println("����");
		} else {
			System.out.println("û�ҳ�");
		}
	}

	public void practice7() {
		System.out.print("���� : ");
		int kr = sc.nextInt();
		System.out.print("���� : ");
		int en = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();

		boolean result = (kr >= 40 && en >= 40 && math >= 40);
		double avg = (kr + en + math) / 3.0;

//		System.out.println("�հ� : " + (kr + en + math));
//		System.out.println("��� : " + avg);
//		System.out.println(result && avg >= 60.0 ? "���� �հ�" : "���� ���հ�");
		if (result && avg >= 60) {
			System.out.println("���� �հ�");
		} else {
			System.out.println("���� ���հ�");
		}
	}

	public void practice8() {
		System.out.print("�ֹε�Ϲ�ȣ�� �Է��ϼ���(-����) : ");
		String myNum = sc.nextLine();
		char ch = myNum.charAt(7);
//		System.out.println(ch == '1' || ch == '3' ? "����" : "����");
		if (ch == '1' || ch == '3') {
			System.out.println("����");
		} else if (ch == '2' || ch == '4') {
			System.out.println("����");
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}

	public void practice9() {
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է� : ");
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
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		System.out.print("����3 : ");
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
		System.out.print("A����� ���� : ");
		int aSalary = sc.nextInt();
		System.out.print("B����� ���� : ");
		int bSalary = sc.nextInt();
		System.out.print("C����� ���� : ");
		int cSalary = sc.nextInt();

//		System.out.println("A����� ����/����+a : " + aSalary + "/" + (aSalary * 1.4));
//		System.out.println(aSalary * 1.4 >= 3000 ? "3000 �̻�" : "3000 �̸�");
//		System.out.println("B����� ����/����+a : " + bSalary + "/" + (bSalary * 1.0));
//		System.out.println(bSalary >= 3000 ? "3000 �̻�" : "3000 �̸�");
//		System.out.println("C����� ����/����+a : " + cSalary + "/" + (cSalary * 1.15));
//		System.out.println(cSalary >= 3000 ? "3000 �̻�" : "3000 �̸�");

		System.out.println("A����� ����/����+a : " + aSalary + "/" + (aSalary * 1.4));
		if (aSalary * 1.4 >= 3000) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �̸�");
		}
		System.out.println("B����� ����/����+a : " + bSalary + "/" + (bSalary * 1.0));
		if (bSalary * 1.0 >= 3000) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �̸�");
		}
		System.out.println("C����� ����/����+a : " + cSalary + "/" + (cSalary * 1.15));
		if (cSalary * 1.15 >= 3000) { // �Ҽ��� 2������ ����ϱ� ������
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �̸�");
		}
	}
}
