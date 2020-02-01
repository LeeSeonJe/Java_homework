package com.kh.practice.generics.view;

import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {

	FarmController fc = new FarmController(); // FarmController ��ü ����
	Scanner sc = new Scanner(System.in); // Scanner ��ü

	public void mainMenu() {
		System.out.println("******* ���� �޴� *******");
		System.out.println("1. ���� �޴�"); // adminMenu() ����
		System.out.println("2. �մ� �޴�"); // customerMenu()
		System.out.println("9. ����"); // �����α׷� ����.�� ��� �� main()���� ����
		System.out.print("�޴� ��ȣ  >> ");
		// �޴� ȭ�� �ݺ� ���� ó��
		// �� �� �Է� �Ͽ��� ��� "�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���" ��� �� �ݺ�
		int input = sc.nextInt();
		if (input == 1) {
			adminMenu();
		} else if (input == 2) {
			customerMenu();
		} else if (input == 9) {
			System.out.println("���α׷� ����");
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			mainMenu();
		}
	}

	public void adminMenu() {
		System.out.println("******* ���� �޴� *******");
		System.out.println("1. �� ��깰 �߰�"); // addNewKind() ����
		System.out.println("2. ���� ����"); // removeKind()
		System.out.println("3. ���� ����"); // changeAmount()
		System.out.println("4. ��깰 ���"); // printFarm()
		System.out.println("9. �������� ���ư���"); // mainMenu()�� ����
		System.out.print("�޴� ��ȣ  >> "); // �޴� ȭ�� �ݺ� ���� ó��
		// �� �� �Է� �Ͽ��� ��� "�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���" ��� �� �ݺ�
		int input = sc.nextInt();
		if (input == 1) {
			sc.nextLine();
			addNewKind();
		} else if (input == 2) {
			removeKind();
		} else if (input == 3) {
			changeAmount();
		} else if (input == 4) {
			printFarm();
			adminMenu();
		} else if (input == 9) {
			System.out.println("�������� ���ư��ϴ�.");
			mainMenu();
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			adminMenu();
		}
	}

	public void customerMenu() {
		System.out.println("���� KH��Ʈ ��깰 ����");
		printFarm();
		System.out.println();
		System.out.println("******* �� �޴� *******");
		System.out.println("1. ��깰 ���"); // buyFarm() ����
		System.out.println("2. ��깰 ����"); // removeFarm()
		System.out.println("3. ������ ��깰 ����"); // printBuyFarm()
		System.out.println("9. �������� ���ư���"); // mainMenu()�� ����
		System.out.print("�޴� ��ȣ  >> "); // �޴� ȭ�� �ݺ� ���� ó��
		// �� �� �Է� �Ͽ��� ��� "�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���" ��� �� �ݺ�
		int input = sc.nextInt();
		if (input == 1) {
			buyFarm();
		} else if (input == 2) {
			removeFarm();
		} else if (input == 3) {
			printBuyFarm();
		} else if (input == 9) {
			System.out.println("�������� ���ư��ϴ�.");
			mainMenu();
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			customerMenu();
		}
	}

	// 1-1. �� ��깰 �߰��� view �޼ҵ�
	public void addNewKind() {
//	��1. ���� / 2. ä�� / 3. �߰����� ���� ��ȣ�� ������ �ް� �߰� ��깰�� �̸�, ������
//	����. �̶� ���� ��ȣ�� �����ϸ� ���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.����
//	��µǸ� �ٽ� ��ȣ�� �ް�, ������ ������ ���� �����Ǵ� ��ü�� �ٸ�.
//	��ü �ȿ� ������ �̸��� ����. �����͸� ������ ��ü�� ������ fc(FarmController)��
//	addNewKind()�� �ѱ�� ���� ���� ��ȯ ���� true�� ���� ��깰�� �߰��Ǿ����ϴ�.��,
//	false�� ���� ��깰 �߰��� �����Ͽ����ϴ�. �ٽ� �Է����ּ���.�� ���
		System.out.println("1. ���� / 2. ä�� / 3. �߰�");
		System.out.print("�߰��� ���� ��ȣ : ");
		int input = sc.nextInt();
		sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int amount = sc.nextInt();
		String kind = "";
		Farm f = null;
		if (input == 1) {
			kind = "����";
			f = new Fruit(kind, name);
		} else if (input == 2) {
			kind = "ä��";
			f = new Vegetable(kind, name);
		} else if (input == 3) {
			kind = "�߰�";
			f = new Nut(kind, name);
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			addNewKind();
		}
		if (fc.addNewKind(f, amount)) {
			System.out.println("�� ��깰�� �߰��Ǿ����ϴ�.");
			adminMenu();
		} else {
			System.out.println("�� ��깰 �߰��� �����Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			addNewKind();
		}
	}

	// 1-2. ���� ������ view �޼ҵ�
	public void removeKind() {
//	��1. ���� / 2. ä�� / 3. �߰����� ���� ��ȣ�� ������ �ް� ������ ��깰�� �̸���
//	����. �̶� ���� ��ȣ�� �����ϸ� ���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.����
//	��µǸ� �ٽ� ��ȣ�� �ް�, ������ ������ ���� �����Ǵ� ��ü�� �ٸ�.
//	��ü �ȿ� ������ �̸��� ����. �����͸� ������ ��ü�� fc�� removeKind()�� �ѱ��
//	���޹��� ��ȯ ���� true�� ����깰 ������ �����Ͽ����ϴ�.��,
//	false�� ���� ��깰 �߰��� �����Ͽ����ϴ�. �ٽ� �Է����ּ���.�� ���
		System.out.println("1. ���� / 2. ä�� / 3. �߰�");
		System.out.print("������ ���� ��ȣ : ");
		int input = sc.nextInt();
		sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		String kind = "";
		Farm f = null;
		if (input == 1) {
			kind = "����";
			f = new Fruit(kind, name);
		} else if (input == 2) {
			kind = "ä��";
			f = new Vegetable(kind, name);
		} else if (input == 3) {
			kind = "�߰�";
			f = new Nut(kind, name);
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			removeKind();
		}
		if (fc.removeKind(f)) {
			System.out.println("��깰 ������ �����Ͽ����ϴ�.");
			adminMenu();
		} else {
			System.out.println("��깰 ������ �����Ͽ����ϴ�.");
			removeKind();
		}
	}

	// 1-3. ���� ������ view �޼ҵ�
	public void changeAmount() {
//	��1. ���� / 2. ä�� / 3. �߰����� ���� ��ȣ�� ������ �ް� ���� ��깰�� �̸�,
//	������ ������ ����. ���� ��ȣ ���� �� ���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.��
//	��� �� �ٽ� ��ȣ�� �ް�, ������ ������ ���� �����Ǵ� ��ü�� �ٸ�.
//	��ü �ȿ� ������ �̸��� ����. �����͸� ������ ��ü�� ������ fc��
//	changeAmount()�� �ѱ�� ���� ���� ��ȯ ���� true��
//	����깰 ������ �����Ǿ����ϴ�.��,
//	false�� ����깰 ���� ������ �����Ͽ����ϴ�. �ٽ� �Է����ּ���.�� ���
		System.out.println("1. ���� / 2. ä�� / 3. �߰�");
		System.out.print("������ ���� ��ȣ : ");
		int input = sc.nextInt();
		sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("������ ���� : ");
		int amount = sc.nextInt();
		String kind = "";
		Farm f = null;
		if (input == 1) {
			kind = "����";
			f = new Fruit(kind, name);
		} else if (input == 2) {
			kind = "ä��";
			f = new Vegetable(kind, name);
		} else if (input == 3) {
			kind = "�߰�";
			f = new Nut(kind, name);
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			changeAmount();
		}
		if (fc.changeAmount(f, amount)) {
			System.out.println("��깰 ������ �����Ǿ����ϴ�.");
			adminMenu();
		} else {
			System.out.println("��깰 ���� ������ �����Ͽ����ϴ�. �ٽ� �Է����ּ���.");
			changeAmount();
		}
	}

	// 1-4. ��깰 ��� ��¿� view �޼ҵ�
	public void printFarm() {
//	fc�� printFarm()�� ��ȯ ���� �̿��Ͽ� keySet()�� ����
//	������ : �̸�(n��)�� �������� ���
		Iterator<Farm> it = fc.printFarm().keySet().iterator();
		while (it.hasNext()) {
			Farm f = it.next();
			System.out.println(f + "(" + fc.printFarm().get(f) + "��)");
		}
		return;
	}

	// 2-1. ��깰 ���ſ� view �޼ҵ�
	public void buyFarm() {
//	��1. ���� / 2. ä�� / 3. �߰����� ���� ��ȣ�� ������ �ް� ������ ��깰�� �̸���
//	����. �̶� ���� ��ȣ�� �����ϸ� ���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.����
//	��µǸ� �ٽ� ��ȣ�� �ް�, ������ ������ ���� �����Ǵ� ��ü�� �ٸ�.
//	��ü �ȿ� ������ �̸��� ����. �����͸� ������ ��ü�� fc�� buyFarm()�� �ѱ��
//	���޹��� ��ȯ ���� true�� �����ſ� �����Ͽ����ϴ�.��,
//	false�� ����Ʈ�� ���� �����̰ų� ������ �����ϴ�. �ٽ� �Է����ּ���.�� ���
		System.out.println("1. ���� / 2. ä�� / 3. �߰�");
		System.out.print("���� ���� ��ȣ : ");
		int input = sc.nextInt();
		sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		String kind = "";
		Farm f = null;
		if (input == 1) {
			kind = "����";
			f = new Fruit(kind, name);
		} else if (input == 2) {
			kind = "ä��";
			f = new Vegetable(kind, name);
		} else if (input == 3) {
			kind = "�߰�";
			f = new Nut(kind, name);
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			buyFarm();
		}
		if (fc.buyFarm(f)) {
			System.out.println("���ſ� �����Ͽ����ϴ�.");
		} else {
			System.out.println("���ſ� �����Ͽ����ϴ�.");
		}
		customerMenu();
	}

	// 2-2. ��깰 ���� ��ҿ� view �޼ҵ�
	public void removeFarm() {
//	��1. ���� / 2. ä�� / 3. �߰����� ���� ��ȣ�� ������ �ް� ��������� ��깰�� �̸���
//	����. �̶� ���� ��ȣ�� �����ϸ� ���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.����
//	��µǸ� �ٽ� ��ȣ�� �ް�, ������ ������ ���� �����Ǵ� ��ü�� �ٸ�.
//	��ü �ȿ� ������ �̸��� ����. ������ ������ ��ü�� fc�� removeFarm()�� �ѱ��
//	���޹��� ��ȯ ���� true�� ������ ��ҿ� �����Ͽ����ϴ�.��,
//	false�� �����Ÿ� ��Ͽ� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.�� ���
		System.out.println("1. ���� / 2. ä�� / 3. �߰�");
		System.out.print("��� ���� ��ȣ : ");
		int input = sc.nextInt();
		sc.nextLine();
		System.out.print("���� ����� �� : ");
		String name = sc.nextLine();
		String kind = "";
		Farm f = null;
		if (input == 1) {
			kind = "����";
			f = new Fruit(kind, name);
		} else if (input == 2) {
			kind = "ä��";
			f = new Vegetable(kind, name);
		} else if (input == 3) {
			kind = "�߰�";
			f = new Nut(kind, name);
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			removeFarm();
		}
		if(fc.removeFarm(f)) {
			System.out.println("���� ��ҿ� �����Ͽ����ϴ�.");
		}else {
			System.out.println("���� ��ҿ� �����Ͽ����ϴ�.");
		}
		customerMenu();
	}

	// 2-3. ������ ��깰 ��¿� view �޼ҵ�
	public void printBuyFarm() {
//	fc�� printBuyFarm()�� ��ȯ ���� �̿��Ͽ� Iterator�� ���� ���
		Iterator<Farm> it = fc.printBuyFarm().iterator();
		while (it.hasNext()) {
			Farm f = it.next();
			System.out.println(f);
		}
		customerMenu();
	}
}
