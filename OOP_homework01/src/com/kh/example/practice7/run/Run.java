package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee ee = new Employee();
		ee.setEmpNo(100);
		ee.setEmpName("홍길동");
		ee.setDept("영업부");
		ee.setJob("과장");
		ee.setAge(25);
		ee.setGender('남');
		ee.setSalary(2500000);
		ee.setBonusPoint(0.05);
		ee.setPhone("010-1234-5678");
		ee.setAddress("서울시 강남구");
		
//		ee = new Employee(100, "홍길동", dept, job, age, gender, salary, bonusPoint, phone, address)

		System.out.println(ee.getEmpNo() + " " + ee.getEmpName() + " " + ee.getDept() + " " + ee.getJob() + " "
				+ ee.getAge() + " " + ee.getGender() + " " + ee.getSalary() + " " + ee.getBonusPoint() + " "
				+ ee.getPhone() + " " + ee.getAddress() + " ");
	}
}
