package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		int[] arr = new int[10];

		for (int i = arr.length - 1; i > -1; i--) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {
		System.out.print("��� �Է� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {
		String[] arr = new String[] { "���", "��", "����", "������", "����" };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("��")) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

	public void practice5() {
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		int count = 0;
		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + " ���� : " + count);
	}

	public void practice6() {
		String[] arr = new String[] { "��", "ȭ", "��", "��", "��", "��", "��" };
		System.out.print("0~6���� ���� �Է� : ");
		int num = sc.nextInt();

		if (num > -1 && num < arr.length) {
			System.out.println(arr[num] + "����");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void practice7() {
		System.out.print("���� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
		}
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			result += arr[i];
		}
		System.out.println("\n���� : " + result);
	}

	public void practice8() {
		while (true) {
			System.out.print("Ȧ���� ���� : ");
			int num = sc.nextInt();
			int count = 0;
			if (num % 2 == 0) {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			} else {
				int[] arr = new int[num];
				for (int i = 0; i < arr.length; i++) {
					if (i < (num / 2 + 1)) {
						count++;
						arr[i] = count;
						System.out.print(arr[i] + ", ");
					} else if (i < arr.length - 1) {
						count--;
						arr[i] = count;
						System.out.print(arr[i] + ", ");
					} else {
						count--;
						arr[i] = count;
						System.out.println(arr[i]);
					}
				}
				break;
			}
		}
	}

	public void practice9() {
		String[] str = new String[] { "���", "�Ķ��̵�", "ġ��", "�ſ���", "��Ͼ�" };
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String input = sc.nextLine();
		boolean bool = false;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(input)) {
				bool = true;
				break;
			}
		}
		if (bool) {
			System.out.println(input + "ġŲ ��� ����");
		} else {
			System.out.println(input + "ġŲ�� ���� �޴�");
		}
	}

	public void practice10() {
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String input = sc.nextLine();
		char[] myNum = new char[14];
		for (int i = 0; i < myNum.length; i++) {
			myNum[i] = input.charAt(i);
		}
		char[] myNum2 = new char[14];
		myNum2 = Arrays.copyOf(myNum, myNum.length);

		for (int i = 0; i < myNum2.length; i++) {
			if (i >= 8) {
				myNum2[i] = '*';
				System.out.print(myNum2[i]);
			} else {
				System.out.print(myNum2[i]);
			}
		}
	}

	public void practice11() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
	}

	public void practice12() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}

	public void practice13() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int num = (int) (Math.random() * 10 + 1);
			arr[i] = num;
			for (int j = 0; j < i; j++) {
				if (num == arr[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice14() { // �ζ� ��ȣ
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			int num = (int) (Math.random() * 45 + 1);
			arr[i] = num;
			for (int j = 0; j < i; j++) {
				if (num == arr[j]) {
					i--;
					break;
				} else {
					for (int k = i - 1; k > -1; k--) {
						if (arr[k] >= arr[k + 1]) {
							int temp = arr[k];
							arr[k] = arr[k + 1];
							arr[k + 1] = temp;
						}
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice15() {
//		���ڿ��� �Է� �޾� ���ڿ��� � ���ڰ� 
//		������ �迭�� �����ϰ� ������ ������ �Բ� ����ϼ���.
		System.out.print("���ڿ� : ");
		String input = sc.nextLine();
		char[] ch = new char[input.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = input.charAt(i);
		}

		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = 0;
				}
			}
			if (ch[i] != 0) {
				count++;
			}
		}
		int j = -1;
		System.out.print("���ڿ��� �ִ� ���� : ");
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != 0) {
				j++;
				if (j == count - 1) {
					System.out.print(ch[i]);
				} else {
					System.out.print(ch[i] + ", ");
				}
			}
		}
		System.out.println("\n���� ���� : " + count);
	}

	public void practice16() {
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine();
		String[] str = new String[num];
		String[] temp;
		int i = 0;
		while (true) {
			for (; i < num; i++) {
				System.out.print((i + 1) + "��° ���ڿ� : ");
				String input = sc.nextLine();
				str[i] = input;
			}
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			String ch = sc.nextLine();
			if (ch.equals("y") || ch.equals("Y")) {
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int add = sc.nextInt();
				sc.nextLine();
				num += add;
				temp = new String[num];
				for (int k = 0; k < num - add; k++) {
					temp[k] = str[k];
				}
				str = temp;
//				str = Arrays.copyOf(str, num);
			} else if (ch.equals("n") || ch.equals("N")) { // equalsIgnoreCase : ��ҹ��� �񱳾���
				System.out.print("[");
				for (int j = 0; j < str.length; j++) {
					if (j == str.length - 1) {
						System.out.print(str[j]);
					} else {
						System.out.print(str[j] + ", ");
					}
				}
				System.out.print("]");
				break;
			}
		}
	}
}
