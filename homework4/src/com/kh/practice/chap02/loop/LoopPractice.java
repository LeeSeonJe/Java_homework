package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
//		����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
//		��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
//		���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		}
	}

	public void practice2() {
//		�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
//		��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		while (true) {
			System.out.print("���� �ϳ� �Է� : ");
			int num = sc.nextInt();
			if (num < 1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���");
				continue;
			} else {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			}
		}
	}

	public void practice3() {
//		����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���. 
//		��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		if (num < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
		} else {
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice4() {
//		�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ� 
//		��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���. 
		while (true) {
			System.out.print("���� �ϳ� �Է� : ");
			int num = sc.nextInt();
			if (num < 1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���");
				continue;
			} else {
				for (int i = num; i > 0; i--) {
					System.out.print(i + " ");
				}
				break;
			}
		}
	}

	public void practice5() {
//		1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.print(i);
			if (i == num) {
				System.out.print(" = " + sum);
			} else {
				System.out.print(" + ");
			}
		}
	}

	public void practice6() {
//		����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���. 
//		���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.

		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("ù ��° ���� : ");
		int num2 = sc.nextInt();
		int max, min = 0;
		if (num1 < num2) {
			min = num1;
			max = num2;
		} else {
			min = num2;
			max = num1;
		}
		if (min < 1 || max < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		} else {
			for (; min <= max; min++) {
				System.out.print(min + " ");
			}
		}
	}

	public void practice7() {
//		�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡱�� 
//		��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���
		while (true) {
			System.out.print("ù ��° ���� : ");
			int num1 = sc.nextInt();
			System.out.print("�� ��° ���� : ");
			int num2 = sc.nextInt();
			int max, min = 0;
			if (num1 < num2) {
				min = num1;
				max = num2;
			} else {
				min = num2;
				max = num1;
			}
			if (min < 1 || max < 1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
				continue;
			} else {
				for (; min <= max; min++) {
					System.out.print(min + " ");
				}
			}
			break;
		}
	}

	public void practice8() {
//		����ڷκ��� �Է� ���� ������ ���� ����ϼ���
		System.out.print("����  : ");
		int num = sc.nextInt();
		System.out.println("===== " + num + "�� =====");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
		}
	}

	public void practice9() {
//		����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���. 
//		��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.

		System.out.print("����  : ");
		int num = sc.nextInt();
		if (num > 9) {
			System.out.println("9������ ���ڸ� �Է����ּ���.");
		} else {
			for (int i = num; i < 10; i++) {
				System.out.println("===== " + i + "�� =====");
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
				System.out.println();
			}
		}
	}

	public void practice10() {
//		�� ������ ��� ���� �����ϳ�, 9�� �ʰ��ϴ� ���ڰ� �Էµƴٸ� ��9 ������ ���ڸ� �Է����ּ��䡱�� 
//		��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		while (true) {
			System.out.print("����  : ");
			int num = sc.nextInt();
			if (num > 9) {
				System.out.println("9������ ���ڸ� �Է����ּ���.");
				continue;
			} else {
				for (int i = num; i < 10; i++) {
					System.out.println("===== " + i + "�� =====");
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d * %d = %d\n", i, j, (i * j));
					}
					System.out.println();
				}
			}
			break;
		}
	}

	public void practice11() {
//		����ڷκ��� ���� ���ڿ� ������ �Է� �޾� 
//		������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ϼ���. 
//		��, ��µǴ� ���ڴ� �� 10���Դϴ�.
		System.out.print("���� ���� : ");
		int start = sc.nextInt();
		System.out.print("���� : ");
		int num = sc.nextInt();
		int sum = start;
		for (int i = 0; i < 10; i++) {
			System.out.print(sum + " ");
			sum += num;
		}
	}

	public void practice12() {
//		���� �� ���� �����ڸ� �Է� �ް� �Էµ� �����ڿ� ���� �˸��� ����� ����ϼ���.
//		��, �ش� ���α׷��� ������ �Է¿� ��exit����� ���� ���� ������ ���� �ݺ��ϸ� 
//		exit�� ������ �����α׷��� �����մϴ�.���� ����ϰ� �����մϴ�. 
//		���� �����ڰ� �������̸鼭 �� ��° ������ 0���� ������ 
//		��0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.���� ����ϸ�, 
//		���� �����ڰ� ���� �� ������ �������Դϴ�. �ٽ� �Է����ּ���.����� ����ϰ� 
//		�� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϼ���.

		while (true) {
			System.out.print("������(+, -, *, /, %) : ");
			String op = sc.next();
			if (op.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			char ch = op.charAt(0);
			if (ch == '+') {
				System.out.println(num1 + " " + ch + " " + num2 + " = " + (num1 + num2));
			} else if (ch == '-') {
				System.out.println(num1 + " " + ch + " " + num2 + " = " + (num1 - num2));
			} else if (ch == '*') {
				System.out.println(num1 + " " + ch + " " + num2 + " = " + (num1 * num2));
			} else if (ch == '/') {
				if (num1 == 0 || num2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
				} else {
					System.out.println(num1 + " " + ch + " " + num2 + " = " + (num1 / num2));
				}
			} else if (ch == '%') {
				if (num1 == 0 || num2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
				} else {
					System.out.println(num1 + " " + ch + " " + num2 + " = " + (num1 % num2));
				}
			} else {
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}

	public void practice13() {
//		������ ���� ���� ������ �����ϼ���.
//		ex. ���� �Է� : 
//			4
//			*
//			**
//			***
//			****
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice14() {
//		������ ���� ���� ������ �����ϼ���.
//		ex. ���� �Է� : 
//			4 
//			**** 
//			*** 
//			** 
//			*
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		for (int i = num; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice15() {
//		����ڷκ��� �Է� ���� �ϳ��� ���� �Ҽ����� �Ǻ��ϴ� ���α׷��� �����ϼ���. 
//		��, �Է��� ���� 2���� ���� ��� ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���.
//		
//		* ���Ҽ����� n�� 1���� n������ �������� �� ������ �������� ���� 1�� n���� ���� ���Ѵ�.
//		ex) 2, 3, 5, 7, 11 ��
		System.out.print("���� : ");
		int num = sc.nextInt();
		boolean bool = true;
		if (num < 3) {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					bool = false;
					break;
				}
			}
			if (bool) {
				System.out.println("�Ҽ��Դϴ�.");
			} else {
				System.out.println("�Ҽ��� �ƴմϴ�.");
			}
		}
	}

	public void practice16() {
//		�� ������ ��� ���� �����ϳ�, �Է��� ���� 2���� ���� ��� 
//		���߸� �Է��ϼ̽��ϴ�.���� ����ϸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
//		
//		* ���Ҽ����� n�� 1���� n������ �������� �� ������ �������� ���� 1�� n���� ���� ���Ѵ�. 
//		ex) 2, 3, 5, 7, 11 ��

		boolean bool = true;
		while (true) {
			System.out.print("���� : ");
			int num = sc.nextInt();
			if (num < 3) {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				continue;
			} else {
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						bool = false;
						break;
					}
				}
				break;
			}
		}
		if (bool) {
			System.out.println("�Ҽ��Դϴ�.");
		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
	}

	public void practice17() {
//		2���� ����ڰ� �Է��� �������� �Ҽ��� ��� ����ϰ� �Ҽ��� ������ ����ϼ���. 
//		��, �Է��� ���� 2���� ���� ��� ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���.
		System.out.print("���� : ");
		int num = sc.nextInt();
		int count = 0;
		int result = 0;
		if (num < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			for (int i = 2; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.print(i + " ");
					result++;
				}
				count = 0;
			}
			System.out.printf("\n2���� %d������ �Ҽ��� ������ %d���Դϴ�.\n", num, result);
		}
	}

	public void practice18() {
//		1���� ����ڿ��� �Է� ���� ������ �߿���
//		1) 2�� 3�� ����� ��� ����ϰ� 
//		2) 2�� 3�� ������� ������ ����ϼ���.
//		* ����������� �� �̻��� ���� ������ ������ ������ � ���� �ش� ����� ������ �� 
//		��� �������� 0�� ������ ��

		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int two = 2;
		int three = 3;
		int count = 0;
		for (int i = 2; i <= num; i++) {
			if (i % two == 0 || i % three == 0) {
				System.out.print(i + " ");
				if (i % two == 0 && i % three == 0) {
					count++;
				}
			}
		}
		System.out.print("\ncount : " + count);
	}

	public void practice19() {
//		ex. ���� �Է� : 4 
//			* 
//		   ** 
// 		  *** 
// 		 ****
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num; j > 0; j--) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void practice20() {
//		ex. ���� �Է� : 3 
//		* 
//		** 
//		*** 
//		** 
//		*
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= (num * 2 - 1); i++) {
			if (i <= num) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				count++;
				for (int j = num; j > count; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void practice21() {
//		ex. ���� �Է� : 4 
//		   * 
//		  *** 
//		 ***** 
//		*******
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int count1 = num, count2 = num;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= count1; j++) {
				if (j >= count2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			count1++;
			count2--;
			System.out.println();
		}
	}

	public void practice22() {
//		ex. ���� �Է� : 5 
//		***** 
//		*   * 
//		*   * 
//		*   * 
//		*****
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 1 || i == num) {
					System.out.print("*");
				} else if (j == 1 || j == num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
