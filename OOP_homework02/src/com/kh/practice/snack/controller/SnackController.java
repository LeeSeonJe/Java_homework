package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	Snack s = new Snack();

	public SnackController() {

	}

	public String saveDate(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "���� �Ϸ�Ǿ����ϴ�.";
	}

	public String confirmDate() {
		return s.information();
	}
}
