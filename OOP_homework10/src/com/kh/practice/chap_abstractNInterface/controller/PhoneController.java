package com.kh.practice.chap_abstractNInterface.controller;

import com.kh.practice.chap_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap_abstractNInterface.model.vo.SmartPhone;
import com.kh.practice.chap_abstractNInterface.model.vo.V40;

public class PhoneController {
	String[] result = new String[2];

	public String[] method() {
		SmartPhone[] sp = new SmartPhone[2];
		sp[0] = new GalaxyNote9();
		sp[1] = new V40();
		for (int i = 0; i < sp.length; i++) {
			if (sp[i] instanceof GalaxyNote9) {
				result[0] = sp[i].printlnformtion();
			} else if (sp[i] instanceof V40) {
				result[1] = sp[i].printlnformtion();
			}
		}
		return result;
	}
}