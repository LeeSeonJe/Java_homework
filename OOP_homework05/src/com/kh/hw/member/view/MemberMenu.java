package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();

	public MemberMenu() {

	}

	public void mainMenu() {
		while (true) {
			System.out.println("�ִ� ��� ������ ȸ�� ���� " + MemberController.SIZE + "���Դϴ�.");
			System.out.println("���� ��ϵ� ȸ�� ���� " + MemberController.existMemberNum + "���Դϴ�.");
			if (MemberController.existMemberNum != 10) {
				System.out.println("1. �� ȸ�� ���");
				System.out.println("2. ȸ�� �˻�");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("4. ȸ�� ����");
				System.out.println("5. ��� ���");
				System.out.println("9. ������");
				System.out.print("�޴� ��ȣ : ");
				int input = sc.nextInt();
				if (input == 1) {
					insertMember();
				} else if (input == 2) {
					searchMember();
				} else if (input == 3) {
					updateMember();
				} else if (input == 4) {
					deleteMember();
				} else if (input == 5) {
					printAll();
				} else if (input == 9) {
					System.out.println("���α׷��� �����մϴ�");
					break;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				}
			} else {
				System.out.println("ȸ�� ���� ��� �� á�� ������ �Ϻ� �޴��� ���µ˴ϴ�.");
				System.out.println("2. ȸ�� �˻�");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("4. ȸ�� ����");
				System.out.println("5. ��� ���");
				System.out.println("9. ������");
				System.out.print("�޴� ��ȣ : ");
				int input = sc.nextInt();
				if (input == 2) {
					searchMember();
				} else if (input == 3) {
					updateMember();
				} else if (input == 4) {
					deleteMember();
				} else if (input == 5) {
					printAll();
				} else if (input == 9) {
					System.out.println("���α׷��� �����մϴ�");
					break;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				}
			}
		}
	}

	public void insertMember() {
		while (true) {
			System.out.print("���̵� : ");
			String id = sc.next();
			if (mc.checkId(id)) {
				System.out.println("�ߺ��� ���̵��Դϴ�.");
				continue;
			}
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("��й�ȣ : ");
			String password = sc.next();
			System.out.print("�̸��� : ");
			String email = sc.next();
			char gender;
			while (true) {
				System.out.print("����(M/F) : ");
				gender = sc.next().charAt(0);
				if (!(gender == 'f' || gender == 'F' || gender == 'm' || gender == 'M')) {
					System.out.println("������ �ٽ� �Է��ϼ���");
					continue;
				} else {
					break;
				}
			}
			System.out.print("���� : ");
			int age = sc.nextInt();
			mc.insetMember(id, name, password, email, gender, age);
			MemberController.existMemberNum++;
			break;
		}
	}

	public void searchMember() {
		System.out.println("1. ���̵�� �˻��ϱ�");
		System.out.println("2. �̸����� �˻��ϱ�");
		System.out.println("3. �̸��Ϸ� �˻��ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int input = sc.nextInt();
		if (input == 1) {
			searchId();
		} else if (input == 2) {
			searchName();
		} else if (input == 3) {
			searchEmail();
		} else if (input == 9) {
			System.out.println("�������� ���ư��ϴ�.");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void searchId() {
		System.out.print("�˻��� ���̵� : ");
		String id = sc.next();
		System.out.println(mc.searchId(id));
	}

	public void searchName() {
		System.out.print("�˻��� �̸� : ");
		String name = sc.next();

//		for (int i = 0; i < MemberController.existMemberNum; i++) {
//			if (mc.searchName(name)[i].getName().equals(name)) {
//				System.out.println(mc.searchName(name)[i].inform());
//			} else {
//				System.out.println("�˻� ����� �����ϴ�.");
//			}
//		}
		if (MemberController.existMemberNum == 0) { // �������� : ����� �ٷ� �˻��� �� ��츦 ����� �ڵ�
			System.out.println("�˻� ����� �����ϴ�.");
		}
		for (int i = 0; i < MemberController.existMemberNum; i++) {
			if (mc.searchName(name) == null) {
				System.out.println("�˻� ����� �����ϴ�.");
				break;
			} else {
				if (mc.searchName(name)[i].getName().equals(name)) {
					// searchName �޼ҵ忡�� ���̵� ������ Member ��ü �迭�� ��ȯ�ް�
					// ��ȯ ���� ��ü �迭 �ε������� name���� ������ �Է����� �޾ƿ� name�� �񱳸� �ϱ� ������
					// �ȿ��� �񱳸� �ϰ� ���ͼ� �� �񱳸� �ϴ� ��찡 �߻�.
					System.out.println(mc.searchName(name)[i].inform());
				}
			}
		}
	}

	public void searchEmail() {
		System.out.print("�˻��� �̸��� : ");
		String email = sc.next();
		if (MemberController.existMemberNum == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
		}
		for (int i = 0; i < MemberController.existMemberNum; i++) {
			if (mc.searchEmail(email) == null) {
				System.out.println("�˻� ����� �����ϴ�.");
				break;
			} else {
				if (mc.searchEmail(email)[i].getEmail().equals(email)) {
					System.out.println(mc.searchEmail(email)[i].inform());
				}
			}
		}
	}

	public void updateMember() {
		System.out.println("1. ��й�ȣ �����ϱ�");
		System.out.println("2. �̸� �����ϱ�");
		System.out.println("3. �̸��� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int input = sc.nextInt();
		if (input == 1) {
			updatePassword();
		} else if (input == 2) {
			updateName();
		} else if (input == 3) {
			updateEmail();
		} else if (input == 9) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void updatePassword() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.next();
		System.out.print("������ ��й�ȣ : ");
		String password = sc.next();
		if (mc.updatePassword(id, password)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.��");
		}

	}

	public void updateName() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.next();
		System.out.print("������ �̸� : ");
		String name = sc.next();
		if (mc.updateName(id, name)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.��");
		}
	}

	public void updateEmail() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.next();
		System.out.print("������ �̸��� : ");
		String email = sc.next();
		if (mc.updateEmail(id, email)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� ���̵��Դϴ�.��");
		}
	}

	public void deleteMember() {
		System.out.println("1. Ư�� ȸ�� �����ϱ�");
		System.out.println("2. ��� ȸ�� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int input = sc.nextInt();
		if (input == 1) {
			deleteOne();
		} else if (input == 2) {
			deleteAll();
		} else if (input == 9) {
			System.out.println("�������� ���ư��ϴ�.");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void deleteOne() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.next();
		System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
		String sel = sc.next();
		if (sel.equalsIgnoreCase("y")) {
			if (mc.delete(id)) {
				System.out.println("���������� �����Ͽ����ϴ�.");
				MemberController.existMemberNum--;
			} else {
				System.out.println("�������� �ʴ� ���̵��Դϴ�.");
			}
		}
	}

	public void deleteAll() {
		System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
		String sel = sc.next();
		if (sel.equalsIgnoreCase("y")) {
			mc.delete();
			System.out.println("���������� �����Ͽ����ϴ�.");
			MemberController.existMemberNum = 0;
		}
	}

	public void printAll() {
		if (MemberController.existMemberNum == 0) {
			System.out.println("����� ȸ���� �����ϴ�.");
		} else {
			for (int i = 0; i < MemberController.existMemberNum; i++) {
				System.out.println(mc.printAll()[i].inform());
			}
		}
	}
}
