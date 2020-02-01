package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	LeapController lc = new LeapController();

	public LeapView() {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		if (lc.isLeapYear(year)) {
			System.out.println(year + "���� �����Դϴ�.");
		} else {
			System.out.println(year + "���� ����Դϴ�.");
		}
		System.out.println("�� ��¥ �� : " + lc.leapDate(c));
	}
}
