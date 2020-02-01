package com.kh.practice.chap_abstract.controller;

import com.kh.practice.chap_abstract.model.vo.Animal;
import com.kh.practice.chap_abstract.model.vo.Cat;
import com.kh.practice.chap_abstract.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] a = new Animal[5];
		a[0] = new Cat("고고", "고양이", "서울", "흰색");
		a[1] = new Dog("노노", "강아지", 3);
		a[2] = new Dog("도도", "강아지", 2);
		a[3] = new Cat("로로", "고양이", "강원", "검정색");
		a[4] = new Dog("모모", "강아지", 1);

		for (int i = 0; i < a.length; i++) {
			a[i].speak();
		}
	}
}
