package com.kh.practice.poly.controller;

import com.kh.practice.poly.model.vo.AniBook;
import com.kh.practice.poly.model.vo.Book;
import com.kh.practice.poly.model.vo.CookBook;
import com.kh.practice.poly.model.vo.Member;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5];

	{
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
	}

	public void insertMember(Member mem) {
		this.mem = mem;
		// �Ѱܹ��� mem�� LibraryControllerŬ������ mem�� ����
	}

	public Member myInfo() {
		return mem;
		// ������ Member�� mem�� �Ѱ���
	}

	public Book[] selectAll() {
		return bList;
	}

	public Book[] searchBook(String keyword) {
		int count = -1;
		Book[] searchBook = new Book[5];
		for (int i = 0; i < bList.length; i++) {
			if (bList[i].getTitle().contains(keyword)) {
				count++;
				searchBook[count] = bList[i];
			}
		}
		return searchBook;
	}

	public int rentBook(int index) {
		int result = 0;
		if (bList[index] instanceof CookBook && ((CookBook) bList[index]).getCoupon() == true) {
			result = 2;
			mem.setCouponCount(mem.getCouponCount() + 1);
		} else if (bList[index] instanceof AniBook && ((AniBook) bList[index]).getAccessAge() > mem.getAge()) {
			result = 1;
		}
		return result;
	}
}
