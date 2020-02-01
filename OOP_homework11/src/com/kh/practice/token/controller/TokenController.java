package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {
		// TODO Auto-generated constructor stub
	}

	public String afterToken(String str) {
		String afterStr = "";
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
			afterStr += st.nextToken();
//			afterStr.concat(st);
//			concat 안에 넣을수 있는 값은 String이다 
//			st는 StringTokenizer 이기 때문에 불가능
		}
		return afterStr;
	}

	public String firstCap(String input) {
		String cap = "";
		char lCh = input.charAt(0);
		char uCh = (char) (lCh - 32);
		cap = input.substring(0, 1).replace(lCh, uCh);
		return cap + input.substring(1);
	}

	public int findChar(String input, char one) {
		String[] test = input.split("");
		int count = 0;
		for (String s : test) {
			if (s.charAt(0) == one) {
				count++;
			}
		}
		return count;
	}
}
