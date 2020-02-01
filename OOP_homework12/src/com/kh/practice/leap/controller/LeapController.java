package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		return false;
	}

	public long leapDate(Calendar c) {
		long sum = 0;
		for (int i = 1; i < c.get(Calendar.YEAR); i++) {
			if (isLeapYear(i)) {
				sum += 366;
			} else {
				sum += 365;
			}
		}
		return sum + c.get(Calendar.DATE);
	}
}
