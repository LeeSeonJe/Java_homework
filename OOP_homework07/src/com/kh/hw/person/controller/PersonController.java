package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	Student[] s = new Student[3];
	Employee[] e = new Employee[10];
	int[] count;

	public int[] personCount() {
		int num = 0;
		count = new int[2];
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				num++;
				count[0] = num;
			}
		}
		num = 0;
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				num++;
				count[1] = num;
			}
		}
		return count;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		s[count[0]] = new Student(name, age, height, weight, grade, major);
	}

	public Student[] printStudent() {
		return s;
	}

	public void inserEmployee(String name, int age, double height, double weight, int salary, String dept) {
		e[count[1]] = new Employee(name, age, height, weight, salary, dept);
	}

	public Employee[] printEmployee() {
		return e;
	}

}
