package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();

	public void mainMenu() {
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보 수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 가수명 내림차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 선택 >> ");
		int input = Integer.parseInt(sc.nextLine());
		if (input == 1) {
			addList();
		} else if (input == 2) {
			addAtZero();
		} else if (input == 3) {
			printAll();
		} else if (input == 4) {
			searchMusic();
		} else if (input == 5) {
			removeMusic();
		} else if (input == 6) {
			setMusic();
		} else if (input == 7) {
			ascTitle();
		} else if (input == 8) {
			descSinger();
		} else if (input == 9) {
			System.out.println("프로그램 종료");
		} else {
			System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
			mainMenu();
		}
	}

	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		if (title.equals("") || title.equals("")) {
			System.out.println("입력한 값이 없습니다. 다시 입력하세요.\n");
			mainMenu();
		} else {
			if (mc.addList(new Music(title, singer)) == -1) {
				System.out.println("추가 성공");
			} else {
				System.out.println("추가 실패");
			}
			mainMenu();
		}
	}

	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		if (title.equals("") || singer.equals("")) {
			System.out.println("입력한 값이 없습니다. 다시 입력하세요.\n");
			mainMenu();
		} else {
			if (mc.addAtZero(new Music(title, singer)) == -1) {
				System.out.println("추가 성공");
			} else {
				System.out.println("추가 실패");
			}
		}
		mainMenu();
	}

	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		System.out.println(mc.printAll() + "\n");
		mainMenu();
	}

	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		if (mc.searchMusic(title) == null) {
			System.out.println("검색한 곡이 없습니다.\n");
		} else {
			System.out.println("검색한 곡은 [" + mc.searchMusic(title) + "]입니다.\n");
		}
		mainMenu();
	}

	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("삭제할 곡 명 : ");
		String title = sc.nextLine();
		Music result = mc.removeMusic(title);
		if (result == null) {
			System.out.println("삭제할 곡이 없습니다.\n");
		} else {
			System.out.println(result + "을(를) 삭제했습니다.\n");
		}
		mainMenu();
	}

	public void setMusic() {
		System.out.println("****** 특정 곡 수정 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		System.out.print("수정할 곡 명 : ");
		String fixTitle = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String singer = sc.nextLine();
		Music music = new Music(fixTitle, singer);
		System.out.println(mc.setMusic(title, music) + "가 값이 변경되었습니다.");
		mainMenu();
	}

	public void ascTitle() {
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		mc.ascTitle();
		mainMenu();
	}

	public void descSinger() {
		System.out.println("****** 가수 명 내림차순 정렬 ******");
		if (mc.descSinger() == 1) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
		mainMenu();
	}
}
