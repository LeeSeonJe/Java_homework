package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	CharacterController cc = new CharacterController();
	Scanner sc = new Scanner(System.in);

	public void menu() {
		System.out.print("���ڿ� : ");
		String s = sc.nextLine();
		try {
			System.out.println(s + "�� ���Ե� ������ ���� : " + cc.countAlpha(s));
		} catch (CharCheckException cce) {
			cce.printStackTrace();
			cce.getMessage();
		}
	}
}
