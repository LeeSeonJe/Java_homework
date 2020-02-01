package com.kh.practice.chap_abstract.controller;

import com.kh.practice.chap_abstract.model.vo.Animal;
import com.kh.practice.chap_abstract.model.vo.Cat;
import com.kh.practice.chap_abstract.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] a = new Animal[5];
		a[0] = new Cat("���", "�����", "����", "���");
		a[1] = new Dog("���", "������", 3);
		a[2] = new Dog("����", "������", 2);
		a[3] = new Cat("�η�", "�����", "����", "������");
		a[4] = new Dog("���", "������", 1);

		for (int i = 0; i < a.length; i++) {
			a[i].speak();
		}
	}
}
