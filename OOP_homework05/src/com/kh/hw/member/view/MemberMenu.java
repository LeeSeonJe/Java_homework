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
			System.out.println("최대 등록 가능한 회원 수는 " + MemberController.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는 " + MemberController.existMemberNum + "명입니다.");
			if (MemberController.existMemberNum != 10) {
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
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
					System.out.println("프로그램을 종룍합니다");
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				}
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
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
					System.out.println("프로그램을 종룍합니다");
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				}
			}
		}
	}

	public void insertMember() {
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			if (mc.checkId(id)) {
				System.out.println("중복된 아이디입니다.");
				continue;
			}
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("비밀번호 : ");
			String password = sc.next();
			System.out.print("이메일 : ");
			String email = sc.next();
			char gender;
			while (true) {
				System.out.print("성별(M/F) : ");
				gender = sc.next().charAt(0);
				if (!(gender == 'f' || gender == 'F' || gender == 'm' || gender == 'M')) {
					System.out.println("성별을 다시 입력하세요");
					continue;
				} else {
					break;
				}
			}
			System.out.print("나이 : ");
			int age = sc.nextInt();
			mc.insetMember(id, name, password, email, gender, age);
			MemberController.existMemberNum++;
			break;
		}
	}

	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int input = sc.nextInt();
		if (input == 1) {
			searchId();
		} else if (input == 2) {
			searchName();
		} else if (input == 3) {
			searchEmail();
		} else if (input == 9) {
			System.out.println("메인으로 돌아갑니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String id = sc.next();
		System.out.println(mc.searchId(id));
	}

	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.next();

//		for (int i = 0; i < MemberController.existMemberNum; i++) {
//			if (mc.searchName(name)[i].getName().equals(name)) {
//				System.out.println(mc.searchName(name)[i].inform());
//			} else {
//				System.out.println("검색 결과가 없습니다.");
//			}
//		}
		if (MemberController.existMemberNum == 0) { // 만든이유 : 실행시 바로 검색을 할 경우를 대비한 코드
			System.out.println("검색 결과가 없습니다.");
		}
		for (int i = 0; i < MemberController.existMemberNum; i++) {
			if (mc.searchName(name) == null) {
				System.out.println("검색 결과가 없습니다.");
				break;
			} else {
				if (mc.searchName(name)[i].getName().equals(name)) {
					// searchName 메소드에서 아이디가 있으면 Member 객체 배열을 반환받고
					// 반환 받은 객체 배열 인덱스마다 name값을 가져와 입력으로 받아온 name과 비교를 하기 때문에
					// 안에서 비교를 하고 나와서 또 비교를 하는 경우가 발생.
					System.out.println(mc.searchName(name)[i].inform());
				}
			}
		}
	}

	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String email = sc.next();
		if (MemberController.existMemberNum == 0) {
			System.out.println("검색 결과가 없습니다.");
		}
		for (int i = 0; i < MemberController.existMemberNum; i++) {
			if (mc.searchEmail(email) == null) {
				System.out.println("검색 결과가 없습니다.");
				break;
			} else {
				if (mc.searchEmail(email)[i].getEmail().equals(email)) {
					System.out.println(mc.searchEmail(email)[i].inform());
				}
			}
		}
	}

	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int input = sc.nextInt();
		if (input == 1) {
			updatePassword();
		} else if (input == 2) {
			updateName();
		} else if (input == 3) {
			updateEmail();
		} else if (input == 9) {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void updatePassword() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 비밀번호 : ");
		String password = sc.next();
		if (mc.updatePassword(id, password)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.ㄹ");
		}

	}

	public void updateName() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이름 : ");
		String name = sc.next();
		if (mc.updateName(id, name)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.ㄹ");
		}
	}

	public void updateEmail() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이메일 : ");
		String email = sc.next();
		if (mc.updateEmail(id, email)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.ㄹ");
		}
	}

	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int input = sc.nextInt();
		if (input == 1) {
			deleteOne();
		} else if (input == 2) {
			deleteAll();
		} else if (input == 9) {
			System.out.println("메인으로 돌아갑니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void deleteOne() {
		System.out.print("삭제할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		String sel = sc.next();
		if (sel.equalsIgnoreCase("y")) {
			if (mc.delete(id)) {
				System.out.println("성공적으로 삭제하였습니다.");
				MemberController.existMemberNum--;
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}
	}

	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		String sel = sc.next();
		if (sel.equalsIgnoreCase("y")) {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
			MemberController.existMemberNum = 0;
		}
	}

	public void printAll() {
		if (MemberController.existMemberNum == 0) {
			System.out.println("저장된 회원이 없습니다.");
		} else {
			for (int i = 0; i < MemberController.existMemberNum; i++) {
				System.out.println(mc.printAll()[i].inform());
			}
		}
	}
}
