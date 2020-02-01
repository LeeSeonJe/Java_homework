package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		String[][] str = new String[3][4];

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				str[i][j] = "(" + i + "," + j + ")";
				System.out.print(str[i][j]);
			}
			System.out.println();
		}
	}

	public void practice2() {
		int[][] iArr = new int[4][4];
		int count = 1;
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr.length; j++) {
				iArr[i][j] = count++;
			}
		}

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr.length; j++) {
				System.out.print(iArr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice3() {
		int[][] iArr = new int[4][4];
		int count = 16;
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr.length; j++) {
				iArr[i][j] = count--;
			}
		}

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr.length; j++) {
				System.out.printf("%-2d ", iArr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice4() {
		int[][] iArr = new int[4][4];
		int sum = 0;
		int result = 0;
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				if (j < iArr[i].length - 1 && i < iArr.length - 1) {
					iArr[i][j] = (int) (Math.random() * 10 + 1);
				} else if (i < iArr.length - 1 && j == iArr[i].length - 1) {
					for (int k = 0; k < iArr.length; k++) {
						sum += iArr[i][k];
					}
					iArr[i][j] = sum;
					result += sum;
					sum = 0;
				} else if (i == iArr[i].length - 1 && j < iArr[i].length - 1) {
					for (int k = 0; k < iArr.length; k++) {
						sum += iArr[k][j];
					}
					iArr[i][j] = sum;
					result += sum;
					sum = 0;
				} else {
					iArr[i][j] = result;
				}
			}
		}

		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr.length; j++) {
				System.out.printf("%3d", iArr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice5() {
		while (true) {
			System.out.print("���� ũ�� : ");
			int row = sc.nextInt();
			System.out.print("���� ũ�� : ");
			int cal = sc.nextInt();

			if ((row < 0 || row > 10) && (cal < 0 || cal > 10)) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
				continue;
			} else {
				int[][] iArr = new int[row][cal];
				for (int i = 0; i < iArr.length; i++) {
					for (int j = 0; j < iArr[i].length; j++) {
						iArr[i][j] = (int) (Math.random() * 26 + 65);
					}
				}
				for (int i = 0; i < iArr.length; i++) {
					for (int j = 0; j < iArr[i].length; j++) {
						System.out.print((char) iArr[i][j] + " ");
					}
					System.out.println();
				}
				break;
			}

		}
	}

	public void practice6() {
		String[][] strArr = new String[][] { { "��", "��", "��", "��", "��" }, { "��", "��", "��", "��", "��" },
				{ "��", "��", "��", "��", "��" }, { "��", "��", "��", "��", "��" }, { "��", "��", "! ", "��", "!! " } };
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public void practice7() {
		System.out.print("���� ũ�� : ");
		int row = sc.nextInt();
		char[][] cArr = new char[row][];
		char ch = 'a';
		for (int i = 0; i < row; i++) {
			System.out.print("0���� �� ũ�� : ");
			int cal = sc.nextInt();
			cArr[i] = new char[cal];
			for (int j = 0; j < cal; j++) {
				cArr[i][j] = ch++;
			}
		}

		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < cArr[i].length; j++) {
				System.out.print(cArr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice8() {
		String[] str = new String[] { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ",
				"ȫ����" };
		String[][] ck1 = new String[3][2];
		String[][] ck2 = new String[3][3];

		int count = 0;
		for (int i = 0; i < ck1.length; i++) {
			for (int j = 0; j < ck1[i].length; j++) {
				ck1[i][j] = str[count];
				ck2[i][j] = str[count + str.length / 2];
				count++;
			}
		}
		for (int i = 1; i <= 2; i++) {
			System.out.println("== " + i + "�д� ==");
			for (int j = 0; j < ck1.length; j++) {
				for (int k = 0; k < ck1[j].length; k++) {
					if (i == 1) {
						System.out.print(ck1[j][k] + "   ");
					} else {
						System.out.print(ck2[j][k] + "   ");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public void practice9() {
		practice8();
		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();

		String[] str = new String[] { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ",
				"ȫ����" };
		String[][] ck1 = new String[3][2];
		String[][] ck2 = new String[3][3];

		int count = 0;
		for (int i = 0; i < ck1.length; i++) {
			for (int j = 0; j < ck1[i].length; j++) {
				ck1[i][j] = str[count];
				ck2[i][j] = str[count + str.length / 2];
				count++;
			}
		}

		for (int i = 1; i <= 2; i++) { // �д� �ݺ���
			for (int j = 0; j < ck1.length; j++) { // �� �ݺ���
				for (int k = 0; k < ck1[j].length; k++) { // �� �ݺ���
					if (i == 1) {
						if (name.equals(ck1[j][k])) {
							System.out.print("�˻��Ͻ� " + name + " �л��� " + i + "�д�");
							if (k == 0) {
								System.out.print(" ù ��° ��");
								if (k == 0) {
									System.out.print(" ���ʿ� �ֽ��ϴ�.");
								} else {
									System.out.print(" �����ʿ� �ֽ��ϴ�.");
								}
							} else if (k == 1) {
								System.out.print(" �� ��° ��");
								if (k == 0) {
									System.out.print(" ���ʿ� �ֽ��ϴ�.");
								} else {
									System.out.print(" �����ʿ� �ֽ��ϴ�.");
								}
							} else {
								System.out.print(" �� ��° ��");
								if (k == 0) {
									System.out.print(" ���ʿ� �ֽ��ϴ�.");
								} else {
									System.out.print(" �����ʿ� �ֽ��ϴ�.");
								}
							}
						}
					} else {
						if (name.equals(ck2[j][k])) {
							System.out.print("�˻��Ͻ� " + name + " �л��� " + i + "�д�");
							if (k == 0) {
								System.out.print(" ù ��° ��");
								if (k == 0) {
									System.out.print(" ���ʿ� �ֽ��ϴ�.");
								} else {
									System.out.print(" �����ʿ� �ֽ��ϴ�.");
								}
							} else if (k == 1) {
								System.out.print(" �� ��° ��");
								if (k == 0) {
									System.out.print(" ���ʿ� �ֽ��ϴ�.");
								} else {
									System.out.print(" �����ʿ� �ֽ��ϴ�.");
								}
							} else {
								System.out.print(" �� ��° ��");
								if (k == 0) {
									System.out.print(" ���ʿ� �ֽ��ϴ�.");
								} else {
									System.out.print(" �����ʿ� �ֽ��ϴ�.");
								}
							}
						}
					}
				}
			}
		}
	}

	public void practice10() {
		String[][] strArr = new String[6][6];
		System.out.print("�� �ε��� : ");
		int row = sc.nextInt();
		System.out.print("�� �ε��� : ");
		int cal = sc.nextInt();
		System.out.println();
		for (int i = 0; i < strArr.length; i++) {
			int num = 0;
			for (int j = 0; j < strArr[i].length; j++) {
				strArr[i][j] = " ";
				if (i == 0 && j > 0) {
					strArr[i][j] = Integer.toString(num);
					num++;
				}
				if (j == 0 && i > 0) {
					strArr[i][j] = Integer.toString(i - 1);
				}
				strArr[row + 1][cal + 1] = "X";
			}
		}

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr.length; j++) {
				System.out.printf("%3s", strArr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice11() {
		String[][] strArr = new String[6][6];
		while (true) {
			System.out.print("�� �ε��� : ");
			int row = sc.nextInt();
			if (row == 99) {
				System.out.println("���α׷� ����");
				break;
			}
			System.out.print("�� �ε��� : ");
			int cal = sc.nextInt();
			System.out.println();
			for (int i = 0; i < strArr.length; i++) {
				int num = 0;
				for (int j = 0; j < strArr[i].length; j++) {
					if (strArr[i][j] == null) {
						strArr[i][j] = " ";
					}
					if (i == 0 && j > 0) {
						strArr[i][j] = Integer.toString(num);
						num++;
					}
					if (j == 0 && i > 0) {
						strArr[i][j] = Integer.toString(i - 1);
					}
					strArr[row + 1][cal + 1] = "X";
				}
			}

			for (int i = 0; i < strArr.length; i++) {
				for (int j = 0; j < strArr.length; j++) {
					System.out.printf("%3s", strArr[i][j]);
				}
				System.out.println();
			}
		}
	}
}
