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
		System.out.print("양수 입력 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {
		String[] arr = new String[] { "사과", "귤", "포도", "복숭아", "참외" };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("귤")) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

	public void practice5() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		int count = 0;
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
	}

	public void practice6() {
		String[] arr = new String[] { "월", "화", "수", "목", "금", "토", "일" };
		System.out.print("0~6사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num > -1 && num < arr.length) {
			System.out.println(arr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void practice7() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			result += arr[i];
		}
		System.out.println("\n총합 : " + result);
	}

	public void practice8() {
		while (true) {
			System.out.print("홀수인 정수 : ");
			int num = sc.nextInt();
			int count = 0;
			if (num % 2 == 0) {
				System.out.println("다시 입력하세요.");
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
		String[] str = new String[] { "양념", "후라이드", "치즈", "매운양념", "어니언" };
		System.out.print("치킨 이름을 입력하세요 : ");
		String input = sc.nextLine();
		boolean bool = false;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(input)) {
				bool = true;
				break;
			}
		}
		if (bool) {
			System.out.println(input + "치킨 배달 가능");
		} else {
			System.out.println(input + "치킨은 없는 메뉴");
		}
	}

	public void practice10() {
		System.out.print("주민등록번호(-포함) : ");
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
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
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

	public void practice14() { // 로또 번호
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
//		문자열을 입력 받아 문자열에 어떤 문자가 
//		들어갔는지 배열에 저장하고 문자의 개수와 함께 출력하세요.
		System.out.print("문자열 : ");
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
		System.out.print("문자열에 있는 문자 : ");
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
		System.out.println("\n문자 개수 : " + count);
	}

	public void practice16() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		String[] str = new String[num];
		String[] temp;
		int i = 0;
		while (true) {
			for (; i < num; i++) {
				System.out.print((i + 1) + "번째 문자열 : ");
				String input = sc.nextLine();
				str[i] = input;
			}
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String ch = sc.nextLine();
			if (ch.equals("y") || ch.equals("Y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int add = sc.nextInt();
				sc.nextLine();
				num += add;
				temp = new String[num];
				for (int k = 0; k < num - add; k++) {
					temp[k] = str[k];
				}
				str = temp;
//				str = Arrays.copyOf(str, num);
			} else if (ch.equals("n") || ch.equals("N")) { // equalsIgnoreCase : 대소문자 비교안함
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
