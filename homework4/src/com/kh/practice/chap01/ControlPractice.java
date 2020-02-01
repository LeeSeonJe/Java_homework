package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
//		�Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���,
//		���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���.
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
//		if��
//		if (num == 1) {
//			System.out.println("�Է� �޴��Դϴ�.");
//		} else if (num == 2) {
//			System.out.println("���� �޴��Դϴ�.");
//		} else if (num == 3) {
//			System.out.println("��ȸ �޴��Դϴ�.");
//		} else if (num == 4) {
//			System.out.println("���� �޴��Դϴ�.");
//		} else if (num == 7) {
//			System.out.println("�����մϴ�.");
//		} else {
//			System.out.println("�߸��� �Է��Դϴ�.");
//		}

//		switch��
		switch (num) {
		case 1:
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		case 4:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 7:
			System.out.println("�����մϴ�.");
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}

	public void practice2() {
//		Ű����� ������ �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ�
//		¦���� �ƴϸ� "Ȧ����"�� ����ϼ���.
//		����� �ƴϸ� "����� �Է����ּ���."�� ����ϼ���
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("����� �Է����ּ���.");
		} else if (num == 0) {
			System.out.println("0�̴�.");
		} else if (num % 2 != 0) {
			System.out.println("Ȧ����.");
		} else {
			System.out.println("¦����.");
		}
	}

	public void practice3() {
//		����, ����, ���� �� ������ ������ Ű����� �Է� �ް� �հ�� ����� ����ϰ�
//		�հ�� ����� �̿��Ͽ� �հ� / ���հ� ó���ϴ� ����� �����ϼ���.
//		(�հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���)
//		�հ� ���� ��� ���� �� ������ �հ�, ���, �������մϴ�, �հ��Դϴ�!���� ����ϰ�
//		���հ��� ��쿡�� �����հ��Դϴ�.���� ����ϼ���.

		System.out.print("���� : ");
		int kr = sc.nextInt();
		System.out.print("���� : ");
		int en = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();

		int sum = kr + en + math;
		double avg = sum / 3.0;
		boolean bool = (kr >= 40 && en >= 40 && math >= 40);

		if (bool && avg >= 60) {
			System.out.println("���� : " + kr);
			System.out.println("���� : " + en);
			System.out.println("���� : " + math);
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}

	public void practice4() {
//		���� �ڷ�(7page)���� if������ �Ǿ��ִ� ��, ����, ����, �ܿ� ������ switch������ �ٲ㼭 ����ϼ���
		System.out.print("1~12 ������ ���� �Է� : ");
		int num = sc.nextInt();
		String season = null;
		switch (num) {
		case 12:
		case 1:
		case 2:
			season = "�ܿ�";
			break;
		case 3:
		case 4:
		case 5:
			season = "��";
			break;
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		case 9:
		case 10:
		case 11:
			season = "�ܿ�";
			break;
		default:
			System.out.println(num + "���� �߸� �Էµ� ���Դϴ�.");
			return;
		}
		System.out.println(num + "���� " + season + "�Դϴ�.");
	}

	public void practice5() {
//		���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���.
//		�α��� ���� �� ���α��� ������,
//		���̵� Ʋ���� �� �����̵� Ʋ�Ƚ��ϴ�.��,
//		��й�ȣ�� Ʋ���� �� ����й�ȣ�� Ʋ�Ƚ��ϴ�.���� ����ϼ���.

		String id = "myId";
		String passwd = "myPassword12";

		System.out.print("���̵� : ");
		String inputId = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String inputPasswd = sc.nextLine();

		if (id.equals(inputId) && passwd.equals(inputPasswd)) {
			System.out.println("�α��� ����");
		} else if (id.equals(inputId)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else if (passwd.equals(inputPasswd)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.println("�ٽ� �Է��ϼ���.");
		}
	}

	public void practice6() {
//		����ڿ��� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է� �޾� �� ����� ���� �� �ִ� ������ ����ϼ���.
//		��, �����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
//		ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
//		��ȸ���� �Խñ� ��ȸ�� �����մϴ�

		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String user = sc.nextLine();

		if (user.equals("������")) {
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
		} else if (user.equals("ȸ��")) {
			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
		} else if (user.equals("��ȸ��")) {
			System.out.println("�Խñ� ��ȸ");
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}

	public void practice7() {
//		Ű, �����Ը� double�� �Է� �ް� BMI������ ����Ͽ� ��� ����� ����
//		��ü��/����ü��/��ü��/���� ����ϼ���.
//		BMI = ������ / (Ű(m) * Ű(m))
//		BMI�� 18.5�̸��� ��� ��ü�� / 18.5�̻� 23�̸��� ��� ����ü��
//		BMI�� 23�̻� 25�̸��� ��� ��ü�� / 25�̻� 30�̸��� ��� ��
//		BMI�� 30�̻��� ��� �� ��

		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);
		System.out.println("BMI ���� : " + bmi);
		if (bmi >= 30) {
			System.out.println("�� ��");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("��");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("��ü��");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("����ü��");
		} else {
			System.out.println("��ü��");
		}
	}

	public void practice8() {
//		Ű����� �� ���� ������ ���� ��ȣ�� �Է� �޾� ���� ��ȣ�� ���� ���� ����� ����ϼ���.
//		(��, �� ���� ���� ��� ����� ���� �۵��ϸ� ���� ���� ��ȣ�� �Է� ���� ��
//		���߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.�� ���)
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char op = sc.next().charAt(0);

//		boolean bool = (op == '+' || op == '-' || op == '*' || op == '/' || op == '%');
//		if (num1 > 0 && num2 > 0 && bool) {
//			System.out.printf("%d %c %d = %ld",num1,op,num2,);
//		}
		if (num1 > 0 && num2 > 0) {
			if (op == '+') {
				System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));
			} else if (op == '-') {
				System.out.printf("%d - %d = %d", num1, num2, (num1 - num2));
			} else if (op == '*') {
				System.out.printf("%d * %d = %d", num1, num2, (num1 * num2));
			} else if (op == '/') {
				System.out.printf("%d / %d = %f", num1, num2, (double) num1 / num2);
			} else if (op == '%') {
				System.out.printf("%d / %d = %d", num1, num2, (num1 % num2));
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
		} else {
			System.out.println("����� �ƴմϴ�.");
		}
	}

	public void practice9() {
//		�߰����, �⸻���, ��������, �⼮ȸ���� �Է��ϰ� Pass �Ǵ� Fail�� ����ϼ���.
//		�� ������ �߰���� 20%, �⸻��� 30%, ���� 30%, �⼮ 20%�� �̷���� �ְ�
//		�� ��, �⼮ ������ �⼮ ȸ���� �� ���� ȸ�� 20ȸ �߿��� �⼮�� ���� ���� ������ ����ϼ���.
//		70�� �̻��� ��� Pass, 70�� �̸��̰ų� ��ü ���ǿ� 30% �̻� �Ἦ �� Fail�� ����ϼ���.
		System.out.print("�߰� ��� ���� : ");
		int mid = sc.nextInt();
		System.out.print("�⸻ ��� ���� : ");
		int end = sc.nextInt();
		System.out.print("���� ���� : ");
		int hw = sc.nextInt();
		System.out.print("�⼮ ���� : ");
		int ch = sc.nextInt();

		double midT = mid * 0.2;
		double endT = end * 0.3;
		double hwT = hw * 0.3;
		double chT = 20.0 * 0.3;

		double total = (midT + endT + hwT + ch);
		System.out.println("===========���===========");
		if (chT <= 20 - ch) {
			System.out.println("Fail [�⼮ Ƚ�� ���� (" + ch + "/20)]");
		} else {
			System.out.println("�߰���� ����(20) : " + midT);
			System.out.println("�⸻��� ����(30) : " + endT);
			System.out.println("���� ����    (30) : " + hwT);
			System.out.println("�⼮ ����    (20) : " + (double) ch);
			System.out.println("����  : " + total);
			if (total >= 70) {
				System.out.println("Pass");
			} else if (total < 70) {
				System.out.println("Fail [���� �̴�]");
			}
		}
	}

	public void practice10() {
		System.out.println("������ ����� �����ϼ���");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		System.out.print("���� : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
	}

	public void practice11() {
//		������ �̿��ؼ� 4�ڸ� ��й�ȣ�� ������� �ϴµ� 
//		�� �� 4�ڸ� ������ �Է� �޾� �� �ڸ� ���� �ߺ��Ǵ� ���� ���� ��� ������ ������ 
//		�ߺ� ���� ������ ���ߺ� �� ������ �ڸ����� �� ������ ���ڸ� �� �� ������ ��� 
//		��, ���� ���ڸ� ���� ���� 1~9 ���� ����
		System.out.print("��й�ȣ �Է�(1000~9999) : ");
		String num = sc.next();
		if (num.length() < 4 || num.length() > 4) {
			System.out.println("�ڸ��� �ȸ���");
		} else {
			char su1 = num.charAt(0);
			char su2 = num.charAt(1);
			char su3 = num.charAt(2);
			char su4 = num.charAt(3);
			boolean bool = (su1 == su2) || (su1 == su2) || (su1 == su3) || (su1 == su4) || (su2 == su3) || (su2 == su4)
					|| (su3 == su4);
			if (su1 == '0') {
				System.out.println("���� ����");
			} else if (bool) {
				System.out.println("�ߺ� �� ����");
			} else {
				System.out.println("���� ����");
			}
		}
	}
}
