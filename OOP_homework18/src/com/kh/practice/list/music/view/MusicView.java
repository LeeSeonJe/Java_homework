package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();

	public void mainMenu() {
		System.out.println("******* ���� �޴� *******");
		System.out.println("1. ������ ��ġ�� �� �߰�");
		System.out.println("2. ù ��ġ�� �� �߰�");
		System.out.println("3. ��ü �� ��� ���");
		System.out.println("4. Ư�� �� �˻�");
		System.out.println("5. Ư�� �� ����");
		System.out.println("6. Ư�� �� ���� ����");
		System.out.println("7. ��� �������� ����");
		System.out.println("8. ������ �������� ����");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ ���� >> ");
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
			System.out.println("���α׷� ����");
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
			mainMenu();
		}
	}

	public void addList() {
		System.out.println("****** ������ ��ġ�� �� �߰� ******");
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		if (title.equals("") || title.equals("")) {
			System.out.println("�Է��� ���� �����ϴ�. �ٽ� �Է��ϼ���.\n");
			mainMenu();
		} else {
			if (mc.addList(new Music(title, singer)) == -1) {
				System.out.println("�߰� ����");
			} else {
				System.out.println("�߰� ����");
			}
			mainMenu();
		}
	}

	public void addAtZero() {
		System.out.println("****** ù ��ġ�� �� �߰� ******");
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		if (title.equals("") || singer.equals("")) {
			System.out.println("�Է��� ���� �����ϴ�. �ٽ� �Է��ϼ���.\n");
			mainMenu();
		} else {
			if (mc.addAtZero(new Music(title, singer)) == -1) {
				System.out.println("�߰� ����");
			} else {
				System.out.println("�߰� ����");
			}
		}
		mainMenu();
	}

	public void printAll() {
		System.out.println("****** ��ü �� ��� ��� ******");
		System.out.println(mc.printAll() + "\n");
		mainMenu();
	}

	public void searchMusic() {
		System.out.println("****** Ư�� �� �˻� ******");
		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();
		if (mc.searchMusic(title) == null) {
			System.out.println("�˻��� ���� �����ϴ�.\n");
		} else {
			System.out.println("�˻��� ���� [" + mc.searchMusic(title) + "]�Դϴ�.\n");
		}
		mainMenu();
	}

	public void removeMusic() {
		System.out.println("****** Ư�� �� ���� ******");
		System.out.print("������ �� �� : ");
		String title = sc.nextLine();
		Music result = mc.removeMusic(title);
		if (result == null) {
			System.out.println("������ ���� �����ϴ�.\n");
		} else {
			System.out.println(result + "��(��) �����߽��ϴ�.\n");
		}
		mainMenu();
	}

	public void setMusic() {
		System.out.println("****** Ư�� �� ���� ******");
		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();
		System.out.print("������ �� �� : ");
		String fixTitle = sc.nextLine();
		System.out.print("������ ���� �� : ");
		String singer = sc.nextLine();
		Music music = new Music(fixTitle, singer);
		System.out.println(mc.setMusic(title, music) + "�� ���� ����Ǿ����ϴ�.");
		mainMenu();
	}

	public void ascTitle() {
		System.out.println("****** �� �� �������� ���� ******");
		mc.ascTitle();
		mainMenu();
	}

	public void descSinger() {
		System.out.println("****** ���� �� �������� ���� ******");
		if (mc.descSinger() == 1) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
		mainMenu();
	}
}
