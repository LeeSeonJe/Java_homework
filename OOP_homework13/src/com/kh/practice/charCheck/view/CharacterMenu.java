package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	CharacterController cc = new CharacterController();
	Scanner sc = new Scanner(System.in);

	public void menu() {
		System.out.print("문자열 : ");
		String s = sc.nextLine();
		try {
			System.out.println(s + "에 포함된 영문자 개수 : " + cc.countAlpha(s));
		} catch (CharCheckException cce) {
			cce.printStackTrace();
			cce.getMessage();
		}
	}
}
