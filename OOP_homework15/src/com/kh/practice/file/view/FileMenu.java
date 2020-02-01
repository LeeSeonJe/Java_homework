package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();

	public void mainMenu() {
		System.out.println("***** My Note *****");
		System.out.println("1. ��Ʈ ���� �����");
		System.out.println("2. ��Ʈ ����");
		System.out.println("3. ��Ʈ ��� �����ϱ�");
		System.out.println("9. ������");
		System.out.print("�޴� ��ȣ : ");
		int input = sc.nextInt();
		if (input == 1) {
			fileSave();
		} else if (input == 2) {
			fileOpen();
		} else if (input == 3) {
			fileEdit();
		} else if (input == 9) {
			System.out.println("���α׷��� �����մϴ�.");
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			mainMenu();
		}
	}

	public void fileSave() {
		sc.nextLine();
		StringBuilder sb = new StringBuilder("");
		while (true) {
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
			System.out.println("ex��if �̶�� �Է��ϸ� ����˴ϴ�.");
			System.out.print("���� : ");
			String memo = sc.nextLine();
			if (memo.equals("ex��it")) {
				System.out.print("������ ���� ���� �Է����ּ���(ex. myFile.txt) : ");
				String file = sc.nextLine();
				if (fc.checkName(file)) {
					System.out.print("�̹� �����ϴ� �����Դϴ�. ����ðڽ��ϱ�?(y/n) : ");
					String sel = sc.nextLine();
					if (sel.equalsIgnoreCase("y")) {
						fc.fileSave(file, sb);
						break;
					} else if (sel.equalsIgnoreCase("n")) {
						System.out.print("������ ���� ���� �Է����ּ���(ex. myFile.txt) : ");
						file = sc.nextLine();
						fc.fileSave(file, sb);
						break;
					}
				} else {
					fc.fileSave(file, sb);
					break;
				}
			} else {
				sb.append(memo + "\n");
			}
		}
		mainMenu();
	}

	public void fileOpen() {
		sc.nextLine();
		System.out.print("���� ���� ���ϸ� : ");
		String file = sc.nextLine();
		System.out.println(fc.fileOpen(file));
		mainMenu();
	}

	public void fileEdit() {
		sc.nextLine();
		StringBuilder sb = new StringBuilder("");
		System.out.print("������ ���� �� : ");
		String file = sc.nextLine();
		if (fc.checkName(file)) {
			sb = fc.fileOpen(file);
			while (true) {
				System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
				System.out.println("ex��if �̶�� �Է��ϸ� ����˴ϴ�.");
				System.out.print("���� : ");
				String memo = sc.nextLine();
				if (memo.equals("ex��it")) {
					fc.fileEdit(file, sb);
					break;
				} else {
					sb.append(memo + "\n");
				}
			}
		} else {
			System.out.println("���� �����Դϴ�.");
			mainMenu();
		}
		mainMenu();
	}
}
