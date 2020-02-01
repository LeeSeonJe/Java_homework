package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}

	public void practice2() {
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		while (true) {
			System.out.print("정수 하나 입력 : ");
			int num = sc.nextInt();
			if (num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요");
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
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요. 
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		if (num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		} else {
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice4() {
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면 
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요. 
		while (true) {
			System.out.print("정수 하나 입력 : ");
			int num = sc.nextInt();
			if (num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요");
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
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요
		System.out.print("정수를 하나 입력하세요 : ");
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
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("첫 번째 숫자 : ");
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
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else {
			for (; min <= max; min++) {
				System.out.print(min + " ");
			}
		}
	}

	public void practice7() {
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요”가 
//		출력되면서 다시 사용자가 값을 입력하도록 하세요
		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
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
				System.out.println("1이상의 숫자를 입력해주세요.");
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
//		사용자로부터 입력 받은 숫자의 단을 출력하세요
		System.out.print("숫자  : ");
		int num = sc.nextInt();
		System.out.println("===== " + num + "단 =====");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
		}
	}

	public void practice9() {
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요. 
//		단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.

		System.out.print("숫자  : ");
		int num = sc.nextInt();
		if (num > 9) {
			System.out.println("9이하의 숫자만 입력해주세요.");
		} else {
			for (int i = num; i < 10; i++) {
				System.out.println("===== " + i + "단 =====");
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
				System.out.println();
			}
		}
	}

	public void practice10() {
//		위 문제와 모든 것이 동일하나, 9를 초과하는 숫자가 입력됐다면 “9 이하의 숫자를 입력해주세요”가 
//		출력되면서 다시 사용자가 값을 입력하도록 하세요.
		while (true) {
			System.out.print("숫자  : ");
			int num = sc.nextInt();
			if (num > 9) {
				System.out.println("9이하의 숫자만 입력해주세요.");
				continue;
			} else {
				for (int i = num; i < 10; i++) {
					System.out.println("===== " + i + "단 =====");
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
//		사용자로부터 시작 숫자와 공차를 입력 받아 
//		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요. 
//		단, 출력되는 숫자는 총 10개입니다.
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int num = sc.nextInt();
		int sum = start;
		for (int i = 0; i < 10; i++) {
			System.out.print(sum + " ");
			sum += num;
		}
	}

	public void practice12() {
//		정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
//		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며 
//		exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다. 
//		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면 
//		“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며, 
//		없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고 
//		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.

		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.next();
			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
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
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				} else {
					System.out.println(num1 + " " + ch + " " + num2 + " = " + (num1 / num2));
				}
			} else if (ch == '%') {
				if (num1 == 0 || num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				} else {
					System.out.println(num1 + " " + ch + " " + num2 + " = " + (num1 % num2));
				}
			} else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
		}
	}

	public void practice13() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex. 정수 입력 : 
//			4
//			*
//			**
//			***
//			****
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice14() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex. 정수 입력 : 
//			4 
//			**** 
//			*** 
//			** 
//			*
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for (int i = num; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice15() {
//		사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요. 
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
//		
//		* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
//		ex) 2, 3, 5, 7, 11 …
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		boolean bool = true;
		if (num < 3) {
			System.out.println("잘못 입력하였습니다.");
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					bool = false;
					break;
				}
			}
			if (bool) {
				System.out.println("소수입니다.");
			} else {
				System.out.println("소수가 아닙니다.");
			}
		}
	}

	public void practice16() {
//		위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우 
//		“잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
//		
//		* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다. 
//		ex) 2, 3, 5, 7, 11 …

		boolean bool = true;
		while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			if (num < 3) {
				System.out.println("잘못 입력하였습니다.");
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
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}

	public void practice17() {
//		2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요. 
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int count = 0;
		int result = 0;
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
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
			System.out.printf("\n2부터 %d까지의 소수의 개수는 %d개입니다.\n", num, result);
		}
	}

	public void practice18() {
//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고 
//		2) 2와 3의 공배수의 개수를 출력하세요.
//		* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때 
//		모두 나머지가 0이 나오는 수

		System.out.print("자연수 하나를 입력하세요 : ");
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
//		ex. 정수 입력 : 4 
//			* 
//		   ** 
// 		  *** 
// 		 ****
		System.out.print("정수 입력 : ");
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
//		ex. 정수 입력 : 3 
//		* 
//		** 
//		*** 
//		** 
//		*
		System.out.print("정수 입력 : ");
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
//		ex. 정수 입력 : 4 
//		   * 
//		  *** 
//		 ***** 
//		*******
		System.out.print("정수 입력 : ");
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
//		ex. 정수 입력 : 5 
//		***** 
//		*   * 
//		*   * 
//		*   * 
//		*****
		System.out.print("정수 입력 : ");
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
