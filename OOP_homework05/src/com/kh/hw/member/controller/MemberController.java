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
				System.out.println("찾으신 회원 검색 결과입니다.");
				return m[i].inform();
			}
		}
		return "검색 결과가 없습니다.";
	}

	public Member[] searchName(String name) {
//		return m;
		for (int i = 0; i < existMemberNum; i++) {
			if (m[i].getName().equals(name)) {
				return m;
			}
		}
		return null;
		// 매개변수를 받아오는 이유가 무엇인가.
		// 비교대상은 name이며 리턴값은 Member객체를 리턴할 수 밖에 없는데
		// 비교를 해서 같으면 Member주소를 리턴할 경우
		// MemberMenu에서 굳이 인덱스 번호마다 호출할 필요가 있을까?
		// 비교해서 리턴값이 Member m의 인덱스를 넘기는 것도 아닌데...
	}

	public Member[] searchEmail(String email) { // 이메일 부분과 name 부분 동일
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