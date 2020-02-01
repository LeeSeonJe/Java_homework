package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	public final static int SIZE = 10;
	Member[] m = new Member[SIZE];

	public static int existMemberNum = 0;

	public boolean checkId(String inputId) {
		for (int i = 0; i < existMemberNum; i++) {
			if (m[i].getId().equals(inputId)) {
				return true;
			}
		}
		return false;
	}

	public void insetMember(String id, String name, String password, String email, char gender, int age) {
		m[existMemberNum] = new Member(id, name, password, email, gender, age);
	}

	public String searchId(String id) {
		for (int i = 0; i < existMemberNum; i++) {
			if (m[i].getId().equals(id)) {
				System.out.println("ã���� ȸ�� �˻� ����Դϴ�.");
				return m[i].inform();
			}
		}
		return "�˻� ����� �����ϴ�.";
	}

	public Member[] searchName(String name) {
//		return m;
		for (int i = 0; i < existMemberNum; i++) {
			if (m[i].getName().equals(name)) {
				return m;
			}
		}
		return null;
		// �Ű������� �޾ƿ��� ������ �����ΰ�.
		// �񱳴���� name�̸� ���ϰ��� Member��ü�� ������ �� �ۿ� ���µ�
		// �񱳸� �ؼ� ������ Member�ּҸ� ������ ���
		// MemberMenu���� ���� �ε��� ��ȣ���� ȣ���� �ʿ䰡 ������?
		// ���ؼ� ���ϰ��� Member m�� �ε����� �ѱ�� �͵� �ƴѵ�...
	}

	public Member[] searchEmail(String email) { // �̸��� �κа� name �κ� ����
		for (int i = 0; i < existMemberNum; i++) {
			if (m[i].getEmail().equals(email)) {
				return m;
			}
		}
		return null;
	}

	public boolean updatePassword(String id, String password) {
		for (int i = 0; i < existMemberNum; i++) {
			if (m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		return false;
	}

	public boolean updateName(String id, String name) {
		for (int i = 0; i < existMemberNum; i++) {
			if (m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}

	public boolean updateEmail(String id, String email) {
		for (int i = 0; i < existMemberNum; i++) {
			if (m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}

	public boolean delete(String id) {
		for (int i = 0; i < existMemberNum; i++) {
			if (m[i].getId().equals(id)) {
				for (int j = i; j < existMemberNum - 1; j++) {
					m[j] = m[j + 1];
				}
				m[existMemberNum - 1] = new Member();
				return true;
			}
		}
		return false;
	}

	public void delete() {
		m = new Member[SIZE];
	}

	public Member[] printAll() {
		return m;
	}
}