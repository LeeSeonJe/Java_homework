package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();

	public void mainMenu() {
		System.out.println("***** My Note *****");
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		int input = sc.nextInt();
		if (input == 1) {
			fileSave();
		} else if (input == 2) {
			fileOpen();
		} else if (input == 3) {
			fileEdit();
		} else if (input == 9) {
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			mainMenu();
		}
	}

	public void fileSave() {
		sc.nextLine();
		StringBuilder sb = new StringBuilder("");
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝if 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String memo = sc.nextLine();
			if (memo.equals("ex끝it")) {
				System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
				String file = sc.nextLine();
				if (fc.checkName(file)) {
					System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
					String sel = sc.nextLine();
					if (sel.equalsIgnoreCase("y")) {
						fc.fileSave(file, sb);
						break;
					} else if (sel.equalsIgnoreCase("n")) {
						System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
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
		System.out.print("열고 싶은 파일명 : ");
		String file = sc.nextLine();
		System.out.println(fc.fileOpen(file));
		mainMenu();
	}

	public void fileEdit() {
		sc.nextLine();
		StringBuilder sb = new StringBuilder("");
		System.out.print("수정할 파일 명 : ");
		String file = sc.nextLine();
		if (fc.checkName(file)) {
			sb = fc.fileOpen(file);
			while (true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝if 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String memo = sc.nextLine();
				if (memo.equals("ex끝it")) {
					fc.fileEdit(file, sb);
					break;
				} else {
					sb.append(memo + "\n");
				}
			}
		} else {
			System.out.println("없는 파일입니다.");
			mainMenu();
		}
		mainMenu();
	}
}
